package br.com.cotiinformatica.domain.interfaces;

import br.com.cotiinformatica.domain.models.Usuario;

public interface UsuarioDomainService {

    void criarConta(Usuario usuario); //no domain, tentar usar nomes do mundo real, como criar conta ao invés de save, findById etc
}
