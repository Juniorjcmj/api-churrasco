package dev.jcmj.modulos.orcamento.domain.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import dev.jcmj.modulos.acompanhamento.domain.model.Acompanhamento;
import dev.jcmj.modulos.bebidas.domain.model.Bebida;
import dev.jcmj.modulos.carnes.domain.model.Carnes;
import dev.jcmj.modulos.clientes.domain.model.Cliente;
import dev.jcmj.modulos.servicosDiversos.domain.model.ServicoDiversos;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Orcamento extends PanacheEntity {
    
    public Date dataEvento;
    public BigDecimal homens;
    public BigDecimal mulheres;
    public BigDecimal criancas;
    public BigDecimal margemSeguranca;
    public BigDecimal comissaoServvico;
    public BigDecimal custoTotalComInsumos;
    public BigDecimal percentualLucro;
    public BigDecimal custoPessoal;
    public BigDecimal valorFinalServico;
    public BigDecimal custoPessoa;

    @OneToOne
    public Cliente cliente;

    @OneToMany
    public List<Bebida> bebdidas = new ArrayList<>();  
    //pegar o relacionamento de classificacao e subclassificacao despesa
    @OneToMany 
    public List<Carnes> carnes = new ArrayList<>();
    @OneToMany
    public List<ServicoDiversos> servicoDiversos = new ArrayList<>();
    @OneToMany
    public List<Acompanhamento> acompanhamentos = new ArrayList<>();

}
