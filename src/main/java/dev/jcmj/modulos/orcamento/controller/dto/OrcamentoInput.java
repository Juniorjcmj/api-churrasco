package dev.jcmj.modulos.orcamento.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrcamentoInput {
    
    private String id;    
    private String clienteNome;
    private String dataEvento;
}
