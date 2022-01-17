create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

create table tb_categoria (
	id bigint auto_increment,
	nome varchar (50),
	descricao varchar (200),
	primary key (id)
);

insert into tb_categoria(nome,descricao) values ("Aços para Construção","Os aços tem responsabilidade de formar as estruturas do imóvel.");
insert into tb_categoria(nome,descricao) values ("Cimentos","É responsável por oferecer a liga necessária às misturas que vão estruturar a construção e, por isso, é tão importante para o sucesso dos projetos.");
insert into tb_categoria(nome,descricao) values ("Tijolos", "O tijolo é um material indispensável em qualquer construção e está disponível em diversos tipos, que variam conforme o material.");

create table tb_produtos(
	id bigint not null auto_increment,
    nome varchar(255) not null,
    descricao varchar (255) not null,
    quantidade int,
    preco decimal(7,2) not null,
    categoria_id bigint,
    primary key (id),
    foreign key (categoria_id) references tb_categoria (id)
    );

insert into tb_produtos (nome, descricao, quantidade, preco, categoria_id) VALUES ("Arames", "Os arames são importantes para criar cercas em jardins e áreas externas da casa, garantindo uma divisão e, inclusive, a proteção dos espaços.", 20, 279.90, 1);
insert into tb_produtos (nome, descricao, quantidade, preco, categoria_id) VALUES ("Colunas Prontas", "A coluna Pronta de ferro é uma estrutura que já vem pronta para auxiliar na construção.", 50, 194.90, 1);
insert into tb_produtos (nome, descricao, quantidade, preco, categoria_id) VALUES ("Telas de Aço", "A malha de aço é uma estrutura essencial para qualquer construção. ", 20, 59.90, 1);
insert into tb_produtos (nome, descricao, quantidade, preco, categoria_id) VALUES ("Vergalhões", "Nenhuma obra fica em pé sem contar com as colunas, que sustenta e distribuem o peso das paredes e dos tetos com o chão.", 55, 36.90, 1);
insert into tb_produtos (nome, descricao, quantidade, preco, categoria_id) VALUES ("Cimento CP II", "O cimento CP II, por exemplo, é produzido com clínquer (a principal matéria-prima de qualquer cimento) e gesso.", 100, 10.90, 2);
insert into tb_produtos (nome, descricao, quantidade, preco, categoria_id) VALUES ("Cimento CP II-E", "O  cimento CP II-E, indicado para pisos, lajes e pilares e recomendado para áreas com maresia", 35, 26.90, 2);
insert into tb_produtos (nome, descricao, quantidade, preco, categoria_id) VALUES ("Tijolo de Acabamento", "O tijolo de acabamento é usado para decoração e costuma ser aplicado em superfícies já prontas.", 250, 1.80 , 3);
insert into tb_produtos (nome, descricao, quantidade, preco, categoria_id) VALUES ("Tijolo Ecológico", "O tijolo ecológico tem esse nome porque não passa pelo processo de queima, e em sua aplicação exige menos argamassa", 190, 7.68, 3);

select * from tb_produtos where preco > 50;

select * from tb_produtos where preco between 3.00 and 60.00;

select * from tb_produtos where nome like '%c%';

select * from tb_produtos inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id;

select * from tb_produtos inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id where tb_categoria.id = 1
