package dev.jcmj.modulos.acompanhamento.domain.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "acompanhamento")
public class Acompanhamento extends PanacheEntity {


    public String descricao;
    public  BigDecimal kg;
    @Column(name = "valor_un")
    public  BigDecimal valorUn;
    @Column(name = "valor_total")
    public  BigDecimal ValorTotal;
    @Column(name = "tipo_acompanhamento")    
    public String tipoAcompanhamento;
    public static List<Acompanhamento> findBySeason(String tipo) {       
        return find("tipoAcompanhamento", tipo).list();
    }
    
}
