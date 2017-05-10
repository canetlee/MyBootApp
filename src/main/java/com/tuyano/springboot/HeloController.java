package com.tuyano.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HeloController {
	
	@RequestMapping("/aa")
	public String index() {
		return "index";
	}
	
}