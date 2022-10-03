package dev.jcmj.modulos.servicosDiversos.domain.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "servicos_diversos")
public class ServicoDiversos extends PanacheEntity {


    @NotNull(message = "Descrição é obrigatória")
    public String descricao;
    @NotNull(message = "Serviço diverso é obrigatório")
    public String tipoServicoDiverso;
    @NotNull(message = "Quantidade é obrigatória")
    public BigDecimal qntdd;
    @NotNull(message = "Valor é obrigatório")
    public BigDecimal valor;
    public BigDecimal valorTotal;
    
}
