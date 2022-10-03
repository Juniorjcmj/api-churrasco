package dev.jcmj.modulos.clientes.controller.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
@AllArgsConstructor
public class ClienteDto {
    
    @NotBlank(message = "Nome é Obrigatório.")
    public String nome;
    public String cpf;
    @Email(message = "Endereço de Email inválido")
    public String email;
    @NotBlank(message = "Contato é Obrigatório.")
    public String cel;
    public String senha;
}
