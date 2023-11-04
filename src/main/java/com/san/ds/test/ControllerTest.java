package com.san.ds.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

	@GetMapping("/test/helloo")
	public String hello() {
		return "hello spring boot";
		
	}
}
