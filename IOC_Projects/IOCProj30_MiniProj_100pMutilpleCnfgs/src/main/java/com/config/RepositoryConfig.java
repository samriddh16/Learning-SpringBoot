package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariDataSource;

@Configuration("repo")
@ComponentScan(basePackages = "com.dao")
@PropertySource("com/commons/daoInfo.properties")
public class RepositoryConfig {

	@Autowired
	private Environment env;
	
	@Bean("hikariCp")
	public HikariDataSource getHikari() {
		HikariDataSource hkd = new HikariDataSource();
		hkd.setDriverClassName(env.getProperty("datasource.class"));
		hkd.setJdbcUrl(env.getProperty("datasource.url"));
		hkd.setUsername(env.getProperty("datasource.username"));
		hkd.setPassword(env.getProperty("datasource.password"));
		hkd.setMinimumIdle(Integer.parseInt(env.getProperty("datasource.minidle")));
		hkd.setMaximumPoolSize(Integer.parseInt(env.getProperty("datasource.poolsize")));
		hkd.setIdleTimeout(Integer.parseInt(env.getProperty("datasource.idletimeout")));
	
		return hkd;
   }
}
