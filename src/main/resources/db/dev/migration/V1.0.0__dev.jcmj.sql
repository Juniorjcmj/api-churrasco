create sequence hibernate_sequence start 1 increment 1;

    create table acompanhamento (
       id int8 not null,
        valor_total numeric(19, 2),
        descricao varchar(255),
        kg numeric(19, 2),
        tipo_acompanhamento varchar(255),
        valor_un numeric(19, 2),
        primary key (id)
    );

    create table bebida (
       id int8 not null,
        descricao varchar(255),
        qntdd numeric(19, 2),
        valor numeric(19, 2),
        primary key (id)
    );

    create table carnes (
       id int8 not null,
        ate_por_pessoa int4,
        custo numeric(19, 2),
        item varchar(255),
        kg numeric(19, 2),
        preco_unitario numeric(19, 2),
        tipo_corte varchar(255),
        un varchar(255),
        primary key (id)
    );

    create table Cliente (
       id int8 not null,
        cel varchar(255),
        cpf varchar(255),
        email varchar(255),
        nome varchar(255),
        senha varchar(255),
        primary key (id)
    );

    create table consumo_pessoa (
       id int8 not null,
        descricao varchar(255),
        qntdd numeric(19, 2),
        tipo_convidado varchar(255),
        un varchar(255),
        primary key (id)
    );

    create table Orcamento (
       id int8 not null,
        clienteNome varchar(255),
        comissaoServico numeric(19, 2),
        criancas numeric(19, 2),
        custoPessoal numeric(19, 2),
        custoTotalComInsumos numeric(19, 2),
        dataEvento date,
        homens numeric(19, 2),
        margemSeguranca numeric(19, 2),
        mulheres numeric(19, 2),
        percentualLucro numeric(19, 2),
        valorFinalServico numeric(19, 2),
        primary key (id)
    );

    create table orcamento_acompanhamento (
       orcamento_id int8 not null,
        acompanhamento_id int8 not null
    );

    create table orcamento_bebidas (
       orcamento_id int8 not null,
        bebida_id int8 not null
    );

    create table orcamento_carnes (
       orcamento_id int8 not null,
        carnes_id int8 not null
    );

    create table orcamento_servicos_diversos (
       orcamento_id int8 not null,
        servicos_diversos_id int8 not null
    );

    create table servicos_diversos (
       id int8 not null,
        descricao varchar(255),
        qntdd numeric(19, 2),
        tipoServicoDiverso varchar(255),
        valor numeric(19, 2),
        valorTotal numeric(19, 2),
        primary key (id)
    );

    create table tipo_acompanhamento (
       id int8 not null,
        descricao varchar(255),
        primary key (id)
    );

    create table tipo_corte (
       id int8 not null,
        descricao varchar(255),
        primary key (id)
    );

    create table Unidade (
       id int8 not null,
        descricao varchar(255),
        primary key (id)
    );

    alter table if exists orcamento_acompanhamento 
       add constraint UK_fjf45s46xgrwa98lggu2s2i2h unique (acompanhamento_id);

    alter table if exists orcamento_bebidas 
       add constraint UK_o9b2nrvv65ceqethj5sk82e88 unique (bebida_id);

    alter table if exists orcamento_carnes 
       add constraint UK_7s1s21jgoptumda3c9xxvjqhq unique (carnes_id);

    alter table if exists orcamento_servicos_diversos 
       add constraint UK_2rk5c9myrh7r4cjajkpevl18i unique (servicos_diversos_id);

    alter table if exists orcamento_acompanhamento 
       add constraint FKge1gjbn3u57wd3bafmt3f4p77 
       foreign key (acompanhamento_id) 
       references acompanhamento;

    alter table if exists orcamento_acompanhamento 
       add constraint FKm08rk7381k8k2xvm9u5lta4ti 
       foreign key (orcamento_id) 
       references Orcamento;

    alter table if exists orcamento_bebidas 
       add constraint FKl7no702i3vf5bnweoghs2rt6i 
       foreign key (bebida_id) 
       references bebida;

    alter table if exists orcamento_bebidas 
       add constraint FK6j0k6djbkbn13yjil2ossq78d 
       foreign key (orcamento_id) 
       references Orcamento;

    alter table if exists orcamento_carnes 
       add constraint FKkygogoibnxv72e9vnrfn4s0gf 
       foreign key (carnes_id) 
       references carnes;

    alter table if exists orcamento_carnes 
       add constraint FK8mc2t9k9olntt894g85n8ga4h 
       foreign key (orcamento_id) 
       references Orcamento;

    alter table if exists orcamento_servicos_diversos 
       add constraint FKbdtbcmjxb5wrmjmpris8gjveh 
       foreign key (servicos_diversos_id) 
       references servicos_diversos;

    alter table if exists orcamento_servicos_diversos 
       add constraint FK7wp2frw7cat19qxyaot227se9 
       foreign key (orcamento_id) 
       references Orcamento;
