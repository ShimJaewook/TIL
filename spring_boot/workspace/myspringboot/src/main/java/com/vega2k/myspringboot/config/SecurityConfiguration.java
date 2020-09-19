package com.vega2k.myspringboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests()
			.antMatchers("/mypage/**").authenticated()
			.antMatchers("/**").permitAll()
			.and()
			.formLogin()
			.and()
			.httpBasic()
			.and()
			.logout()
			.logoutUrl("/app-logout")
			.deleteCookies("JSESSIONID")
			.logoutSuccessUrl("/");
	}
}
