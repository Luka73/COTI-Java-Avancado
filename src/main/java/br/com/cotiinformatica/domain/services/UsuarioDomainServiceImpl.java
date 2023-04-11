package br.com.cotiinformatica.domain.services;

import br.com.cotiinformatica.domain.interfaces.UsuarioDomainService;
import br.com.cotiinformatica.domain.models.Usuario;
import br.com.cotiinformatica.infrastructure.components.MD5Component;
import br.com.cotiinformatica.infrastructure.repositories.UsuarioRepository;
import br.com.cotiinformatica.infrastructure.security.TokenCreator;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
public class UsuarioDomainServiceImpl implements UsuarioDomainService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private MD5Component md5Component;

    @Autowired
    private TokenCreator tokenCreator;


    @Override
    public void criarConta(Usuario usuario) {

        Optional<Usuario> optional = usuarioRepository.findByEmail(usuario.getEmail());
        if (optional.isPresent()) {
            throw new IllegalArgumentException("O email informado já está cadastrado.");
        }

        usuario.setSenha(md5Component.encrypt(usuario.getSenha()));

        usuario.setDataHoraCriacao(Instant.now());
        usuario.setDataHoraUltimaAlteracao(Instant.now());

        usuarioRepository.save(usuario);
    }

    @Override
    public Usuario autenticar(String email, String senha) {

        Optional<Usuario> opt = usuarioRepository.findByEmailAndSenha(email, md5Component.encrypt(senha));
        if(opt.isEmpty()) {
            throw new IllegalArgumentException("Acesso negado. Usuário não encontrado.");
        }

        Usuario usuario = opt.get();
        usuario.setAccessToken(tokenCreator.generateToken(usuario.getEmail()));

        return usuario;

    }

    @Override
    public Usuario recuperarSenha(String email) {

        Optional<Usuario> opt = usuarioRepository.findByEmail(email);
        if(opt.isEmpty()) {
            throw new IllegalArgumentException("Usuário inválido. Verifique o email informado.");
        }

        Usuario usuario = opt.get();

        Faker faker = new Faker();
        usuario.setNovaSenha(faker.internet().password(8, 10, true, true, true));

        usuario.setSenha(md5Component.encrypt(usuario.getNovaSenha()));
        usuarioRepository.save(usuario);

        return usuario;
    }

    @Override
    public Usuario atualizarDados(Usuario usuario) {

        Optional<Usuario> opt = usuarioRepository.findById(usuario.getId());

        if(opt.isEmpty()) {
            throw new IllegalArgumentException("Usuário inválido. Verifique o id informado.");
        }

        Usuario usuarioAtualizado = opt.get();

        if(usuario.getNome() != null)
            usuarioAtualizado.setNome(usuario.getNome());

        if(usuario.getSenha() != null)
            usuarioAtualizado.setSenha(md5Component.encrypt(usuario.getSenha()));

        usuarioAtualizado.setDataHoraUltimaAlteracao(Instant.now());

        usuarioRepository.save(usuarioAtualizado);
        return usuarioAtualizado;
    }

}
