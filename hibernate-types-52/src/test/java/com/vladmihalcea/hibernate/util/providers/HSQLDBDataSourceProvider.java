package com.vladmihalcea.hibernate.util.providers;

import org.hsqldb.jdbc.JDBCDataSource;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author Vlad Mihalcea
 */
public class HSQLDBDataSourceProvider implements DataSourceProvider {

    @Override
    public String hibernateDialect() {
        return "org.hibernate.dialect.HSQLDialect";
    }

    @Override
    public DataSource dataSource() {
        JDBCDataSource dataSource = new JDBCDataSource();
        dataSource.setUrl("jdbc:hsqldb:mem:test");
        dataSource.setUser("sa");
        dataSource.setPassword("");
        return dataSource;
    }

    @Override
    public Database database() {
        return Database.HSQLDB;
    }
}
