package vip.yingmen.template;

import javax.persistence.criteria.JoinType;
import javax.persistence.metamodel.SingularAttribute;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.jpa.domain.Specification;


public class QueryJpaTplService<T> {
	 
    
	  
	    
	    public static <T> Specification<T>  setIsDelQuery(Specification<T> spec) {
	    	return  spec.and((root, query, builder) ->{
	    		 return builder.equal(root.get(Constants.IS_DEL_KEY).as(Boolean.class),Boolean.FALSE);}
			 );
		}

	    public static  String wrapLikeQuery(String txt) {
	        return "%" + txt + '%';
	    }
	    
	    public static <T,Y> Specification<T>   like(Specification<T> spec
	    		,SingularAttribute<T, String> attribute
	    		,String queryTxt) {
	    	if (StringUtils.isNotBlank(queryTxt)) {
	    		return spec.and( (root, query, builder) ->
					builder.like(root.get(attribute), QueryJpaTplService.wrapLikeQuery(queryTxt))
		    	 );
			}
	    	return spec;
		}
	    public static <T,Y> Specification<T>   like(Specification<T> spec
	    		,SingularAttribute<T, Y> attributeJoin
	    		,SingularAttribute<Y, String> attribute
	    		,String queryTxt) {
	    	if (StringUtils.isNotBlank(queryTxt)) {
	    		return  spec.and( (root, query, builder) ->
					builder.like(root.join(attributeJoin, JoinType.LEFT).get(attribute), QueryJpaTplService.wrapLikeQuery(queryTxt))
		    	 );
			}
	    	return spec;
		}
	    public static <T,Y> Specification<T>  equal(Specification<T> spec
	    		,SingularAttribute<T, Y> attribute
	    		,Y equalValue) {
	    	if (equalValue instanceof String && StringUtils.isBlank(equalValue.toString()) ) {
			    	return spec;
			}
		    if (equalValue==null) {
		    		return spec;
			}
		    return spec.and( (root, query, builder) ->
	     		builder.equal(root.get(attribute),equalValue)
	     		);

		}
	    public static <T,Y,Z> Specification<T>  equal(Specification<T> spec
	    		,SingularAttribute<T, Y> attributeJoin
	    		,SingularAttribute<Y, Z> attribute
	    		,Z equalValue) {
	    	if (equalValue instanceof String && StringUtils.isBlank(equalValue.toString()) ) {
	    		return spec;
			}
		    if (equalValue==null) {
		    	return spec;
			}
	    	
		    return  spec.and( (root, query, builder) ->
				builder.equal(root.join(attributeJoin, JoinType.LEFT).get(attribute),equalValue)
	    	 );
		}
	    
	    
	    
//	    public static <T> void  betweenInstantByLocalDate(Specification<T> spec
//	    		,SingularAttribute<T, Instant> attribute
//	    		,String valueStart,String valueEnd) {
//  	    	 if (StringUtils.isNotBlank(valueStart)) {
//	    		 LocalDate start = LocalDate.parse(valueStart);
//	    		 QueryJpaTplService.greaterThanOrEqualTo(spec, attribute,  start.atStartOfDay(ZoneId.systemDefault()).toInstant());
//			 }
//	    	 if (StringUtils.isNotBlank(valueEnd)) {
//	    		 LocalDate end = LocalDate.parse(valueStart);
//	    		 QueryJpaTplService.lessThanOrEqualTo(spec,attribute, end.atStartOfDay(ZoneId.systemDefault()).plusDays(1).toInstant());
//	    	 }
//	      
//	    }
	    
	    public static <T,Y  extends Comparable<? super Y>> Specification<T>  greaterThanOrEqualTo(Specification<T> spec
	    		,SingularAttribute<T, Y> attribute
	    		,Y value) {
	    	if (value!=null) {
		    	return  spec.and( (root, query, builder) ->
					builder.greaterThanOrEqualTo(root.get(attribute),value)
		    	 );
			}
	    	return spec;
	    }
	    
	    public static <T,Y  extends Comparable<? super Y>> Specification<T>  lessThanOrEqualTo(Specification<T> spec
	    		,SingularAttribute<T, Y> attribute
	    		,Y value) {
	    	if (value!=null) {
	    		return spec.and( (root, query, builder) ->
					builder.lessThanOrEqualTo(root.get(attribute),value)
		    	 );
			}
	    	return spec;
	    }
}
