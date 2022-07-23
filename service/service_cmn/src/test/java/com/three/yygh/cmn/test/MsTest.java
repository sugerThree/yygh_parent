package com.three.yygh.cmn.test;

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
 * @date 2022-07-23 18:20
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class MsTest {
    @Autowired
    private DataSource dataSource;

    @Test
    public void connectTest() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println(connection.toString());
    }
}
