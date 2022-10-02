package dev.jcmj.modulos.bebidas.domain.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "bebida")
public class Bebida  extends PanacheEntity{
    
    @NotNull(message = "Descrição é obrigatória")
    public String descricao;
    @NotNull(message = "Valor é obrigatório")
    public  BigDecimal valor;
    @NotNull(message = "Quantidade é obrigatória")
    public  BigDecimal qntdd;
   
   
}
