package dev.jcmj.modulos.bebidas.domain.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "bebida")
public class Bebida  extends PanacheEntity{
    
    public String descricao;
    public  BigDecimal valor;
    public  BigDecimal qntdd;
   
   
}
