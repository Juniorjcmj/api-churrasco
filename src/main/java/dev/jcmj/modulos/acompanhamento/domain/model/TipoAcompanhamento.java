package dev.jcmj.modulos.acompanhamento.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity(name = "tipo_acompanhamento")
public class TipoAcompanhamento extends PanacheEntity{    

    @NotNull(message = "Descrição é obrigatória")
    @Column(name = "descriao")    
    public String descricao;
}
