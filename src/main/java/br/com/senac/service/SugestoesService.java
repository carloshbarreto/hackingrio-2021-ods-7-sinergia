package br.com.senac.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.domain.Sugestoes;
import br.com.senac.repository.SugestoesRepository;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class SugestoesService {

	@Autowired
	SugestoesRepository sugestoesRepo;	
	
	public Sugestoes salvar(Sugestoes sugestoes) {
		return sugestoesRepo.save(sugestoes);
	}
	
	public List<Sugestoes> buscarTodasSugestoes(){
		return sugestoesRepo.findAll();
	}
	
	public Sugestoes buscarPorId(Integer id) throws ObjectNotFoundException{
		Optional<Sugestoes> sugestoes = sugestoesRepo.findById(id);
		return sugestoes.orElseThrow(() -> new ObjectNotFoundException("Sugestoes não encontradas. id: " + id));
	}
	
	public Sugestoes salvarAlteracao(Sugestoes sugestoes) throws ObjectNotFoundException {
		Sugestoes sugestoesAlterado = buscarPorId(sugestoes.getId());
		sugestoesAlterado.setId(sugestoes.getId());
		sugestoesAlterado.setDescricao(sugestoes.getDescricao());
		sugestoesAlterado.setStatus(sugestoes.getStatus());
		return salvar(sugestoesAlterado);			
	}
	
	public void excluir(Integer id) {
		sugestoesRepo.deleteById(id);
	} 
	
}
