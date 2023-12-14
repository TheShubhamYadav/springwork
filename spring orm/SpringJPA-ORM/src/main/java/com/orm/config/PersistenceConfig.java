package com.orm.config;

import javax.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.orm.dao"})
@PropertySource("classpath:db.properties")
@EnableTransactionManagement
public class PersistenceConfig {

    @Bean
    public DataSource dataSource(@Value("${db.driverClassName}") String driver,
                                 @Value("${db.url}")String url,
                                 @Value("${db.username}")String user,
                                 @Value("${db.password}")String password){
        DriverManagerDataSource dataSource = new DriverManagerDataSource(url,user,password);
        dataSource.setDriverClassName(driver);
        return dataSource;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean(DataSource dataSource){
        LocalContainerEntityManagerFactoryBean factoryBean = null;
        HibernateJpaVendorAdapter jpaVendorAdapter = null;

        jpaVendorAdapter = new HibernateJpaVendorAdapter();
        jpaVendorAdapter.setShowSql(true);
        jpaVendorAdapter.setGenerateDdl(true);

        factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setJpaVendorAdapter(jpaVendorAdapter);
        factoryBean.setPackagesToScan("com.orm.entities");
        return factoryBean;
    }

    @Bean
    public JpaTemplate jpaTemplate(EntityManagerFactory entityManagerFactory){
        JpaTemplate jpaTemplate = new JpaTemplate();
        jpaTemplate.setEntityManagerFactory(entityManagerFactory);
        return jpaTemplate;
    }

    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory){
        JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
        jpaTransactionManager.setEntityManagerFactory(entityManagerFactory);
        return jpaTransactionManager;
    }


}
