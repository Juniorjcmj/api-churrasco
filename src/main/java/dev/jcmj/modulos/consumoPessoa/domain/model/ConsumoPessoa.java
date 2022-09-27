package dev.jcmj.modulos.consumoPessoa.domain.model;

import java.math.BigDecimal;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class ConsumoPessoa extends PanacheEntity {
    
    public String descricao;
    public String tipoConvidado;
    public BigDecimal qntdd;
    public BigDecimal un;
}
