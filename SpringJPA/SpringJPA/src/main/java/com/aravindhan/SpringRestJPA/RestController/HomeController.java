package com.aravindhan.SpringRestJPA.RestController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping(path="/")
	public String home() {
		System.out.println("In Home Controller...");
		return "home";
	}

}
