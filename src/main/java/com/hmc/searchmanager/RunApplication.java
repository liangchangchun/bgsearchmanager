package com.hmc.searchmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;



@SpringBootApplication
//@ImportResource({"classpath:disconf.xml"})//引入disconf
public class RunApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(RunApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RunApplication.class);
	}
}