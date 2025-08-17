package com.config;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

@Configuration("oracnf")
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.repository.product",
                        entityManagerFactoryRef = "orcemb", transactionManagerRef = "orctxmg")
public class OracleDBConfig {

    @Bean("orcds")
    @ConfigurationProperties(prefix = "ora.ds")
    DataSource createOrcDs() {
		return DataSourceBuilder.create().build();
	}
    
    // Here the object of factory bean will not be stored, instead the factory bean will give the
    // EntityManagerFactory object and this will be marked as bean object
    // In Spring (and Spring Boot), parameters of @Bean methods are automatically autowired by the framework.
    @Bean("orcemb")
    LocalContainerEntityManagerFactoryBean getLCEMFB(EntityManagerFactoryBuilder emBuilder) {
    	    HashMap<String, Object> map = new HashMap<String, Object>();
    	    map.put("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
    		map.put("hibernate.hbm2ddl.auto","update");
    		map.put("hibernate.show_sql","true");
    		map.put("hibernate.fomat_sql", "true");
    		//create LocalContainerEntityManagerFactoryBean class obj using  EntityManagerFactoryBuilder object
    	    return emBuilder.dataSource(createOrcDs()).packages("com.entity.product").properties(map).build();
    }
    
    @Bean("orctxmg")
	JpaTransactionManager  createTxMgmrForOracle(@Qualifier("orcemb") EntityManagerFactory factory) {	
		return  new  JpaTransactionManager(factory);
		
	}

}
