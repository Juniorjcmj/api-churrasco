package dev.jcmj.modulos.orcamento.controller.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import dev.jcmj.modulos.acompanhamento.controller.dto.AcompanhamentoDto;
import dev.jcmj.modulos.bebidas.controller.dto.BebidaDto;
import dev.jcmj.modulos.carnes.controller.dto.CarnesDto;
import dev.jcmj.modulos.servicosDiversos.controller.dto.ServicoDiversoDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrcamentoDto {

    private String id;
    @NotNull(message = "Data do evento  é obrigatória")
    private String dataEvento;
    @NotNull(message = "Quantidade de homens é obrigatória")
    private String homens;
    @NotNull(message = "Quantidade de mulheres é obrigatória")
    private String mulheres;
    @NotNull(message = "Quantidade de crianças é obrigatória")
    private String criancas;
    @NotNull(message = "Nme do cliente é obrigatório")
    private String clienteNome;  
    @NotNull(message = "Margem de segurança é obrigatória")  
    private String margemSeguranca;
    private String comissaoServico;
    private String custoTotalComInsumos;
    private String percentualLucro;
    private String custoPessoal;
    private String valorFinalServico;
    

    public List<BebidaDto> bebidas = new ArrayList<>();   
    
     public List<CarnesDto> carnes = new ArrayList<>();
   
    public List<ServicoDiversoDto> servicoDiversos = new ArrayList<>();
   
    public List<AcompanhamentoDto> acompanhamentos = new ArrayList<>();
}
