package br.com.itau.techinsiders.ibank.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
 
import br.com.itau.techinsiders.ibank.models.Pessoa;
 
public interface PessoaRepository extends CrudRepository<Pessoa, Long> {

    public Optional<Pessoa> findPessoaByTelefone (String telefone);
 
}