
package dev.jcmj.modulos.carnes.domain.model;

import java.math.BigDecimal;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Carnes extends PanacheEntity {
    
    public String un;
    public BigDecimal custo;
    public String tipoCorte;
    public BigDecimal kg;
    public String item;
    public BigDecimal precoUnitario;
    public Integer atePorPessoa;

}
