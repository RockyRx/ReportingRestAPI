package restapi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import rest.ServletInitializer;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ServletInitializer.class)
@WebAppConfiguration
public class ReportingRestApiApplicationTests {

	@Test
	public void contextLoads() {
	}

}
