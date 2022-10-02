package dev.jcmj.modulos.carnes.domain.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "tipo_corte")
public class TipoCorte extends PanacheEntity{
    
    @NotNull(message = "Descrição é obrigatório.")
    public String descricao;
}
