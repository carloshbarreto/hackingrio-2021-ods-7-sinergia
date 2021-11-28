package br.com.senac.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.senac.domain.Cliente;
import br.com.senac.service.ClienteService;
import javassist.tools.rmi.ObjectNotFoundException;

@Controller
@RequestMapping("cadastrarfisica")
public class CadastrofController {
	
	@Autowired
	private ClienteService clienteService;
	
	
	
	@GetMapping("/listarclientes")
	public ModelAndView listaTodosClientes() {		
		ModelAndView mv = new ModelAndView("listarCliente");		
		return mv;
	}
	
	//criar uma rota para chamar a tela de cadastro
	@GetMapping("")
	public ModelAndView cadastrarCliente() {
	ModelAndView mv = new ModelAndView("cadastro-fisica");
	mv.addObject("cliente", new Cliente());	
	return mv;
	}
	
	//criar uma rota para incluir o aluno
	@PostMapping("/salvar")
	public ModelAndView salvarAluno(Cliente cliente) {
		clienteService.salvar(cliente);
		return listaTodosClientes();
	}
	
	@GetMapping("/alterar/{id}")
	public ModelAndView alterarCliente(@PathVariable("id") Integer idCliente) throws ObjectNotFoundException{
		ModelAndView mv = new ModelAndView("cadasto-fisica");
		mv.addObject("cliente", clienteService.buscarPorId(idCliente));
		return mv;
	}
	
	@PostMapping("/alterar")
	public ModelAndView alterar(Cliente clienteAlterado) throws ObjectNotFoundException{
		clienteService.salvarAlteracao(clienteAlterado);
		return listaTodosClientes();
	}
	
	@GetMapping("/excluir/{id}")
	public ModelAndView excluirCliente(@PathVariable ("id") Integer id) {
		clienteService.excluir(id);
		return listaTodosClientes();
	}

}
