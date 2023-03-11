package com.arjun.bill.payments.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/v1")
public class BillPaymentsController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/recharge")
	public String recharge() {
		return restTemplate.getForObject("http://ACCOUNTS-PROFILES/v1/customer", String.class);
		
	}

}
