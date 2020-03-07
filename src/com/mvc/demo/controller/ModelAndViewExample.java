/**
 * 
 */
package com.mvc.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
public class ModelAndViewExample {

	@RequestMapping("/")
	public String indexPage() {
		
		return "index";
	}
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView showHome(@RequestParam(value = "nm", required = false) String name, HttpSession sess) {
		
		sess.setAttribute("user", name);
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("user", name);
		return mv;
	}
	
	@RequestMapping(value = "/success", method = RequestMethod.GET)
	public String showSuccessPage() {
		return "success";
	}
	
}
