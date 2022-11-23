package com.boocrun.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.boocrun.domain.Car;

@Controller
public class WelcomeController 
{
	@RequestMapping(value="/", method=RequestMethod.GET)		
	public String welcome (ModelMap model) 
	{
		populateModel(model);
		
		return "welcome";
		
	}

	private void populateModel(ModelMap model) {
		model.put("message", "This message comes to yu from our Welcome Controller");
		List<String> cars = new ArrayList<>();
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("Tesla");
		cars.add("Ford");
		cars.add("GM");
		model.put("cars", cars);
		
		Car car = new Car();
		model.put("car", car); 
		
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String welcomPast (@ModelAttribute Car car, ModelMap model) {
		populateModel(model);
		System.out.println(car);
		return "welcome";
	}
}
