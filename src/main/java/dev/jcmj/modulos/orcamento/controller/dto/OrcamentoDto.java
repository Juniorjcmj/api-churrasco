package dev.jcmj.modulos.orcamento.controller.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrcamentoDto {

    private String id;
    private Date dataEvento;
    private String homens;
    private String mulheres;
    private String criancas;
    private String margemSeguranca;
    private String comissaoServvico;
    private String custoTotalComInsumos;
    private String percentualLucro;
    private String custoPessoal;
    private String valorFinalServico;
    private String custoPessoa;
}
