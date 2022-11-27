package com.boocrun.web;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.boocrun.domain.Car;

@Controller
public class WelcomeController 
{	
	List<String> cars = new ArrayList<>();
	
	public WelcomeController () {
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("Tesla");
		cars.add("Ford");
		cars.add("GM");
		cars.add("BMW");
		cars.add("Mazda");
		cars.add("Chevrolet");
		
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)		
	public String welcome (ModelMap model) 
	{
		
		populateModel(model);
		
		return "welcome";
		
	}

	private void populateModel(ModelMap model) {
		model.put("message", "This message comes to yu from our Welcome Controller");


		model.put("cars", cars);
		model.put("today", new Date());
		
		Car car = new Car();
		model.put("car", car); 
		
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String welcomPast (@ModelAttribute Car car, ModelMap model) {
		populateModel(model);
		System.out.println(car);
		return "welcome";
	}
	
	@RequestMapping(value="/del/{carBrand}", method=RequestMethod.GET)
	public String deleteCarBrend (@PathVariable String carBrand, ModelMap model) {
		cars.remove(carBrand);
		populateModel(model);
		return "welcome";
	}
}
