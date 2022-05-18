package com.example.demo.conf;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableGlobalMethodSecurity(jsr250Enabled=true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	DataSource dataSource;
	@Autowired
	BCryptPasswordEncoder encoder;
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
	/*	auth.inMemoryAuthentication()
		                      .withUser("india")
		                      .password(encoder.encode("India")).roles("ADMIN")
		                      .and().withUser("nepal")
		                      .password(encoder.encode("Nepal")).roles("GUEST");*/
		
		String sql="select u.username,a.authority from harish_authorities a,harish_user u  WHERE u.username=? AND u.username=a.username";
		auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery("select username,password,enable from harish_user where  username=?")
		.authoritiesByUsernameQuery(sql).passwordEncoder(encoder);
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub

		http.authorizeHttpRequests()
		    .antMatchers("/api/v1/**")
		     .authenticated()
		     .and()
		     .httpBasic();
	}

}
                                                          