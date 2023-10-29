package com.example.Emailsend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailSendApplication {
	@Autowired
	private Emailservice emailservice;

	public static void main(String[] args) {
		SpringApplication.run(EmailSendApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
public void trigger(){
		emailservice.sendEmail("satabdimohanty24@gmail.com","good morning everyone","THIS IS THE SUBJECT");
}
}
