package vip.yingmen.template;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springside.modules.utils.mapper.JsonMapper;
import org.springside.modules.utils.reflect.ReflectionUtil;

import com.google.common.collect.Sets;

public class BeanTool {
	public static <T> T getEntityOnlyHasId(Long id,Class<T> entityClass) {
		T entity =  BeanCopierMapper.newInstance(entityClass);
		ReflectionUtil.setFieldValue(entity, "id", id);
		return entity;
	}
	
	@SuppressWarnings("unchecked")
	public static List<String> jsonToLIst(String value) {
		return JsonMapper.INSTANCE.fromJson(value, List.class);
	}
	
	
	
	public static <T>  Set<T> getEntitySetOnlyHasId(Set<Long> idSet,Class<T> entityClass) {
		return idSet.stream().map(var->{  
			 return BeanTool.getEntityOnlyHasId(var, entityClass);
		}).collect(Collectors.toSet());
	}
	
	
	public static <T>  Set<T> getEntitySetOnlyHasId(Class<T> entityClass, Long... ids) {
		return getEntitySetOnlyHasId(Sets.newHashSet(ids), entityClass);
	}

}
