package me.dio.web.spring_web.doc;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * URL Swagger: http://localhost:8080/swagger-ui.html
 * */

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	private Contact contato() {
		return new Contact("Paulo H.", "localhost:8080", "phnazareth@gmail.com");
	}
	
	private ApiInfoBuilder informacoesApi() {
		ApiInfoBuilder infor = new ApiInfoBuilder();
		infor.title("Rest API");
		infor.description("API exemplo de uso do Springboot REST API");
		infor.version("1.0");
		infor.termsOfServiceUrl("Termo de uso: Open Source");
		infor.license("Licença - Sua Empresa");
		infor.licenseUrl("http://www.controleessencial.com.br");
		infor.contact(this.contato());
		return infor;
	}
	
	@Bean
	public Docket detalheApi() {
		Docket docket = new Docket(DocumentationType.SWAGGER_2);
		docket
			.select()
			.apis(RequestHandlerSelectors.basePackage("me.dio.web.spring_web.controller"))
			.paths(PathSelectors.any())
			.build()
			.apiInfo(this.informacoesApi().build())
			.consumes(new HashSet<String>(Arrays.asList("application/json")))
			.produces(new HashSet<String>(Arrays.asList("application/json")));
		return docket;
	}
}
