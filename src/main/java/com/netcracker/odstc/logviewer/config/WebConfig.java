package com.netcracker.odstc.logviewer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class WebConfig{

    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return  new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:oracle:thin:@91.219.60.189:1521:XEPDB1");
        dataSource.setUsername("team3");
        dataSource.setPassword("Oracle11XE#");
        dataSource.setDriverClassName(oracle.jdbc.driver.OracleDriver.class.getName());
        return dataSource;
    }
}
