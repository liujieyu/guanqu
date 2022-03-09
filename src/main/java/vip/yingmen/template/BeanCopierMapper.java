package vip.yingmen.template;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;


import net.sf.cglib.beans.BeanCopier;
import vip.yingmen.web.rest.errors.ReqErrorException;

public class BeanCopierMapper {
 	//使用缓存提高效率
	
	
  
    private static final ConcurrentHashMap<String, BeanCopier> MAP_CACHES_NO_USE_CONVERTER = new ConcurrentHashMap<>();
    
    public static <S, D> List<D> copyObjectList(List<S> sourceList, Class<D> targetClass) {
       return sourceList.stream()
    		   .map(var->BeanCopierMapper.copyObject(var, targetClass))
    		   .collect(Collectors.toList());
    		   
    } 
    
    public static <S, D> void copyObject(S source, D target) {
        BeanCopier copier = getBeanCopierNoUseConverter(source.getClass(), target.getClass());
        copier.copy(source, target, null);
    }
    public static <S, D> D copyObject(S source, Class<D> targetClass) {
   	    BeanCopier copier = getBeanCopierNoUseConverter(source.getClass(),targetClass);
   	    D target = newInstance(targetClass);
        copier.copy(source, target, null);
        return target;
    }
	private static <S, D> BeanCopier getBeanCopierNoUseConverter(Class<S> source,Class<D> target) {
		String baseKey = new StringBuilder()
				 .append(source.toString())
				 .append(target.toString())
				 .toString();
        BeanCopier copier;
        if (!MAP_CACHES_NO_USE_CONVERTER.containsKey(baseKey)) {
            copier = BeanCopier.create(source, target, false);
            MAP_CACHES_NO_USE_CONVERTER.put(baseKey, copier);
        } else {
            copier = MAP_CACHES_NO_USE_CONVERTER.get(baseKey);
        }
		return copier;
	}
	
	
    
    

	
    public static <T> T newInstance( Class<T> targetClass) {
		try {
			return   targetClass.getDeclaredConstructor().newInstance();
		} catch (Exception e) {
		    throw new ReqErrorException("BeanCopierMapper->"+targetClass.getSimpleName()+" 创建对象异常 " + e.getMessage());
		}
	}
}
