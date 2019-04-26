package ugen.gestao.projectos.investimentos.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
public class InMemorySecurityConfig {
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder)
	throws Exception {
		
			builder
			.inMemoryAuthentication()
			.withUser("Hmeque").password("{noop}caher").roles("USER")
			.and()
			.withUser("Clauchande").password("{noop}cayon").roles("USER")
			;
	
	
	}

}
