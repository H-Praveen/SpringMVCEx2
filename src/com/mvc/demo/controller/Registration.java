/**
 * 
 */
package com.mvc.demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 172730
 *
 */
@Controller
public class Registration {

	@RequestMapping(value="/showregistration", method = RequestMethod.GET)
	public String showRegistration() {
		
		return "registration";
	}
	
	@RequestMapping(value = "/personaldetails", method = RequestMethod.POST)
	public ModelAndView getPersonalInfo(@RequestParam(value = "nm") String name, @RequestParam(value = "dob") String dob) {
		
		ModelAndView mv = new ModelAndView("professionalinfo");
		Map<String, String> map = new HashMap<>();
		map.put("name",name);
		map.put("dob", dob);
		mv.addAllObjects(map);
		return mv;
	}
	
	@RequestMapping(value = "/professionalinfo", method = RequestMethod.POST)
	public ModelAndView getProfessionalInfo(@RequestParam(value = "cmp") String company, @RequestParam(value = "desg") String designation) {
		
		ModelAndView mv = new ModelAndView("showdetails");
		Map<String, String> map = new HashMap<>();
		map.put("cmp",company);
		map.put("desg", designation);
		mv.addAllObjects(map);
		return mv;
	}
}
