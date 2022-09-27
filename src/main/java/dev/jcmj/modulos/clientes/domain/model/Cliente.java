package dev.jcmj.modulos.clientes.domain.model;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Cliente extends PanacheEntity {
    

    public String nome;
    public String cpf;
    public String email;
    public String cel;
    public String senha;
}
