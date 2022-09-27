package dev.jcmj.modulos.consumoPessoa.controller.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsumoPessoaDto{

    private String id;
    private String descricao;
    private String tipoConvidado;
    private String qntdd;
    private String un;
}