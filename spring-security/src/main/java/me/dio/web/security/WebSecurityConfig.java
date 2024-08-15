package me.dio.web.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

import me.dio.web.config.SecurityDatabaseService;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private SecurityDatabaseService securityService;
	
	public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(securityService).passwordEncoder(NoOpPasswordEncoder.getInstance());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/").permitAll()
			.antMatchers(HttpMethod.POST, "/login").permitAll() //Restringir Método Verbo POST Opcional
			.antMatchers("/managers").hasAnyRole("MANAGERS")
			.antMatchers("/users").hasAnyRole("USERS","MANAGERS")
			.anyRequest().authenticated().and().httpBasic();
	}

	/*Substitui configuração Simples realizada no application.properties*/
	//Método Descontinuado para obteção dos dados através do banco de dados (SecurityDatabaseService)
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication()
//			.withUser("User")
//			.password("{noop}user123")
//			.roles("USERS")
//			.and()
//			.withUser("admin")
//			.password("{noop}master123")
//			.roles("MANAGERS");
		
		/* Implementações de Criptografias utilizadas pelo Spring Security: 
		 * {bcrypt} BCruptPasswordEncoder (mais comum)
		 * {noop} NoOpPasswordEncoder
		 * {pbkdf2} Pbkdf2PasswordEncoder
		 * {script} SCryptPasswordEncoder
		 * {sha256} StandardPasswordEncoder
		 * */
//	}
}
