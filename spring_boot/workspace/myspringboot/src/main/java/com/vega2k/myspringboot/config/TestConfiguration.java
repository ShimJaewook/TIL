package com.vega2k.myspringboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("test")
@Configuration
//@Component
public class TestConfiguration {
	
	@Bean
	public String hello() {
		return "현재는 테스트 Mode 입니다";
	}
	
}