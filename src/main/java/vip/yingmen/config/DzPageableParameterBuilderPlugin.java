package vip.yingmen.config;

import java.util.List;

import com.fasterxml.classmate.TypeResolver;

import io.github.jhipster.config.apidoc.PageableParameterBuilderPlugin;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.schema.ModelReference;
import springfox.documentation.schema.TypeNameExtractor;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.service.contexts.ParameterContext;

public class DzPageableParameterBuilderPlugin extends PageableParameterBuilderPlugin {

  
	/** Constant <code>DEFAULT_PAGE_NAME="page"</code> */
    public static final String DEFAULT_PAGE_NAME = "page";
    /** Constant <code>PAGE_TYPE="query"</code> */
    public static final String PAGE_TYPE = "query";
    /** Constant <code>PAGE_DESCRIPTION="Page number of the requested page"</code> */
    public static final String PAGE_DESCRIPTION = "页码，从0开始；默认 0";

    /** Constant <code>DEFAULT_SIZE_NAME="size"</code> */
    public static final String DEFAULT_SIZE_NAME = "size";
    /** Constant <code>SIZE_TYPE="query"</code> */
    public static final String SIZE_TYPE = "query";
    /** Constant <code>SIZE_DESCRIPTION="Size of a page"</code> */
    public static final String SIZE_DESCRIPTION = "分页大小，默认 20";

    /** Constant <code>DEFAULT_SORT_NAME="sort"</code> */
    public static final String DEFAULT_SORT_NAME = "sort";
    /** Constant <code>SORT_TYPE="query"</code> */
    public static final String SORT_TYPE = "query";
    /** Constant <code>SORT_DESCRIPTION="Sorting criteria in the format: propert"{trunked}</code> */
    public static final String SORT_DESCRIPTION = "排序参数格式: 属性(,asc|desc). "
        + "默认排序顺序为升序. "
        + "支持多种排序标准.";

    private final TypeResolver resolver;
//    private final ResolvedType pageableType;
    public DzPageableParameterBuilderPlugin(TypeNameExtractor nameExtractor, TypeResolver resolver) {
    	super(nameExtractor, resolver);
    	  this.resolver = resolver;
//          this.pageableType = resolver.resolve(Pageable.class);
  	
  		// TODO Auto-generated constructor stub
  	}


    @Override
    protected Parameter createPageParameter(ParameterContext context) {
        ModelReference intModel = createModelRefFactory(context).apply(resolver.resolve(Integer.TYPE));
        return new ParameterBuilder()
            .name(getPageName())
            .parameterType(PAGE_TYPE)
            .modelRef(intModel)
            .description(PAGE_DESCRIPTION)
            .build();
    }

    /**
     * Create a size parameter.
     * Override it if needed. Set a default value for example.
     *
     * @param context {@link org.springframework.data.domain.Pageable} parameter context
     * @return The size parameter
     */
    @Override
    protected Parameter createSizeParameter(ParameterContext context) {
        ModelReference intModel = createModelRefFactory(context).apply(resolver.resolve(Integer.TYPE));
        return new ParameterBuilder()
            .name(getSizeName())
            .parameterType(SIZE_TYPE)
            .modelRef(intModel)
            .description(SIZE_DESCRIPTION)
            .build();
    }

    /**
     * Create a sort parameter.
     * Override it if needed. Set a default value or further description for example.
     *
     * @param context {@link org.springframework.data.domain.Pageable} parameter context
     * @return The sort parameter
     */
    @Override
    protected Parameter createSortParameter(ParameterContext context) {
        ModelReference stringModel = createModelRefFactory(context).apply(resolver.resolve(List.class, String.class));
        return new ParameterBuilder()
            .name(getSortName())
            .parameterType(SORT_TYPE)
            .modelRef(stringModel)
            .allowMultiple(true)
            .description(SORT_DESCRIPTION)
            .build();
    }



}
