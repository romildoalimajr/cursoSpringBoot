package br.com.pizzariacursodankicode.cursospringboot.usuario;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DadosUsuarioCadastro {

    private Long id;
    @NotBlank
    private String login;
    @NotBlank
    private String password;

}
