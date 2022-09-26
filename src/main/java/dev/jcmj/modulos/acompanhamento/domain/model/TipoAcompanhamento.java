package dev.jcmj.modulos.acompanhamento.domain.model;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity(name = "tipo_acompanhamento")
public class TipoAcompanhamento extends PanacheEntity{    

    public String descricao;
}
