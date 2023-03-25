package br.com.cotiinformatica.application.services;

import br.com.cotiinformatica.application.dtos.CriarContaDTO;
import br.com.cotiinformatica.application.dtos.CriarContaResponseDTO;
import br.com.cotiinformatica.application.interfaces.UsuarioAppService;
import br.com.cotiinformatica.domain.services.UsuarioDomainService;
import org.springframework.beans.factory.annotation.Autowired;

public class UsuarioAppServiceImpl implements UsuarioAppService {

    @Autowired
    private UsuarioDomainService usuarioDomainService;

    @Override
    public CriarContaResponseDTO criarConta(CriarContaDTO dto) {
        return null;
    }
}
