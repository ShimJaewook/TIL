package com.vega2k.adminserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class BootadminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootadminServerApplication.class, args);
	}

}
