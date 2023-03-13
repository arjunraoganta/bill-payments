package com.arjun.bill.payments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BillPaymentsApplication {
	public static void main(String[] args) {
		SpringApplication.run(BillPaymentsApplication.class, args);
	}

}
