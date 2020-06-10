package br.com.itau.techinsiders.ibank.controllers;

import java.util.Optional;

import com.fasterxml.jackson.databind.JsonNode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.techinsiders.ibank.models.Pessoa;
import br.com.itau.techinsiders.ibank.repository.PessoaRepository;

@RestController
public class AuthController {
    
    @GetMapping(path = "/auth") // produces = "application/json")
    public boolean auth(@RequestBody JsonNode credenciaisLogin) {
        // PessoaRepository pr = new PessoaRepository()
        String login = credenciaisLogin.get("login").asText();
        String senha = credenciaisLogin.get("senha").asText();

        String testeSenha = PessoaRepository.findPessoaByRACF(login).get("senha").asText;

        if (senha.equals(testeSenha)) {
            return true;
        } else {
            return false;
        }


        // public String status() {
        //     return "{\"status\": \"running\"}";
        // }
}