package br.com.cotiinformatica.application.dtos;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ExceptionHandlerDTO {
    private HttpStatus status;
    private List<String> errors;
}
