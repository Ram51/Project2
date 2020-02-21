package com.cuberootz.vms;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cuberootz.vms.services.user.UserService;

@EnableTransactionManagement
@SpringBootApplication
public class VMSServiceApplication  implements CommandLineRunner {

	private static Logger logger = LoggerFactory.getLogger(VMSServiceApplication.class);

	@Autowired
	UserService service;

	public static void main(String[] args) {
		logger.info("vmsServiceApplication init..");
		SpringApplication.run(VMSServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Code to run at application startup
		//logger.info("Users -> {}", service.getUsers());
		
	}
}
