package br.com.senac.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller
@RequestMapping("listagem")
public class ListagemController {
	
	
	@GetMapping("")
	public ModelAndView Listar() {
		ModelAndView mv = new ModelAndView("meuConsumo");
		return mv;
	}

}
