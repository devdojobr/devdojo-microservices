package academy.devdojo.youtube.core.docs;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author William Suane
 */
public class BaseSwaggerConfig {
    private final String basePackage;

    public BaseSwaggerConfig(String basePackage) {
        this.basePackage = basePackage;
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage(basePackage))
                .build()
                .apiInfo(metaData());
    }

    private ApiInfo metaData() {
        return new ApiInfoBuilder()
                .title("Another Awesome course from DevDojo <3 Spring Boot Microservices")
                .description("Everybody is a Jedi now")
                .version("1.0")
                .contact(new Contact("William Suane as the Jedi Master", "http://devdojo.academy", "william.suane@devdojo.academy"))
                .license("Private stuff bro, belongs to DevDojo")
                .licenseUrl("http://devdojo.academy")
                .build();
    }
}
