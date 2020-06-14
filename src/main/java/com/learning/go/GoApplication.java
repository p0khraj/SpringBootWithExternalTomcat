package com.learning.go;

import java.io.File;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = {"com.learning.controller","com.disco"})
public class GoApplication extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		SpringApplication.run(GoApplication.class, args);
	}


	/*
	 * @Override protected SpringApplicationBuilder
	 * configure(SpringApplicationBuilder application) { String configLocation =
	 * System.getProperty("global.appconf.dir"); //get the default config directory
	 * location String configPath = configLocation + File.separator +
	 * "springApplication" + File.separator + "application.properties"; //set the
	 * configpath of this application instance exclusively
	 * System.out.println("Configpath: " + configPath);
	 * System.out.println("Starting to run Spring boot app...");
	 * 
	 * if(configLocation != null && !configLocation.isEmpty()) { Properties props =
	 * new Properties(); props.setProperty("spring.config.location", configPath);
	 * //set the config file to use
	 * application.application().setDefaultProperties(props); } else{ System.out.
	 * println("No global.appconf.dir property found, starting with default on classpath"
	 * ); } return application.sources(SpringApplication.class); }
	 */
	
}
