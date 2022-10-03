package dev.jcmj.modulos.consumoPessoa.domain.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "consumo_pessoa")
public class ConsumoPessoa extends PanacheEntity {
    @NotBlank(message = "Descrição é obrigatória")
    public String descricao;
    @Column(name = "tipo_convidado")
    @NotNull(message = "Tipo de convidado é obrigatório")
    public String tipoConvidado;
    @NotNull(message = "Quantidade é obrigatória")
    public BigDecimal qntdd;
    @NotNull(message = "Unidade é obrigatória")
    public String un;
}
