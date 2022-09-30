package dev.jcmj.modulos.orcamento.domain.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import dev.jcmj.modulos.acompanhamento.domain.model.Acompanhamento;
import dev.jcmj.modulos.bebidas.domain.model.Bebida;
import dev.jcmj.modulos.carnes.domain.model.Carnes;
import dev.jcmj.modulos.clientes.domain.model.Cliente;
import dev.jcmj.modulos.orcamento.domain.model.Orcamento;
import dev.jcmj.modulos.servicosDiversos.domain.model.ServicoDiversos;


public class OrcamentoBuilder {

   Orcamento instancia;

   public  OrcamentoBuilder(){
     this.instancia = new Orcamento();
    }

    public  OrcamentoBuilder(Orcamento model){
        this.instancia = model;
    }
    
//     public OrcamentoBuilder setDataEvento(LocalDate dataEvento){
//         this.instancia.dataEvento = dataEvento;
//         return this;
//     }
//     public OrcamentoBuilder setHomens(BigDecimal homens, BigDecimal mulheres, BigDecimal criancas){
//         this.instancia.homens = homens;
//         this.instancia.mulheres = mulheres;
//         this.instancia.criancas = criancas;
//         return this;
//     }
//     public OrcamentoBuilder setMargemSeguranca(BigDecimal margemSeguranca){
//         this.instancia.margemSeguranca = margemSeguranca;
//         return this;
//     }
//     public OrcamentoBuilder setComissaoServico(BigDecimal comissaoServico){
//         this.instancia.comissaoServico = comissaoServico;
//         return this;
//     }
//     public OrcamentoBuilder setCustoTotalInsumo(BigDecimal custoTotalComInsumos){
//         this.instancia.custoTotalComInsumos = custoTotalComInsumos;
//         return this;
//     }
//     public OrcamentoBuilder setPercentualLucro(BigDecimal percentualLucro){
//         this.instancia.percentualLucro = percentualLucro;
//         return this;
//     }
//     public OrcamentoBuilder setCustoPessoal(BigDecimal custoPessoal){
//         this.instancia.custoPessoal = custoPessoal;
//         return this;
//     }
//     public OrcamentoBuilder setValorFinalServico(BigDecimal valorFinalServico){
//         this.instancia.valorFinalServico = valorFinalServico;
//         return this;
//     }
//     // public OrcamentoBuilder setCliente(Cliente cliente){
//     //     this.instancia.cliente = cliente;
//     //     return this;
//     // }
//     public OrcamentoBuilder setBebidas(List<Bebida> bebidas){
//        // this.instancia.bebidas = bebidas;
//         return this;
//     }
//     public OrcamentoBuilder setAcompanhamentos(List<Acompanhamento> acompanhamentos){
//       //  this.instancia.acompanhamentos = acompanhamentos;
//         return this;
//     }
//     public OrcamentoBuilder setCarnes(List<Carnes> carnes){
//       //  this.instancia.carnes = carnes;
//         return this;
//     }
//     public OrcamentoBuilder setServicosDiversos(List<ServicoDiversos> servicoDiversos){
//     //    this.instancia.servicoDiversos = servicoDiversos;
//         return this;
//     }
//     public OrcamentoBuilder setNomeCliente(String clienteNome){
//         this.instancia.clienteNome = clienteNome;
//         return this;
//     }
    public Orcamento construir(){
        return this.instancia;
    }
}
