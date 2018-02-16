package web.josim.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping(value = {"/", "/home","/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting","Welcom To Spring Web MVC");
		return mv;
	}
	
	/*@RequestMapping(value = "/test")
	public ModelAndView test(@RequestParam(value="greeting", required = false)String greeting) {
		if(greeting == null) {
			greeting = "Welcome without greeting value";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}*/
	/*
	@RequestMapping(value = "/test/{greeting}")
	public ModelAndView test(@PathVariable(value="greeting", required = false)String greeting) {
		if(greeting == null) {
			greeting = "Welcome without greeting value";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}*/
}