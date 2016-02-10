package com.report.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

//@SpringBootApplication
@Configuration
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
@ComponentScan
//@ImportResource("/WEB-INF/1-aqIntegration.xml")
//@ImportResource("/WEB-INF/2-jdbcIntegration.xml")
@ImportResource("/WEB-INF/3-fileIntegration.xml")
public class ReportLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReportLabApplication.class, args);
	}
}
