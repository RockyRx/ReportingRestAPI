package controller;

import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.ServletContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import domain.Greeting;

/**
 * @author oshadha
 *
 */
@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    private static Log logger = LogFactory
			.getLog(GreetingController.class);
    
	@Autowired
	protected ServletContext servletContext;

    @RequestMapping("/greeting")
    @ResponseBody
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) { 
    	logger.info("Server Info: " + servletContext.getServerInfo());
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
}
