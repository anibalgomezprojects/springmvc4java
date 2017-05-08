package com.myapp.anibalprojects.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView index(Model model) {
		model.addAttribute("saludo", "Hola");
		return new ModelAndView("index");
	}
	
}
