package br.com.cotiinformatica.application.dtos;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString

public class CriarContaDTO {

    @Size(min = 8, max = 150, message = "Nome do usuário deve ter de 8 a 150 caracteres.")
    @NotBlank(message = "Nome do usuário é obrigatório")
    private String nome;

    @Email(message = "Informe um endereço de email válido")
    @NotBlank(message = "Email do usuário é obrigatório")
    private String email;

    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=_!])(?=\\\\S+$).{8,}$",
            message = "A senha deve conter pelo menos um dígito, uma letra minúscula, uma letra maiúscula, " +
                    "um caractere especial, não contém espaços em branco e tem pelo menos 8 caracteres de comprimento.")
    @NotBlank(message = "Senha do usuário é obrigatória")
    private String senha;
}
