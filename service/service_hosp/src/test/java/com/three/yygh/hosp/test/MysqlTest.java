package com.three.yygh.hosp.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author three
 * @date 2022-07-22 23:41
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class MysqlTest {
    @Autowired
    private DataSource dataSource;
    @Test
    public void testConnection() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println(connection.toString());
    }
}
