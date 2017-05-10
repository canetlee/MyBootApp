package com.tuyano.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeloCotroller {

	@RequestMapping("/")
	public String index() {
		return "Hello Spring-Boot World!!";
	}
}
