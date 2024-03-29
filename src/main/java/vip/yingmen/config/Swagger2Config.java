package vip.yingmen.config;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.resource.PathResourceResolver;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;
import org.springframework.web.util.UrlPathHelper;

import com.fasterxml.classmate.TypeResolver;

import io.github.jhipster.config.apidoc.PageableParameterBuilderPlugin;
import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.TypeNameExtractor;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.DocumentationCache;
import springfox.documentation.spring.web.json.Json;
import springfox.documentation.spring.web.json.JsonSerializer;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.ApiResourceController;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.swagger2.mappers.ServiceModelToSwagger2Mapper;
import springfox.documentation.swagger2.web.Swagger2Controller;
@Configuration
@Profile("dev")
@EnableSwagger2
public class Swagger2Config {
	  
	 @Bean
	    public Docket createRestApi() {
	        return new Docket(DocumentationType.SWAGGER_2)
	            .apiInfo(apiInfo())
	            .forCodeGeneration(true)
	            .directModelSubstitute(ByteBuffer.class, String.class)
	            .genericModelSubstitutes(ResponseEntity.class)
	            .ignoredParameterTypes(Pageable.class)
	            .select()
	            .apis(RequestHandlerSelectors.basePackage("vip.yingmen.web.rest"))
	            .paths(PathSelectors.any())
	            .build();
	    }

	    private ApiInfo apiInfo() {
	        return new ApiInfoBuilder()
	        	.title("灌区API")
	            .version("1.0")
	            .build();
	    }
	    
	    @Bean
	    public PageableParameterBuilderPlugin pageableParameterBuilderPlugin(TypeNameExtractor typeNameExtractor,
	                                                                         TypeResolver typeResolver) {
	    	DzPageableParameterBuilderPlugin  var 
	    		=  new DzPageableParameterBuilderPlugin(typeNameExtractor, typeResolver);
	    	return var;
	    }
	    
	    
	    
	    private static final String DEFAULT_PATH = "/guanqu";
	    
	    /**
	     * SwaggerUI资源访问
	     *
	     * @param servletContext
	     * @param order
	     * @return
	     * @throws Exception
	     */
	    @Bean
	    public SimpleUrlHandlerMapping swaggerUrlHandlerMapping(ServletContext servletContext,
	                                                            @Value("${swagger.mapping.order:10}") int order) throws Exception {
	        SimpleUrlHandlerMapping urlHandlerMapping = new SimpleUrlHandlerMapping();
	        Map<String, ResourceHttpRequestHandler> urlMap = new HashMap<>();
	        {
	            PathResourceResolver pathResourceResolver = new PathResourceResolver();
	            pathResourceResolver.setAllowedLocations(new ClassPathResource("META-INF/resources/webjars/"));
	            pathResourceResolver.setUrlPathHelper(new UrlPathHelper());
	 
	            ResourceHttpRequestHandler resourceHttpRequestHandler = new ResourceHttpRequestHandler();
	            resourceHttpRequestHandler.setLocations(Arrays.asList(new ClassPathResource("META-INF/resources/webjars/")));
	            resourceHttpRequestHandler.setResourceResolvers(Arrays.asList(pathResourceResolver));
	            resourceHttpRequestHandler.setServletContext(servletContext);
	            resourceHttpRequestHandler.afterPropertiesSet();
	            //设置新的路径
	            urlMap.put(DEFAULT_PATH + "/webjars/**", resourceHttpRequestHandler);
	        }
	        {
	            PathResourceResolver pathResourceResolver = new PathResourceResolver();
	            pathResourceResolver.setAllowedLocations(new ClassPathResource("META-INF/resources/"));
	            pathResourceResolver.setUrlPathHelper(new UrlPathHelper());
	 
	            ResourceHttpRequestHandler resourceHttpRequestHandler = new ResourceHttpRequestHandler();
	            resourceHttpRequestHandler.setLocations(Arrays.asList(new ClassPathResource("META-INF/resources/")));
	            resourceHttpRequestHandler.setResourceResolvers(Arrays.asList(pathResourceResolver));
	            resourceHttpRequestHandler.setServletContext(servletContext);
	            resourceHttpRequestHandler.afterPropertiesSet();
	            //设置新的路径
	            urlMap.put(DEFAULT_PATH + "/**", resourceHttpRequestHandler);
	        }
	        urlHandlerMapping.setUrlMap(urlMap);
	        //调整DispatcherServlet关于SimpleUrlHandlerMapping的排序
	        urlHandlerMapping.setOrder(order);
	        return urlHandlerMapping;
	    }
	 
	    /**
	     * SwaggerUI接口访问
	     */
	    @Controller
	    @ApiIgnore
	    @RequestMapping(DEFAULT_PATH)
	    @Profile("dev")
	    public static class SwaggerResourceController implements InitializingBean {
	 
	        @Autowired
	        private ApiResourceController apiResourceController;
	 
	        @Autowired
	        private Environment environment;
	 
	        @Autowired
	        private DocumentationCache documentationCache;
	 
	        @Autowired
	        private ServiceModelToSwagger2Mapper mapper;
	 
	        @Autowired
	        private JsonSerializer jsonSerializer;
	 
	        private Swagger2Controller swagger2Controller;
	 
	        @Override
	        public void afterPropertiesSet() {
	            swagger2Controller = new Swagger2Controller(environment, documentationCache, mapper, jsonSerializer);
	        }
	 
	        /**
	         * 首页
	         *
	         * @return
	         */
	        @RequestMapping
	        public ModelAndView index() {
	            ModelAndView modelAndView = new ModelAndView("redirect:" + DEFAULT_PATH + "/swagger-ui.html");
	            return modelAndView;
	        }
	 
	        @RequestMapping("/swagger-resources/configuration/security")
	        @ResponseBody
	        public ResponseEntity<SecurityConfiguration> securityConfiguration() {
	            return apiResourceController.securityConfiguration();
	        }
	 
	        @RequestMapping("/swagger-resources/configuration/ui")
	        @ResponseBody
	        public ResponseEntity<UiConfiguration> uiConfiguration() {
	            return apiResourceController.uiConfiguration();
	        }
	 
	        @RequestMapping("/swagger-resources")
	        @ResponseBody
	        public ResponseEntity<List<SwaggerResource>> swaggerResources() {
	            return apiResourceController.swaggerResources();
	        }
	 
	        @RequestMapping(value = "/v2/api-docs", method = RequestMethod.GET, produces = {"application/json", "application/hal+json"})
	        @ResponseBody
	        public ResponseEntity<Json> getDocumentation(
	                @RequestParam(value = "group", required = false) String swaggerGroup,
	                HttpServletRequest servletRequest) {
	            return swagger2Controller.getDocumentation(swaggerGroup, servletRequest);
	        }
	    }
	
    
}
