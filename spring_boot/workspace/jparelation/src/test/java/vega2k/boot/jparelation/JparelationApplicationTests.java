package vega2k.boot.jparelation;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JparelationApplicationTests {
	@Autowired
	DataSource dataSource;
	
	@Test
	public void contextLoads() throws Exception {
		Connection connection = dataSource.getConnection();
		System.out.println(connection);
	}

}
