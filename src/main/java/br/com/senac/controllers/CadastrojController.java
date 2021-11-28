package br.com.senac.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("cadastrarjuridica")
public class CadastrojController {

	@GetMapping("")
	public ModelAndView CadastrarJuridica() {
		ModelAndView mv = new ModelAndView("cadastro-juridica");
		return mv;
	}
}
