package br.com.senac.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.senac.domain.PessoaJuridica;
import br.com.senac.repository.PessoaJuridicaRepository;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class PessoaJuridicaService {
	
	@Autowired
	PessoaJuridicaRepository pessoaJuriRepo;
	
	public PessoaJuridica salvar(PessoaJuridica pessoaJuridica) {
		return pessoaJuriRepo.save(pessoaJuridica);
	}
	
	public List<PessoaJuridica> buscarTodosClientes(){
		return pessoaJuriRepo.findAll();
	}
	
	public PessoaJuridica buscarPorId(Integer id) throws ObjectNotFoundException{
		Optional<PessoaJuridica> pessoaJuridica = pessoaJuriRepo.findById(id);
		return pessoaJuridica.orElseThrow(() -> new ObjectNotFoundException("Pessoa Jurídica não encontrado. id: " + id));
	}
	
	public PessoaJuridica salvarAlteracao(PessoaJuridica pessoaJuridica) throws ObjectNotFoundException {
		PessoaJuridica pessoaJuridicaAlterado = buscarPorId(pessoaJuridica.getId());
		pessoaJuridicaAlterado.setId(pessoaJuridica.getId());
		pessoaJuridicaAlterado.setNomeEmpresa(pessoaJuridica.getNomeEmpresa());
		pessoaJuridicaAlterado.setNomeResponsavel(pessoaJuridica.getNomeResponsavel());		
		pessoaJuridicaAlterado.setCpfResponsavel(pessoaJuridica.getCpfResponsavel());
		pessoaJuridicaAlterado.setCep(pessoaJuridica.getCep());
		pessoaJuridicaAlterado.setRua(pessoaJuridica.getRua());
		pessoaJuridicaAlterado.setNumero(pessoaJuridica.getNumero());
		pessoaJuridicaAlterado.setComplemento(pessoaJuridica.getComplemento());
		pessoaJuridicaAlterado.setCidade(pessoaJuridica.getCidade());
		pessoaJuridicaAlterado.setEstado(pessoaJuridica.getEstado());
		pessoaJuridicaAlterado.setTelefone(pessoaJuridica.getTelefone());
		pessoaJuridicaAlterado.setEmail(pessoaJuridica.getEmail());
		pessoaJuridicaAlterado.setSenha(pessoaJuridica.getSenha());
		return salvar(pessoaJuridicaAlterado);			
		
	}
	
	public void excluir(Integer id) {
		pessoaJuriRepo.deleteById(id);
	} 


}
