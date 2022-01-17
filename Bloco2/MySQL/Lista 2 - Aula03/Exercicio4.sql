create database db_cidade_das_frutas;

use db_cidade_das_frutas;

create table tb_categoria (
	id bigint auto_increment,
	nome varchar (50),
	descricao varchar (200),
	primary key (id)
);

insert into tb_categoria(nome,descricao) values ("Frutas Ácidas","As frutas desta categoria possuem os ácidos mais fortes. Também chamadas de cítricas.");
insert into tb_categoria(nome,descricao) values ("Frutas Doces","A principal característica desse grupo é o alto teor do açúcar típico das frutas, a frutose.");
insert into tb_categoria(nome,descricao) values ("Frutas hiper-hídricas", "Mais de 90% da composição desses alimentos é de água. São uma ótima opção para os dias quentes e em casos de desidratação.");

create table tb_produtos(
	id bigint not null auto_increment,
    nome varchar(255) not null,
    aparenciaVisual varchar (255) not null,
    quantidade int,
    preco decimal(7,2) not null,
    categoria_id bigint,
    primary key (id),
    foreign key (categoria_id) references tb_categoria (id)
    );

insert into tb_produtos (nome, aparenciaVisual, quantidade, preco, categoria_id) VALUES ("Abacaxi", "Amarelo e Verde", 20, 19.90, 1);
insert into tb_produtos (nome, aparenciaVisual, quantidade, preco, categoria_id) VALUES ("Laranja", "Verde e Aamarela", 100, 3.90, 1);
insert into tb_produtos (nome, aparenciaVisual, quantidade, preco, categoria_id) VALUES ("Limão", "Verde", 100, 4.90, 1);
insert into tb_produtos (nome, aparenciaVisual, quantidade, preco, categoria_id) VALUES ("Morango", "Vermelho e Verde", 100, 4.90, 1);
insert into tb_produtos (nome, aparenciaVisual, quantidade, preco, categoria_id) VALUES ("Banana", "Amarela", 50, 2.90, 2);
insert into tb_produtos (nome, aparenciaVisual, quantidade, preco, categoria_id) VALUES ("Mamão Papaia", "Laranja e Verde", 12, 20.80, 2);
insert into tb_produtos (nome, aparenciaVisual, quantidade, preco, categoria_id) VALUES ("Melancia", "Vemelha e verde", 15,55.90,3);
insert into tb_produtos (nome, aparenciaVisual, quantidade, preco, categoria_id) VALUES ("Melão", "Amarelo", 10, 12.90,3);

select * from tb_produtos where preco > 50;

select * from tb_produtos where preco between 3.00 and 60.00;

select * from tb_produtos where nome like '%c%';

select * from tb_produtos inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id;

select * from tb_produtos inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id where tb_categoria.id = 1;