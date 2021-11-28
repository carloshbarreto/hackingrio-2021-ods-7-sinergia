package br.com.senac.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class HomeController {
	
	@GetMapping("home")
	public ModelAndView Listar() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
	@GetMapping("login")
	public ModelAndView Login() {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
	
	@GetMapping("login2")
	public ModelAndView Login2() {
		ModelAndView mv = new ModelAndView("login2");
		return mv;
	}


}
