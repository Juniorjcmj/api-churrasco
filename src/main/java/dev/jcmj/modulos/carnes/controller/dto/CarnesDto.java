package dev.jcmj.modulos.carnes.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarnesDto {
    
    public String id;
    public String un;
    public String custo;
    public String tipoCorte;
    public String kg;
    public String item;
    public String precoUnitario;
    public String atePorPessoa;
}
