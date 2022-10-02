package dev.jcmj.modulos.carnes.controller.dto;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarnesDto {
    
    public String id;
    @NotNull(message = "Unidade é obrigatória.")
    public String un;
    @NotNull(message = "Custo é obrigatório.")
    public String custo;
    @NotNull(message = "Tipo corte é obrigatório.")
    public String tipoCorte;
    @NotNull(message = "Peso é obrigatório.")
    public String kg;
    @NotNull(message = "Item é obrigatório.")
    public String item;
    @NotNull(message = "Preço unitário é obrigatório.")
    public String precoUnitario;
    public String atePorPessoa;
}
