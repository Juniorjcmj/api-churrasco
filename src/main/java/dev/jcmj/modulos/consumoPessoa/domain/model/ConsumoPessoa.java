package dev.jcmj.modulos.consumoPessoa.domain.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "consumo_pessoa")
public class ConsumoPessoa extends PanacheEntity {
    
    public String descricao;
    @Column(name = "tipo_convidado")
    public String tipoConvidado;
    public BigDecimal qntdd;
    public String un;
}
