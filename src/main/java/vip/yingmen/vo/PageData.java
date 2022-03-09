package vip.yingmen.vo;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.data.domain.Page;

import io.swagger.annotations.ApiModelProperty;

public class PageData<T> {
	public List<T> list;
	 @ApiModelProperty("总数（分页专用）")
	public Long totalCount = 0L;
	 
	 @ApiModelProperty("总页数（分页专用）")
	public Integer totalPages = 0;
	 
	 @ApiModelProperty("当前页数（分页专用）")
		public Integer page = 0;
	 
	 @ApiModelProperty("分页大小（分页专用）")
		public Integer size = 0;
	 
	 
	 public static <T> PageData<T> getInstance(  List<T> list , Long totalCount , Integer page  ,Integer size) {
		 PageData<T> pageData = new PageData<>();
		 pageData.list = list;
		 pageData.totalCount = totalCount;
		 pageData.totalPages = totalCount.intValue()/size;
		 pageData.page =  page;
		 pageData.size =  size;
			return pageData;
	}
	 
	 public static <T> PageData<T> getInstance(  Stream<T> stream , Long totalCount , Integer page  ,Integer size) {
		 PageData<T> pageData = new PageData<>();
		 pageData.list = stream.collect(Collectors.toList());
		 pageData.totalCount = totalCount;
		 pageData.totalPages = totalCount.intValue()/size;
		 pageData.page =  page;
		 pageData.size =  size;
			return pageData;
	}
	 
	
	 public static <T> PageData<T> getInstance( Page<T> page) {
		 PageData<T> pageData = new PageData<>();
		 pageData.list = page.getContent();
		 pageData.totalCount = page.getTotalElements();
		 pageData.totalPages = page.getTotalPages();
		 pageData.page =  page.getPageable().getPageNumber();
		 pageData.size =  page.getPageable().getPageSize();
			return pageData;
	}
	 
	 public static <T, R> PageData<T> getInstance( Page<R> page,Function<R,T> mapper) {
		 PageData<T> pageData = new PageData<>();
		 pageData.list = page.getContent()
				 	.stream()
				 	.map(mapper)
	        		.collect(Collectors.toList());
		 pageData.totalCount = page.getTotalElements();
		 pageData.totalPages = page.getTotalPages();
		 pageData.page =  page.getPageable().getPageNumber();		 
		 pageData.size =  page.getPageable().getPageSize();
			return pageData;
	}
}
