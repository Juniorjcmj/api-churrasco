
package dev.jcmj.modulos.carnes.domain.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "carnes")
public class Carnes extends PanacheEntity {
    
    public String un;
    public BigDecimal custo;
    @Column(name = "tipo_corte")
    @NotNull(message = "Tipo de corte é obrigatório.")
    public String tipoCorte;
    @NotNull(message = "Peso é obrigatório.")
    public BigDecimal kg;
    @NotNull(message = "Item é obrigatório.")
    public String item;
    @NotNull(message = "Preço unitário é obrigatório.")
    @Column(name = "preco_unitario")
    public BigDecimal precoUnitario;
    
    @Column(name = "ate_por_pessoa")
    public Integer atePorPessoa;

}
