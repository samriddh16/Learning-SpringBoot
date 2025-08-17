package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariDataSource;

@Configuration("real")
@ComponentScan(basePackages = "com")
@ImportResource(locations = "com/cnfgs/applicationContext.xml")
@PropertySource("com/commons/daoInfo.properties")
public class RealtimeProjConfig {

	/*@Value("${datasource.class}")
	private String driver;
	@Value("${datasource.url}")
	private String url;
	@Value("${datasource.username}")
	private String user;
	@Value("${datasource.password}")
	private String pass;
	@Value("${datasource.minidle}")
	private int idle;
	@Value("${datasource.poolsize}")
	private int pool;
	@Value("${datasource.idletimeout}")
	private int time;
	
	@Bean("hikariCp")
	public HikariDataSource getHikari() {
		HikariDataSource hkd = new HikariDataSource();
		hkd.setDriverClassName(driver);
		hkd.setJdbcUrl(url);
		hkd.setUsername(user);
		hkd.setPassword(pass);
		hkd.setMinimumIdle(idle);
		hkd.setMaximumPoolSize(pool);
		hkd.setIdleTimeout(time);*/
		
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
