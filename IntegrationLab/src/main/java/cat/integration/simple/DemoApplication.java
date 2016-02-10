package cat.integration.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource("/WEB-INF/1-simpleIntegration.xml")
//@ImportResource("/WEB-INF/2-amqpIntegration.xml")
//@ImportResource("/WEB-INF/3-mailIntegration.xml")
@ImportResource("/WEB-INF/4-smsIntegration.xml")
public class DemoApplication {
    private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        
	}
}
