package br.com.senac.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.senac.service.SugestoesService;

@Controller
@RequestMapping("negociacao")
public class NegociacaoController {
	
	@Autowired
	private SugestoesService sugestoesService;
	
	@GetMapping("")
	public ModelAndView Listar() {
		ModelAndView mv = new ModelAndView("negociacao");
		mv.addObject("sugestoes",sugestoesService.buscarTodasSugestoes());
		return mv;
	}
	
	@GetMapping("/cadastrar") public ModelAndView cadastrarSugestoes() {
		ModelAndView mv = new ModelAndView("aluno/cadastraAluno");
	
	 /*
	 * @GetMapping("/listar") public ModelAndView listaTodosAlunos() { 
	 * ModelAndView mv = new ModelAndView("aluno/paginaListaAlunos");
	 * mv.addObject("alunos",alunoService.buscarTodosAlunos()); return mv; }
	 * 
	 * 
	 * @GetMapping("/cadastrar") public ModelAndView cadastrarAluno() { ModelAndView
	 * mv = new ModelAndView("aluno/cadastraAluno"); mv.addObject("alunoCadastrar",
	 * new Aluno()); return mv; }
	 * 
	 * 
	 * @PostMapping("/salvar") public ModelAndView salvarAluno(Aluno aluno) {
	 * alunoService.salvar(aluno); return listaTodosAlunos(); }
	 * 
	 * @GetMapping("/alterar/{id}") public ModelAndView
	 * alterarAluno(@PathVariable("id") Integer id) throws ObjectNotFoundException {
	 * ModelAndView mv = new ModelAndView("aluno/alteraAluno");
	 * mv.addObject("aluno", alunoService.buscaPorId(id)); return mv; }
	 * 
	 * @PostMapping("/alterar") public ModelAndView alterar(Aluno alunoAlterado)
	 * throws ObjectNotFoundException { alunoService.salvarAlteracao(alunoAlterado);
	 * return listaTodosAlunos(); }
	 * 
	 * @GetMapping("/excluir/{id}") public ModelAndView
	 * excluirAluno(@PathVariable("id") Integer id) { alunoService.excluir(id);
	 * return listaTodosAlunos(); }
	 */

}
