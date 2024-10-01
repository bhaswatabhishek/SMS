package com.te.sms;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SMSApplication {

	public static void main(String[] args) {
		SpringApplication.run(SMSApplication.class, args);
	}


@Bean
public CommandLineRunner commandLineRunner(){
	return args -> {
		System.out.println("CommandLineRUNNER Executed");
	};
}
}
