package br.com.cotiinformatica.application.dtos;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class AtualizarDadosResponseDTO {

    private String mensagem;
    private String id;
    private String nome;
    private String email;
}
