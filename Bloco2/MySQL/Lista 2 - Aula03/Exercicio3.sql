create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria (
	id bigint auto_increment,
	nome varchar (50),
	descricao varchar (200),
	primary key (id)
);

insert into tb_categoria(nome,descricao) values ("Antibióticos","Antibióticos são substâncias capazes de eliminar ou impedir a multiplicação de bactérias, por isso são usados no tratamento de infecções bacterianas.");
insert into tb_categoria(nome,descricao) values ("Antitérmicos","Os antitérmicos são medicamentos que ajudam no controle da febre.");
insert into tb_categoria(nome,descricao) values ("Higiene Pessoal", "Produtos voltados para manter uma higiene pessoal saudável.");

create table tb_produtos(
	id bigint not null auto_increment,
    nome varchar(255) not null,
    durabilidade varchar (255) not null,
    quantidade int,
    preco decimal(7,2) not null,
    categoria_id bigint,
    primary key (id),
    foreign key (categoria_id) references tb_categoria (id)
    );

insert into tb_produtos (nome, durabilidade, quantidade, preco, categoria_id) VALUES ("Amoxilina", "Perecível", 100, 65.90, 1);
insert into tb_produtos (nome, durabilidade, quantidade, preco, categoria_id) VALUES ("Azitromicina ", "Perecível", 150, 37.90, 1);
insert into tb_produtos (nome, durabilidade, quantidade, preco, categoria_id) VALUES ("Paracetamol", "Perecível", 200, 22.00, 2);
insert into tb_produtos (nome, durabilidade, quantidade, preco, categoria_id) VALUES ("Ibuprofeno", "Perecível", 200, 64.90, 2);
insert into tb_produtos (nome, durabilidade, quantidade, preco, categoria_id) VALUES ("Pasta de Dente Colgate Pró-Alivio", "Perecível", 55, 2.99, 3);
insert into tb_produtos (nome, durabilidade, quantidade, preco, categoria_id) VALUES ("Absorvente Sempre Livre", "Não-Perecível", 30, 9.90, 3);

select * from tb_produtos where preco > 50;

select * from tb_produtos where preco between 3.00 and 60.00;

select * from tb_produtos where nome like '%b%';

select * from tb_produtos inner join tb_categoria on tb_produtos.id = tb_produtos.categoria_id;

select * from tb_produtos inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id where tb_categoria.id = 3;