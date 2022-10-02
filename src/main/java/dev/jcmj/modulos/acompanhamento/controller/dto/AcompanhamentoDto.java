package dev.jcmj.modulos.acompanhamento.controller.dto;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AcompanhamentoDto {
    
    private String id;
    @NotNull(message = "Descrição é obrigatória")
    private String  descricao;
    @NotNull(message = "Peso  é obrigatório")
    private  String kg;
    @NotNull(message = "Valor é obrigatório")
    private  String valorUn;
    private  String ValorTotal; 
    @NotNull(message = "Tipo é obrigatório")   
    private String  tipoAcompanhamento;    
}
