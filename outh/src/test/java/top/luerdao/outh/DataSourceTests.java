package top.luerdao.outh;


import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
public class DataSourceTests {


    @Test
    public void testDataSource() throws SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();
        System.out.println(druidDataSource);
    }
}
