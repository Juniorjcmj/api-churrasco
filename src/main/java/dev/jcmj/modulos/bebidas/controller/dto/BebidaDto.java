package dev.jcmj.modulos.bebidas.controller.dto;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BebidaDto {
    
    public String id;
    @NotNull(message = "Quantidade é obrigatória.")
    public String descricao;
    @NotNull(message = "valor é obrigatório.")
    public  String valor;
    @NotNull(message ="Quantidade é obrigatória.")
    public  String qntdd;
}
