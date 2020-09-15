package com.vega2k.myspringboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
//@Component
@Configuration
public class ProdConfiguration {
	
	@Bean
	public String hello() {
		return "현재는 운영 Mode 입니다.";
	}
}
