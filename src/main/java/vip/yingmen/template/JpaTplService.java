package vip.yingmen.template;

import java.time.Instant;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springside.modules.utils.reflect.ReflectionUtil;

import vip.yingmen.security.SecurityUtils;
import vip.yingmen.web.rest.errors.ReqErrorException;


public class JpaTplService<T> {
	 
    
	    private final JpaRepository<T, Long> repository;
	    private final Class<T> targetClass;
	    
	    private JpaTplService(JpaRepository<T, Long> repository,Class<T> targetClass) {
			super();
			this.repository = repository;
			this.targetClass=targetClass;
		}
		
	    public static <T> JpaTplService<T> getInstance(JpaRepository<T, Long> repository,Class<T> targetClass) {
			return new JpaTplService<T>(repository, targetClass);
		}
		
	    public static String getLogin() {
	    	return  SecurityUtils.getCurrentUserLogin().orElseThrow(()-> new ReqErrorException("未登录"));
	    }
	    

		public T saveAndCopy(Object source,Consumer<T> saveBefore,Consumer<T> addAfter) {
			 Long id = ReflectionUtil.invokeGetter(source, "id");
			 T target = null;
			 if (id == null) {
				    target = BeanCopierMapper.newInstance(targetClass);
		     }else {
		    	 target = getOne(id);
		     }
			 BeanCopierMapper.copyObject(source, target);
			 if (saveBefore!=null) {
				 saveBefore.accept(target);
			 }
			 if (id == null) {
				 ReflectionUtil.setFieldValue(target, Constants.C_TIME_KEY, Instant.now());
				 ReflectionUtil.setFieldValue(target, Constants.creator_KEY, getLogin());
				 setIsDelQuery(target);
		     }
			 ReflectionUtil.setFieldValue(target, Constants.UP_TIME_KEY, Instant.now());
			 ReflectionUtil.setFieldValue(target, Constants.modifier_KEY, getLogin());
			 target =  repository.save(target);
			 if (addAfter!=null) {
				 addAfter.accept(target);
				 target =  repository.save(target);
			 }
			return target;
	   }
		
		public T saveAndCopy(Object source) {
			return saveAndCopy(source, null, null);
	    }		
		public T saveAndCopy(Object source,Consumer<T> saveBefore) {
			return saveAndCopy(source, saveBefore, null);
	    }		
			

		public T updateAndCopy(Long id,Object source,Consumer<T> saveBefore,Consumer<T> addAfter) {
			 T target = getOne(id);
			 BeanCopierMapper.copyObject(source, target);
			 if (saveBefore!=null) {
				 saveBefore.accept(target);
			 }
			 ReflectionUtil.setFieldValue(target, Constants.modifier_KEY, getLogin());
			 ReflectionUtil.setFieldValue(target, Constants.UP_TIME_KEY, Instant.now());
			 target =  repository.save(target);
			 if (addAfter!=null) {
				 addAfter.accept(target);
				 target =  repository.save(target);
			 }
			return target;
	   }
		
		public T updateAndCopy(Long id,Object source) {
			return updateAndCopy(id,source, null, null);
	    }		
		public T updateAndCopy(Long id,Object source,Consumer<T> saveBefore) {
			return updateAndCopy(id,source, saveBefore, null);
	    }	
		
		
		
		    

		 public T saveEntity( T entity) {
	    	 Long id = ReflectionUtil.invokeGetter(entity, "id");
			 if (id == null) {
				 ReflectionUtil.setFieldValue(entity, Constants.C_TIME_KEY, Instant.now());
				 ReflectionUtil.setFieldValue(entity, Constants.creator_KEY, getLogin());
				 setIsDelQuery(entity);
		     }
			 ReflectionUtil.setFieldValue(entity, Constants.UP_TIME_KEY, Instant.now());
			 ReflectionUtil.setFieldValue(entity, Constants.modifier_KEY, getLogin());
			 entity =  repository.save(entity);
			return entity;
	    }
		
		 public void deleteData( Long id) {
		    	repository.findById(id).ifPresent(var->{
		    		 ReflectionUtil.setFieldValue(var, Constants.IS_DEL_KEY, Constants.isDel);
		    		 repository.save(var);
		    	});
		  }
		 public void deleteData(Set<Long>  ids) {
			 for (Long id : ids) {
			    	repository.findById(id).ifPresent(var->{
			    		 ReflectionUtil.setFieldValue(var, Constants.IS_DEL_KEY, Constants.isDel);
			    		 repository.save(var);
			    	});
			}
		  } 
		 
		 
	    public T getOne(Long id) {
			return this.repository.findById(id).orElseThrow(()-> new ReqErrorException("ID 错误"));
		}
	    
	    public Page<T> findPageByExample(T probe, Pageable pageable) {
	    	  setIsDelQuery(probe);
			return this.repository.findAll(Example.of(probe), pageable);
		}
	
	    public List<T> findListByExample(T probe) {
	    	 setIsDelQuery(probe);
			return this.repository.findAll(Example.of(probe));
		}
	    public <S> List<S> findListByExample(T probe, Function<T,S> mapper) {
	    	 setIsDelQuery(probe);
	  		return this.repository.findAll(Example.of(probe)).stream().map(mapper).collect(Collectors.toList());
	  	}
	    
		private void setIsDelQuery(T probe) {
			ReflectionUtil.setFieldValue(probe, Constants.IS_DEL_KEY, Constants.noDel);
		}


	
	    

}
