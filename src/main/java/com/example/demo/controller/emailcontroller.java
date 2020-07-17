package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class emailcontroller {

	@Autowired
	private JavaMailSender javaMailSender;
	
	@GetMapping(value="/sendEmail")
	public void sendEmail()
	{
		SimpleMailMessage message= new SimpleMailMessage();
		message.setTo("aartikumari0451@gmail.com");
		message.setSubject("springBootApplication");
		message.setText("hii");
		javaMailSender.send(message);
	}
}
