package com.casadeshow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(Model model){
		model.addAttribute("msg","Valeu mito");
		return "helloworld";
	}
}
