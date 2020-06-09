package br.com.itau.techinsiders.ibank;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;


@Configuration
public class DataConfiguration {


    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgres://argkxyujnnsotw:6c80ec6609d789e85e3ae128233ad9bd2a92dd458cd3047dad081962d8dd75af@ec2-3-223-21-106.compute-1.amazonaws.com:5432/d1s8h8hcs5toov");
        dataSource.setUsername("argkxyujnnsotw");
        dataSource.setPassword("6c80ec6609d789e85e3ae128233ad9bd2a92dd458cd3047dad081962d8dd75af");
        
        return dataSource;
        
    }
    
    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.POSTGRESQL);
        adapter.setShowSql(true);
        adapter.setGenerateDdl(true);
        adapter.setDatabasePlatform("org.hibernate.dialect.PostgreSQLDialect");
        adapter.setPrepareConnection(true);
        
        return adapter;
            
    }

 
}

