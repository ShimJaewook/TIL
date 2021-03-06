package com.vega2k.myspringboot.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.vega2k.myspringboot.property.Vega2kProperties;

// 스프링 빈으로 등록하기 위해 컴포넌트 어노테이션 사용
@Component
// Runner는 여러개를 만들 수 있다. 우선순위(order)를 줄 수 있다.
@Order(2)
public class MyRunner implements ApplicationRunner{

	@Value("${vega2k.name}")
	String name;
	
	@Autowired
	private Vega2kProperties property;
	
	@Value("${vega2k.age}")
	int age;
	
	@Autowired
	private String hello;
	
	private Logger logger = LoggerFactory.getLogger(MyRunner.class);
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("===>>>> start Info Mode에서만 출력됩니다. ");
		logger.debug("Profile : " + hello );
		logger.debug("vega2k.name : " + hello);
		logger.debug("vega2k.age : " + property.getAge());
		logger.debug("vega2k.fullName : " + property.getFullName());
		logger.info("===>>>> end Info Mode에서만 출력됩니다. ");
	}
	
}
