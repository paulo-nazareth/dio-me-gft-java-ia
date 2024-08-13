package dio.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringPrimeirosPassosApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SpringPrimeirosPassosApplication.class, args);
	}
	
	@Bean
	public String CommandLineRunner (ConversorJson conversor) throws Exception {
		String json = "{\"cep\": \"01001-000\",\"lougradouro\": \"Praça da Sé\",\"localidade\": \"Praça da Sé\"}";
		ViaCepResponse response = conversor.converter(json);
		System.out.println(response);
		return "Dados do CEP: " + response.toString();
	}

}
