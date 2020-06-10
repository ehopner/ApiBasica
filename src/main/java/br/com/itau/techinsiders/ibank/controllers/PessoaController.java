package br.com.itau.techinsiders.ibank.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.techinsiders.ibank.models.Pessoa;
import br.com.itau.techinsiders.ibank.repository.PessoaRepository;


@RestController
@CrossOrigin
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @PostMapping(path = "/pessoas", consumes = "application/json", produces = "application/json")
    public Pessoa addPessoa(@RequestBody final Pessoa novaPessoa) {
        // PessoaRepository pr = new PessoaRepository()
        final Pessoa pessoaInserida = pessoaRepository.save(novaPessoa);
        return pessoaInserida;
        // http://127.0.0.1:5500/
        // https://spring.io/guides/gs/rest-service-cors/
    }

    @GetMapping(path = "/pessoas") // produces = "application/json")
    public Iterable<Pessoa> exibePessoas() {
        // PessoaRepository pr = new PessoaRepository()
        Iterable<Pessoa> listaPessoas = pessoaRepository.findAll();
        return listaPessoas;

    }

    @GetMapping(path = "/pessoas/{id}")
    public Pessoa buscaPessoas(@PathVariable("id") Long idPessoa) {
        Optional<Pessoa> optionalPessoa = pessoaRepository.findById(idPessoa);
        return optionalPessoa.get();

    }

}
// findAll