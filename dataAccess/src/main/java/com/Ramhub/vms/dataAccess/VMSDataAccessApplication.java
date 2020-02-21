package com.cuberootz.vms.dataAccess;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class VMSDataAccessApplication  implements CommandLineRunner {

	private static Logger logger = LoggerFactory.getLogger(VMSDataAccessApplication.class);

	public static void main(String[] args) {
		logger.info("VMSDataAccessApplication starting..");
		SpringApplication.run(VMSDataAccessApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Code to run at application startup
		//logger.info("OMSDataAccessApplication Users -> {}", repository.findAll());
		
	}
}
