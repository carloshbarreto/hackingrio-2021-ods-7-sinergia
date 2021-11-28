package br.com.senac.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("cadastrarfisica")
public class CadastrofController {

	@GetMapping("")
	public ModelAndView CadastrarFisica() {
		ModelAndView mv = new ModelAndView("cadastro-fisica");
		return mv;
	}
}
