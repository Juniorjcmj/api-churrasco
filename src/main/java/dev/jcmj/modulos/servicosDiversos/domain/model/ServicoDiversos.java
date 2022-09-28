package dev.jcmj.modulos.servicosDiversos.domain.model;

import java.math.BigDecimal;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class ServicoDiversos extends PanacheEntity {


    public String descricao;
    public String tipoServicoDiverso;
    public BigDecimal qntdd;
    public BigDecimal valor;
    public BigDecimal valorTotal;
    
}
