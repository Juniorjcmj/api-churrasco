package dev.jcmj.modulos.bebidas.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BebidaDto {
    
    public String id;
    public String descricao;
    public  String valor;
    public  String qntdd;
}
