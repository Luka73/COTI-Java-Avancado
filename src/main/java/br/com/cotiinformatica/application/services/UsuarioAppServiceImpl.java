package br.com.cotiinformatica.application.services;

import br.com.cotiinformatica.application.dtos.CriarContaDTO;
import br.com.cotiinformatica.application.dtos.CriarContaResponseDTO;
import br.com.cotiinformatica.application.interfaces.UsuarioAppService;
import br.com.cotiinformatica.domain.models.Usuario;
import br.com.cotiinformatica.domain.interfaces.UsuarioDomainService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioAppServiceImpl implements UsuarioAppService {

    @Autowired
    private UsuarioDomainService usuarioDomainService;


    @Override
    public CriarContaResponseDTO criarConta(CriarContaDTO dto) {

        ModelMapper modelMapper = new ModelMapper();

        Usuario usuario = modelMapper.map(dto, Usuario.class);
        usuarioDomainService.criarConta(usuario);

        CriarContaResponseDTO response = modelMapper.map(usuario, CriarContaResponseDTO.class);
        response.setMensagem("Conta de usuário criada com sucesso.");

        return response;
    }
}
