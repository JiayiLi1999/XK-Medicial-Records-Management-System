package com.sufer;

import com.sufer.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

@SpringBootTest
class EmrApplicationTests {

    DataSource dataSource;
    @Test
    void contextLoads() throws SQLException {
        dataSource.getConnection();
    }

}
