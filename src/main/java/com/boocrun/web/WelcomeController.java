package com.boocrun.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController 
{
	@RequestMapping("/")		
	public String welcome (ModelMap model) 
	{
		model.put("message", "This message comes to yu from our Welcome Controller");
		return "welcome";
		
	}
}
