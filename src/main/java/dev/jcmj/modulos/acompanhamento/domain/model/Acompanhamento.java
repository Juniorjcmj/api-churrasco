package dev.jcmj.modulos.acompanhamento.domain.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "acompanhamento")
public class Acompanhamento extends PanacheEntity {

    @NotNull(message = "Descrição é obrigatória")
    public String descricao;
    
    @NotNull(message = "Peso é obrigatório")
    public  BigDecimal kg;

    @NotNull(message = "Valor é obrigatório")
    @Column(name = "valor_un")
    public  BigDecimal valorUn;

    @Column(name = "valor_total")
    public  BigDecimal ValorTotal;

    @NotNull(message = "Tipo é obrigatório")
    @Column(name = "tipo_acompanhamento")    
    public String tipoAcompanhamento;

    public static List<Acompanhamento> findBySeason(String tipo) {       
        return find("tipoAcompanhamento", tipo).list();
    }
    
}
