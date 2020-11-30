package com.ichromanrd.app.springbootsqlite.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Component
public class Datasource {
	
	@Autowired
	Environment env;
	
	@Bean
	public DataSource dataSource() {
		final DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(env.getProperty("driverClassName"));
		ds.setUrl(env.getProperty("url"));
		ds.setUsername(env.getProperty("username"));
		ds.setPassword(env.getProperty("password"));
		return ds;
	}

}
