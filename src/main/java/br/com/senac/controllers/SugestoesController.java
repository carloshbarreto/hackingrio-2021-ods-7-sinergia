package br.com.senac.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("negociacao")
public class SugestoesController {
	

	@GetMapping("")
	public ModelAndView Listar() {
		ModelAndView mv = new ModelAndView("negociacao");
		return mv;
	}

}
