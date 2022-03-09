package vip.yingmen.template;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springside.modules.utils.reflect.ReflectionUtil;

import io.github.jhipster.web.util.PaginationUtil;
import io.swagger.annotations.ApiOperation;
import vip.yingmen.repository.WebUserRepository;
import vip.yingmen.web.rest.errors.ReqErrorException;

/**
 * @author 冯志强
 *   	 增删改查模板
 * @param <T> 数据库实体
 * @param <S> 更新实体
 */
public abstract class CrudTplApi<T,S> {


	@Autowired protected JpaRepository<T, Long> repository;
	@Autowired protected WebUserRepository webUserRepository;
	
	protected abstract  Class<T> getTargetClass();
	
	protected  JpaTplService<T> jpaTplService;

	    @PostConstruct
		   void init(){
	    	jpaTplService = JpaTplService.getInstance(repository,getTargetClass());
	    }
	
	 protected abstract void saveBefore(T enetiy,S saveVo);
	 
	 protected void setWebUserName(T entity) {
		 String creator = ReflectionUtil.getFieldValue(entity, Constants.creator_KEY);
    	 String modifier = ReflectionUtil.getFieldValue(entity, Constants.modifier_KEY);
    	 ReflectionUtil.setFieldValue(entity, Constants.creator_KEY,this.webUserRepository.queryNameByLogin(creator).orElse(creator));
    	 ReflectionUtil.setFieldValue(entity, Constants.modifier_KEY,this.webUserRepository.queryNameByLogin(modifier).orElse(modifier));
	 }
	 
	
	@PostMapping("/")
    @ApiOperation(value = "新增")
	@Transactional
    public ResponseEntity<T> add(@Valid @RequestBody S saveVo) throws URISyntaxException {
    	 Long id = ReflectionUtil.invokeGetter(saveVo, "id");
		 if (id != null) {
	            throw new ReqErrorException("Id 不能有值 ");
	        }
		 return  ResponseEntity.ok(jpaTplService.saveAndCopy(saveVo
				 		,var->this.saveBefore(var, saveVo)
				 ));
    }

	@PutMapping("/")
    @ApiOperation(value = "更新")
	@Transactional
    public ResponseEntity<T> update(@Valid @RequestBody S saveVo) throws URISyntaxException {
    	 Long id = ReflectionUtil.invokeGetter(saveVo, "id");
		 if (id == null) {
	            throw new ReqErrorException("Id 必须有值 ");
	        }
		 return  ResponseEntity.ok(jpaTplService.saveAndCopy(saveVo
			 		,var->this.saveBefore(var, saveVo)
			 ));
    }
  
    @GetMapping("/all-list")
    @ApiOperation(value = "列表(无查询条件)")
    public ResponseEntity<List<T>> getAllList() {
    	  T probe  = BeanCopierMapper.newInstance(getTargetClass());
        return ResponseEntity.ok(jpaTplService.findListByExample(probe));
    }
    @GetMapping("/all-page")
    @ApiOperation(value = "分页列表(无查询条件)")
    public ResponseEntity<List<T>> getAllPage(Pageable pageable) {
    	T probe  = BeanCopierMapper.newInstance(getTargetClass());
        Page<T> page = jpaTplService.findPageByExample(probe, pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(ServletUriComponentsBuilder.fromCurrentRequest(), page);
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }
    @GetMapping("/{id}")
    @ApiOperation(value = "查询")
    @Transactional(readOnly = true)
    public ResponseEntity<T> get(@PathVariable Long id) {
    	 T entity = repository.findById(id).orElseThrow(()-> new ReqErrorException("ID 错误"));
    	 this.setWebUserName(entity);
		 return ResponseEntity.ok(entity);
    }
    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除")
    @Transactional
    public ResponseEntity<Void> deleteData(@PathVariable Long id) {
    	jpaTplService.deleteData(id);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/batch")
    @ApiOperation(value = "批量删除")
    @Transactional
    public ResponseEntity<Void> batchDeleteData(@RequestBody Set<Long> ids) {
    	for (Long id : ids) {
    		jpaTplService.deleteData(id);
		}
        return ResponseEntity.ok().build();
    } 
}