insert into bebida (id, descricao, valor, qntdd) values(1, 'Cerveja', 12.00, 25.00);
insert into bebida (id, descricao, valor, qntdd) values(2, 'Refigerante', 9.00, 18.00);
insert into bebida (id, descricao, valor, qntdd) values(3, 'Água', 4.00, 30.00);
insert into bebida (id, descricao, valor, qntdd) values(4, 'Suco da Fruta', 11.00, 20.00);
insert into bebida (id, descricao, valor, qntdd) values(5, 'Wisk', 25.00, 10.00);
insert into tipo_acompanhamento(id, descricao) values(1, 'Quente');
insert into tipo_acompanhamento(id, descricao) values(2, 'Frio');
insert into tipo_acompanhamento(id, descricao) values(3, 'Feijão');
insert into tipo_acompanhamento(id, descricao) values(4, 'Farofa');
insert into tipo_acompanhamento(id, descricao) values(5, 'Legumes');
insert into acompanhamento(id, descricao, kg, valor_un, valor_total, tipo_acompanhamento) values(1, 'Salada verde', 1.00, 2.00, 2.00, 'Frio');
insert into acompanhamento(id, descricao, kg, valor_un, valor_total, tipo_acompanhamento) values(2, 'Salada Vegana', 1.00, 2.00, 2.00, 'Frio');
insert into acompanhamento(id, descricao, kg, valor_un, valor_total, tipo_acompanhamento) values(3, 'Tomade temperado', 1.00, 2.00, 2.00, 'Entrada');
insert into acompanhamento(id, descricao, kg, valor_un, valor_total, tipo_acompanhamento) values(4, 'Azeitona', 1.00, 2.00, 2.00, 'Entrada');
insert into acompanhamento(id, descricao, kg, valor_un, valor_total, tipo_acompanhamento) values(5, 'Ricota', 1.00, 2.00, 2.00, 'Salada');
insert into tipo_corte(id, descricao) values(1, 'Americano');
insert into tipo_corte(id, descricao) values(2, 'Paulistinha');
insert into tipo_corte(id, descricao) values(3, 'Português');
insert into tipo_corte(id, descricao) values(4, 'Tradicional');
insert into tipo_corte(id, descricao) values(5, 'Grelha');
insert into unidade(id, descricao) values(1, 'KG');
insert into unidade(id, descricao) values(2, 'Pacote');
insert into unidade(id, descricao) values(3, 'Litro');
insert into unidade(id, descricao) values(4, 'Engradado');
insert into unidade(id, descricao) values(5, 'Caixa');
insert into carnes (id, custo, tipo_corte, kg, item, preco_unitario, ate_por_pessoa) values(1, 10.00, 'Americano', 0.5, 'Maminha', 18.00, 5.00);
insert into carnes (id, custo, tipo_corte, kg, item, preco_unitario, ate_por_pessoa) values(2, 12.50, 'Paulistinha', 0.5, 'Chuleta', 21.00, 5.00);
insert into carnes (id, custo, tipo_corte, kg, item, preco_unitario, ate_por_pessoa) values(3, 15.00, 'Tradicional', 0.5, 'Picanha', 25.00, 5.00);
insert into carnes (id, custo, tipo_corte, kg, item, preco_unitario, ate_por_pessoa) values(4, 9.00, 'Grelha', 0.5, 'Bola da pá', 12.00, 5.00);
insert into carnes (id, custo, tipo_corte, kg, item, preco_unitario, ate_por_pessoa) values(5, 7.00, 'Português', 0.5, 'Coração da Alcatra', 14.00, 5.00);
insert into consumo_pessoa(id, descricao, tipo_convidado, qntdd, un) values(1, 'Carne', 'Homem', 0.50, 'KG');
insert into consumo_pessoa(id, descricao, tipo_convidado, qntdd, un) values(2, 'Carne', 'Mulher', 0.50, 'KG');
insert into consumo_pessoa(id, descricao, tipo_convidado, qntdd, un) values(3, 'Carne', 'Criança', 0.50, 'KG');
insert into consumo_pessoa(id, descricao, tipo_convidado, qntdd, un) values(4, 'Acompanhamento Quente', 'Homem', 0.30, 'KG');
insert into consumo_pessoa(id, descricao, tipo_convidado, qntdd, un) values(5, 'Acompanhamento Quente', 'Mulher', 0.30, 'KG');
insert into consumo_pessoa(id, descricao, tipo_convidado, qntdd, un) values(6, 'Acompanhamento Quente', 'Criança', 0.30, 'KG');
insert into consumo_pessoa(id, descricao, tipo_convidado, qntdd, un) values(7, 'Acompanhamento frio', 'Homem', 0.20, 'KG');
insert into consumo_pessoa(id, descricao, tipo_convidado, qntdd, un) values(8, 'Acompanhamento frio', 'Mulher', 0.20, 'KG');
insert into consumo_pessoa(id, descricao, tipo_convidado, qntdd, un) values(9, 'Acompanhamento frio', 'Criança', 0.10, 'KG');
insert into consumo_pessoa(id, descricao, tipo_convidado, qntdd, un) values(10, 'Cerveja', 'Homem', 4.00, 'Litro');
insert into consumo_pessoa(id, descricao, tipo_convidado, qntdd, un) values(11, 'Cerveja', 'Mulher', 4.00, 'Litro');
insert into consumo_pessoa(id, descricao, tipo_convidado, qntdd, un) values(12, 'Cerveja', 'Criança', 0.00, 'Litro');
insert into consumo_pessoa(id, descricao, tipo_convidado, qntdd, un) values(13, 'Refrigerante', 'Homem', 0.80, 'Litro');
insert into consumo_pessoa(id, descricao, tipo_convidado, qntdd, un) values(14, 'Refrigerante', 'Mulher', 0.80, 'Litro');
insert into consumo_pessoa(id, descricao, tipo_convidado, qntdd, un) values(15, 'Refrigerante', 'Criança', 0.80, 'Litro');
insert into consumo_pessoa(id, descricao, tipo_convidado, qntdd, un) values(16, 'Suco', 'Homem', 0.50, 'Litro');
insert into consumo_pessoa(id, descricao, tipo_convidado, qntdd, un) values(17, 'Suco', 'Mulher', 0.50, 'Litro');
insert into consumo_pessoa(id, descricao, tipo_convidado, qntdd, un) values(18, 'Suco', 'Criança', 0.50, 'Litro');
insert into consumo_pessoa(id, descricao, tipo_convidado, qntdd, un) values(19, 'Àgua', 'Homem', 1.00, 'Litro');
insert into consumo_pessoa(id, descricao, tipo_convidado, qntdd, un) values(20, 'Àgua', 'Mulher', 1.00, 'Litro');
insert into consumo_pessoa(id, descricao, tipo_convidado, qntdd, un) values(21, 'Àgua', 'Criança', 1.00, 'Litro');
