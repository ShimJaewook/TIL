package com.vega2k.myspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyspringbootApplication {

	public static void main(String[] args) {
//		SpringApplication.run(MyspringbootApplication.class, args);
		SpringApplication application = new SpringApplication(MyspringbootApplication.class);
		//Application Type 설정
		application.setWebApplicationType(WebApplicationType.SERVLET);
//		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
	}
}
