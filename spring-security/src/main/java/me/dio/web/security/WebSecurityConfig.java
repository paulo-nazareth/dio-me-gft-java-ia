package me.dio.web.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	/*Substituir configuração Simples realizada no application.properties*/
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("User")
			.password("{noop}user123")
			.roles("USERS")
			.and()
			.withUser("admin")
			.password("{noop}master123")
			.roles("MANAGERS");
		
		/* Implementações de Criptografias utilizadas pelo Spring Security: 
		 * {bcrypt} BCruptPasswordEncoder (mais comum)
		 * {noop} NoOpPasswordEncoder
		 * {pbkdf2} Pbkdf2PasswordEncoder
		 * {script} SCryptPasswordEncoder
		 * {sha256} StandardPasswordEncoder
		 * */
	}
}
