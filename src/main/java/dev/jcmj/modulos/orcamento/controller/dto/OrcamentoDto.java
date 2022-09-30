package dev.jcmj.modulos.orcamento.controller.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    private String dataEvento;
    private String homens;
    private String mulheres;
    private String criancas;
    private String clienteNome;    
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
