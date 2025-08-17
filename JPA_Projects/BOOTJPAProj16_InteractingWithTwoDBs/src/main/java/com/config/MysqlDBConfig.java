package com.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

// When we are using multiple data sources, then Spring Boot disables auto-scanning of repositories 
// unless we explicitly tell it through @EnableJpaRepositories
// Remember we cannot keep two repository class in the same package because these config class we scan 
// that repository for two times and that creates some internal problem
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.repository.offers",
                                           entityManagerFactoryRef = "mysqlEMF",
                                           transactionManagerRef = "mysqlTxMgmr") 
public class MysqlDBConfig {

  //DataSource obj
  @Bean("mySQLDs")
  @ConfigurationProperties(prefix = "mysql.ds")
  @Primary
  DataSource  createMySQLDs() {
		return  DataSourceBuilder.create().build();
   }
	
	 // LocalContainerEntityMAnagerFactoryBean that gives EntityManagerFactory object
	@Bean("mysqlEMF")
	@Primary
	LocalContainerEntityManagerFactoryBean  createLCEMFBForMySQL(EntityManagerFactoryBuilder emBuilder) {
		 //prepare HB properites
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		map.put("hibernate.hbm2ddl.auto","update");
		map.put("hibernate.show_sql","true");
		map.put("hibernate.fomat_sql", "true");
		//create LocalContainerEntityManagerFactoryBean class obj using  EntityManagerFactoryBuilder object
		return  emBuilder.dataSource(createMySQLDs()).packages("com.entity.offers").properties(map).build();
	}
	
	@Bean("mysqlTxMgmr")
	@Primary
	JpaTransactionManager  createTxMgmrForMySQL(@Qualifier("mysqlEMF") EntityManagerFactory factory) {	
		return  new  JpaTransactionManager(factory);		
	}

}
