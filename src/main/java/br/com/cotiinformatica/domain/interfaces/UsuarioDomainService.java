package br.com.cotiinformatica.domain.interfaces;

import br.com.cotiinformatica.domain.models.Usuario;

public interface UsuarioDomainService {
    //no domain, tentar usar nomes do mundo real, como criar conta ao invés de save, findById etc
    void criarConta(Usuario usuario);

    Usuario autenticar(String email, String senha);

    Usuario recuperarSenha(String email);

    Usuario atualizarDados(Usuario usuario);
}
