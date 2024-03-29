package com.vega2k.myspringboot.runner;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class DBRunner implements ApplicationRunner {

//	@Autowired
	private final DataSource dataSource;
	
	public DBRunner (DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	private Logger logger = LoggerFactory.getLogger(DBRunner.class);
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// DataSopurce 구현 클래스 이름 : com.zaxxer.hikari.HikariDataSource
		logger.debug("DataSource 구현 클래스 이름 : " + dataSource.getClass().getName());
	
		Connection connection = dataSource.getConnection();
		DatabaseMetaData dbMeta = connection.getMetaData();
		logger.debug("DB URL " + dbMeta.getURL());
		logger.debug("DB Username :" + dbMeta.getUserName());
	}
}
