package br.com.senac.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.senac.domain.Cliente;
import br.com.senac.repository.ClienteRepository;
import javassist.tools.rmi.ObjectNotFoundException;


@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepo;	
	
	
	public Cliente salvar(Cliente cliente) {
		return clienteRepo.save(cliente);
	}
	
	public List<Cliente> buscarTodosClientes(){
		return clienteRepo.findAll();
	}
	
	public Cliente buscarPorId(Integer id) throws ObjectNotFoundException{
		Optional<Cliente> cliente = clienteRepo.findById(id);
		return cliente.orElseThrow(() -> new ObjectNotFoundException("Cliente não encontrado. id: " + id));
	}
	
	public Cliente salvarAlteracao(Cliente cliente) throws ObjectNotFoundException {
		Cliente clienteAlterado = buscarPorId(cliente.getId());
		clienteAlterado.setId(cliente.getId());
		clienteAlterado.setNome(cliente.getNome());
		clienteAlterado.setSobrenome(cliente.getSobrenome());
		clienteAlterado.setData(cliente.getData());
		clienteAlterado.setCpf(cliente.getCpf());
		clienteAlterado.setCep(cliente.getCep());
		clienteAlterado.setRua(cliente.getRua());
		clienteAlterado.setNumero(cliente.getNumero());
		clienteAlterado.setComplem(cliente.getComplem());
		clienteAlterado.setCidade(cliente.getCidade());
		clienteAlterado.setEstado(cliente.getEstado());
		clienteAlterado.setTelefone(cliente.getTelefone());
		clienteAlterado.setEmail(cliente.getEmail());
		clienteAlterado.setSenha(cliente.getSenha());
		return salvar(clienteAlterado);			
		
	}
	
	public void excluir(Integer id) {
		clienteRepo.deleteById(id);
	} 

}
