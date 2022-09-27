package dev.jcmj.modulos.carnes.domain.model;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Unidade extends PanacheEntity{
    
    public String descricao;
}
