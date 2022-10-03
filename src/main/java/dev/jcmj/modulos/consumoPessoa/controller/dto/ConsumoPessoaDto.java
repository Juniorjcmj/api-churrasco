package dev.jcmj.modulos.consumoPessoa.controller.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsumoPessoaDto{

    private String id;
    @NotNull(message = "Descrição é obrigatória")
    private String descricao;
    @NotNull(message = "Tipo de Convidado é obrigatório")
    private String tipoConvidado;
    @NotNull(message = "Quantidade é obrigatória")
    private String qntdd;
    @NotNull(message = "Unidade é obrigatória")
    private String un;
}