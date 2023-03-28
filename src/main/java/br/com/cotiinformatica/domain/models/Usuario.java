package br.com.cotiinformatica.domain.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;


//@Data --> resumine todos os itens básicos do JavaBean sem as sobrecargas de construtor
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Document(collection = "usuarios") //substitui o @Entity
public class Usuario {

    @Id
    private String id;
    private String nome;
    @Indexed(unique = true) //Para dizer que não pode ter dois usuários com o mesmo email
    private String email;
    private String senha;
    private Instant dataHoraCriacao;
    private Instant dataHoraUltimaAlteracao;

}
