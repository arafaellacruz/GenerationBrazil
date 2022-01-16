create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria (
id bigint auto_increment,
tipoSabor varchar(255) not null,
caracteristica varchar (255) not null,
primary key (id)
);

insert into tb_categoria (tipoSabor,caracteristica) values ("Salgada","Normal"); -- 1 --
insert into tb_categoria (tipoSabor,caracteristica) values ("Salgada","Vegetariana"); -- 2 --
insert into tb_categoria (tipoSabor,caracteristica) values ("Salgada","Vegana"); -- 3 --
insert into tb_categoria (tipoSabor,caracteristica) values ("Doce","Normal"); -- 4 --
insert into tb_categoria (tipoSabor,caracteristica) values ("Doce","Vegetariana"); -- 5 --

create table tb_pizza (
id bigint auto_increment,
sabor varchar (50) not null,
tamanho  varchar (50) not null,
preco decimal (4,2) not null,
quantidade int not null,
categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria (id)
);

insert into tb_pizza (sabor,tamanho,preco,quantidade,categoria_id) values ("Calabreza","Grande",32.90,5,1);
insert into tb_pizza (sabor,tamanho,preco,quantidade,categoria_id) values ("Brócolis","Média",28.75,3,3);
insert into tb_pizza (sabor,tamanho,preco,quantidade,categoria_id) values ("Abobrinha","Média",25.80,2,3);
insert into tb_pizza (sabor,tamanho,preco,quantidade,categoria_id) values ("Quatro Queijos","Grande",29.90,6,2);
insert into tb_pizza (sabor,tamanho,preco,quantidade,categoria_id) values ("Pepperoni","Grande",52.90,5,1);
insert into tb_pizza (sabor,tamanho,preco,quantidade,categoria_id) values ("Frango com catupiry","Grande",28.90,4,1);
insert into tb_pizza (sabor,tamanho,preco,quantidade,categoria_id) values ("Romeu e Julieta","Média",47.80,3,4);
insert into tb_pizza (sabor,tamanho,preco,quantidade,categoria_id) values ("Baunilha","Média",27.90,4,5);

select * from tb_pizza where preco > 45;

select * from tb_pizza where preco between 29 and 60;

select * from tb_pizza where sabor like '%c%';

select * from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id;

select * from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id where categoria_id = 3;