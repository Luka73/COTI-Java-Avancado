package br.com.cotiinformatica.application.interfaces;

import br.com.cotiinformatica.application.dtos.*;
import org.springframework.stereotype.Service;

@Service
public interface UsuarioAppService {

    CriarContaResponseDTO criarConta(CriarContaDTO dto);
    AutenticarResponseDTO autenticar(AutenticarDTO dto);
    RecuperarSenhaResponseDTO recuperarSenha(RecuperarSenhaDTO dto);
    AtualizarDadosResponseDTO atualizarDados(AtualizarDadosDTO dto);
}
