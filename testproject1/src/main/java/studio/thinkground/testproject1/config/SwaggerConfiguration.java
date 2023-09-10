package studio.thinkground.testproject1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/*
 * @package : studio.thinkground.testproject1.config
 * @name : SwaggerConfiguration.java
 * @date : 2022-01-28 오후 4:34
 * @author : Flature
 * @version : 1.0.0
 **/

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    private static final String API_NAME = "Test Spring Application";
    private static final String API_VERSION = "1.0.0";
    private static final String API_DESCRIPTION = "테스트 스프링 부트 애플리케이션입니다.";

    //http://localhost:8080/swagger-ui/index.html
    @Bean
    public Docket api() {
        /*
        Parameter parameterBuilder = (Parameter) new ParameterBuilder()
                .name(HttpHeaders.AUTHORIZATION)
                .description("Access Tocken")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .required(false)
                .build();

        List<Parameter> globalParameters = new ArrayList<>();
        globalParameters.add(parameterBuilder);
        */
        return new Docket(DocumentationType.OAS_30)
                //.globalOperationParameters(globalParameters)
                .useDefaultResponseMessages(true)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("studio.thinkground.testproject1"))
                .paths(PathSelectors.any())
                .build();
    }

    public ApiInfo apiInfo() { //apiinfo중 일부분만 사용하기위해 빌더 따로 생성
        return new ApiInfoBuilder()
                .title(API_NAME)
                .version(API_VERSION)
                .description(API_DESCRIPTION)
                .build();
    }
}