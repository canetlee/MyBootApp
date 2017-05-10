package com.tuyano.springboot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeloCotroller {

	@RequestMapping("/{num}")
	public String index(@PathVariable int num) {
		int res = 0;
		for(int i =1;i <= 1;i++) res +=1;
		return "total : "+ res;
	}
}
