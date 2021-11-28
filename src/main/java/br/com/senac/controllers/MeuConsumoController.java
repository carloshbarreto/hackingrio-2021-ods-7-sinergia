package br.com.senac.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("meuconsumo")
public class MeuConsumoController {
	
	@GetMapping("")
	public ModelAndView Listar() {
		ModelAndView mv = new ModelAndView("cadastro-consumo");
		return mv;
	}

}
