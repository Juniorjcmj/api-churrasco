package dev.jcmj.modulos.clientes.domain.model;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Cliente extends PanacheEntity {
    

    @NotNull(message = "Nome é obrigatório.")
    public String nome;
    public String cpf;
    @Email
    public String email;
    @NotNull(message = "Contato é obrigatório.")
    public String cel;
    public String senha;
}
