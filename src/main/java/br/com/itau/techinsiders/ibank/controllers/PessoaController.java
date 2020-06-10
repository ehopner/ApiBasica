package br.com.itau.techinsiders.ibank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.techinsiders.ibank.models.Pessoa;
import br.com.itau.techinsiders.ibank.repository.PessoaRepository;

@RestController
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @PostMapping(path = "/pessoas", consumes = "application/json", produces = "application/json")
    public Pessoa addPessoa(@RequestBody final Pessoa novaPessoa) {
        //PessoaRepository pr = new PessoaRepository()
        final Pessoa pessoaInserida = pessoaRepository.save(novaPessoa);
        return pessoaInserida;
        
    }

    @GetMapping(path = "/pessoas", produces = "application/json")
    public Iterable exibePessoas() {
        //PessoaRepository pr = new PessoaRepository()
        
        return pessoaRepository.findAll();
        
    }
    
}
// findAll