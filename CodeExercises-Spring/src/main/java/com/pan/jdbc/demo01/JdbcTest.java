package com.pan.jdbc.demo01;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * @author panyexiong
 * @version 1.0
 * @date 2019/9/17 13:47
 */
public class JdbcTest {
    @Test
    public void test1() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:///springTest");
        dataSource.setUsername("root");
        dataSource.setPassword("Pan199668!");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.update("INSERT INTO account VALUES (null,?,?)", "潘野雄", 10000d);
    }
}
