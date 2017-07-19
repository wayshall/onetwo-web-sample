package org.onetwo4j.sample.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
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
	            .apis(RequestHandlerSelectors.basePackage("org.onetwo4j.sample"))
	            .paths(PathSelectors.regex("/api/.*"))
            .build()
            .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
            "onetwo4j web sample",
            "onetwo4j web sample REST API",
            "1.0",
            "termsOfServiceUrl",
            new Contact(
                    "wayshall",
                    "http://github.com/wayshall",
                    "wayshall@qq.com"),
            "API License",
            "API License URL"
        );
        return apiInfo;
    }
}
