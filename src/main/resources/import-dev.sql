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
 
  
  