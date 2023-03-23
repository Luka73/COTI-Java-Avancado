package br.com.cotiinformatica.api.controllers;

import br.com.cotiinformatica.application.dtos.AutenticarDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutenticarController {

    @PostMapping("/api/usuarios/autenticar")
    public String post(@Valid @RequestBody AutenticarDTO dto) {
        return null;
    }
}
