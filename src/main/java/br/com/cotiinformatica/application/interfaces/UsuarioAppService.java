package br.com.cotiinformatica.application.interfaces;

import br.com.cotiinformatica.application.dtos.CriarContaDTO;
import br.com.cotiinformatica.application.dtos.CriarContaResponseDTO;
import org.springframework.stereotype.Service;

@Service
public interface UsuarioAppService {

    CriarContaResponseDTO criarConta(CriarContaDTO dto);
}
