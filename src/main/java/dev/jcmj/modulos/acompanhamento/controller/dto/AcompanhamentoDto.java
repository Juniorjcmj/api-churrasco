package dev.jcmj.modulos.acompanhamento.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AcompanhamentoDto {
    
    private String id;
    private String  descricao;
    private  String kg;
    private  String valorUn;
    private  String ValorTotal;    
    private String  tipoAcompanhamento;    
}
