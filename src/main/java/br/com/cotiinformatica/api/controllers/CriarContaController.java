package br.com.cotiinformatica.api.controllers;

import br.com.cotiinformatica.application.dtos.CriarContaDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CriarContaController {

    @PostMapping("/api/usuarios/criar-conta")
    public String post(@Valid @RequestBody CriarContaDTO dto) {
        return null;
    }

}
