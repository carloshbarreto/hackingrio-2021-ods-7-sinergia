package br.com.senac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senac.domain.PessoaJuridica;

@Repository
public interface PessoaJuridicaRepository extends JpaRepository <PessoaJuridica, Integer>{

}
