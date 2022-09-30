package dev.jcmj.modulos.servicosDiversos.domain.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "servicos_diversos")
public class ServicoDiversos extends PanacheEntity {


    public String descricao;
    public String tipoServicoDiverso;
    public BigDecimal qntdd;
    public BigDecimal valor;
    public BigDecimal valorTotal;
    
}
