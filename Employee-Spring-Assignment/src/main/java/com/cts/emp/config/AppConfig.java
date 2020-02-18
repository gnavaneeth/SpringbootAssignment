package com.cts.emp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScans(value={@ComponentScan("com.cts.emp.service"),@ComponentScan("com.cts.emp.Dao")})
public class AppConfig {
	
	

}
