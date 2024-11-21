package com.example.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.email.request.EmailRequest;
import com.example.email.service.EmailService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class EmailController {
	
	@Autowired
	EmailService emailService;
 
	@PostMapping("/email")
	public String sendEmail(@RequestBody EmailRequest request) {
		emailService.sendEmail(request.getTo(), request.getSubject(), request.getBody());
		return "email sent successfully";
	}
}
