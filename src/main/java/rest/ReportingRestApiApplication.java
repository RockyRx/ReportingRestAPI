package rest;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
                
/**
 * @author oshadha
 *
 */
@ComponentScan("controller, domain")
@EnableAutoConfiguration
public class ReportingRestApiApplication {

	private static Log logger = LogFactory
			.getLog(ReportingRestApiApplication.class);

	@Bean
	protected ServletContextListener listener() {
		return new ServletContextListener() {
			public void contextInitialized(ServletContextEvent sce) {
				logger.info("ServletContext initialized");
			}

			public void contextDestroyed(ServletContextEvent sce) {
				logger.info("ServletContext destroyed");
			}
		};
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ReportingRestApiApplication.class, args);
	}
}
