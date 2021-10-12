package com.gk.java17.npe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NPEContoller {

	
	@GetMapping("/fullname")
	public String fullname() {		
		Name myName = new Name("Gerry", "Kovan");
		return  myName.firstName() + " " + myName.lastName() + "\n";
	}
	
	@GetMapping("/npe")
	public String npe() {
		Name myName = null;	
		return  myName.firstName() + myName.lastName();
	}

}
