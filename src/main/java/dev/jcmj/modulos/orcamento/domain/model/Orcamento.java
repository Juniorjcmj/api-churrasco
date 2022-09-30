package dev.jcmj.modulos.orcamento.domain.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import dev.jcmj.modulos.acompanhamento.domain.model.Acompanhamento;
import dev.jcmj.modulos.bebidas.domain.model.Bebida;
import dev.jcmj.modulos.carnes.domain.model.Carnes;
import dev.jcmj.modulos.servicosDiversos.domain.model.ServicoDiversos;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Orcamento extends PanacheEntity {
    
    public LocalDate  dataEvento;
    public String clienteNome;
     public BigDecimal homens;
     public BigDecimal mulheres;
     public BigDecimal criancas;
     public BigDecimal margemSeguranca;
     public BigDecimal comissaoServico;
     public BigDecimal custoTotalComInsumos;
     public BigDecimal percentualLucro;
     public BigDecimal custoPessoal;
     public BigDecimal valorFinalServico;


    // @OneToOne
    // public Cliente cliente;

    @Column(name = "lista_bebidas")
    @OneToMany
    @JoinTable(name = "orcamento_bebidas", joinColumns = {@JoinColumn(name= "orcamento_id", referencedColumnName = "id")},
               inverseJoinColumns = {@JoinColumn(name="bebida_id", referencedColumnName = "id")})
    public List<Bebida> bebidas = new ArrayList<>();  
   
    @Column(name = "lista_servicos_diversos")
    @OneToMany
    @JoinTable(name = "orcamento_servicos_diversos",joinColumns ={@JoinColumn(name = "orcamento_id", referencedColumnName = "id")},
               inverseJoinColumns = {@JoinColumn(name="servicos_diversos_id", referencedColumnName = "id")} )
    public List<ServicoDiversos> servicoDiversos = new ArrayList<>();

    @Column(name = "lista_carnes")
    @OneToMany 
    @JoinTable(name = "orcamento_carnes", joinColumns = {@JoinColumn(name= "orcamento_id", referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name="carnes_id", referencedColumnName = "id")})
    public List<Carnes> carnes = new ArrayList<>();

    @Column(name = "lista_acompanhamento")
    @OneToMany
    @JoinTable(name = "orcamento_acompanhamento", joinColumns = {@JoinColumn(name= "orcamento_id", referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name="acompanhamento_id", referencedColumnName = "id")})
    public List<Acompanhamento> acompanhamentos = new ArrayList<>();

}
