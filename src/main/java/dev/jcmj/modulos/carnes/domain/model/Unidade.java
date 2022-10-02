package dev.jcmj.modulos.carnes.domain.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Unidade extends PanacheEntity{
    
    @NotNull(message = "Descrição é obrigatória.")
    public String descricao;
}
