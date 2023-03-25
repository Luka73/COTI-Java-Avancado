package br.com.cotiinformatica.application.dtos;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class CriarContaResponseDTO {

    private String mensagem;
    private String id;
    private String nome;
    private String email;
}
