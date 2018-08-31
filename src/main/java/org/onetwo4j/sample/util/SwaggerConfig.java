package org.onetwo4j.sample.util;

import org.onetwo4j.sample.WebApplicationStarter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ClassUtils;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/***
 * swagger-ui.html
 * 
 * @author wayshall
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
	            .apis(RequestHandlerSelectors.basePackage(ClassUtils.getPackageName(WebApplicationStarter.class)))
//	            .paths(PathSelectors.regex("/api/.*"))
	            .paths(PathSelectors.any())
            .build()
            .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "swagger api",
                "sample service REST API",
                "1.0",
                "termsOfServiceUrl",
                        "way",
                "API License",
                "API License URL"
        );
        return apiInfo;
    }
}
