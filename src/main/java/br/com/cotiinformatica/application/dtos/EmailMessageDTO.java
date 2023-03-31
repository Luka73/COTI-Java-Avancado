package br.com.cotiinformatica.application.dtos;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class EmailMessageDTO {

    private String to;
    private String subject;
    private String body;
}
