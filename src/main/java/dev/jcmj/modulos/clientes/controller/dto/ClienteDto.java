package dev.jcmj.modulos.clientes.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
@AllArgsConstructor
public class ClienteDto {
    
    public String nome;
    public String cpf;
    public String email;
    public String cel;
    public String senha;
}
