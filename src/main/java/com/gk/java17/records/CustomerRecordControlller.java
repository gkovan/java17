package com.gk.java17.records;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRecordControlller {

	@GetMapping("/customer")
	public Customer customer() {
		String street = "590 Madison Avenue";
		String city = "Manhattan";
		String state = "NY";
		String zip = "10001";
		String country = "USA";
		Address address = new Address(street,city,state,zip,country);
		Customer customer1 = new Customer("Gerry", "Kovan", "3473473437",address);
		return customer1;
	}
}
