create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categorias(
id bigint not null auto_increment,
descricao varchar(255) not null,
ativo boolean,
primary key (id)
);

insert into tb_categorias (descricao, ativo) values ("Antialérgicos", true);
insert into tb_categorias (descricao, ativo) values ("Antibióticos", true);
insert into tb_categorias (descricao, ativo) values ("Antitérmicos", true);
insert into tb_categorias (descricao, ativo) values ("Beleza", true);
insert into tb_categorias (descricao, ativo) values ("Higiene Pessoal", true);

select * from tb_categorias;

create table tb_produtos(
id bigint not null auto_increment,
nome varchar(255) not null,
dtvalidade date,
quantidade int,
preco decimal(7,2),
categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categorias(id)
);

insert into tb_produtos(nome, dtvalidade, quantidade, preco, categoria_id) values("Allegra - Fexofenadina", 2023-12-21, 50, 44.46, 1);
insert into tb_produtos(nome, dtvalidade, quantidade, preco, categoria_id) values("Dipirona 500MG", 2023-10-09, 150, 13.12, 3);
insert into tb_produtos(nome, dtvalidade, quantidade, preco, categoria_id) values("Amoxicilina 500MG", 2024-02-15, 100, 20.85, 2);
insert into tb_produtos(nome, dtvalidade, quantidade, preco, categoria_id) values("Pantene Bambu Shampoo", 2022-12-21, 20, 20.46, 4);
insert into tb_produtos(nome, dtvalidade, quantidade, preco, categoria_id) values("Pasta de Dente Colgate Pró-Alívio", 2022-07-25, 50, 11.02, 5);

select * from tb_produtos;

select * from tb_produtos where preco > 50;

select * from tb_produtos where preco between 3 and 60;

select * from tb_produtos where nome like "%A%";

select * from tb_produtos inner join tb_categorias
on tb_categorias.id = tb_produtos.categoria_id;

select * from tb_produtos inner join tb_categorias
on tb_categorias.id = tb_produtos.categoria_id
where tb_categorias.id = 3;
