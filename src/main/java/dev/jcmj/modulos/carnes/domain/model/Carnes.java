
package dev.jcmj.modulos.carnes.domain.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "carnes")
public class Carnes extends PanacheEntity {
    
    public String un;
    public BigDecimal custo;
    @Column(name = "tipo_corte")
    public String tipoCorte;
    public BigDecimal kg;
    public String item;
    @Column(name = "preco_unitario")
    public BigDecimal precoUnitario;
    @Column(name = "ate_por_pessoa")
    public Integer atePorPessoa;

}
