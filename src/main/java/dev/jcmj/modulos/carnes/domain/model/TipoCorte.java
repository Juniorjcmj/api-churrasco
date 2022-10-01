package dev.jcmj.modulos.carnes.domain.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "tipo_corte")
public class TipoCorte extends PanacheEntity{
    
    public String descricao;
}
