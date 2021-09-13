package com.cd.myplantdiary;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {	
	
	@RequestMapping("/hi")
	public String hello() {
		return "hello";
	}
}
