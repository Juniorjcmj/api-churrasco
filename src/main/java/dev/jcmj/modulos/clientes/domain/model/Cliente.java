package dev.jcmj.modulos.clientes.domain.model;

import javax.persistence.Entity;
import javax.validation.constraints.Email;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Cliente extends PanacheEntity {
    

    public String nome;
    public String cpf;
    @Email
    public String email;
    public String cel;
    public String senha;
}
