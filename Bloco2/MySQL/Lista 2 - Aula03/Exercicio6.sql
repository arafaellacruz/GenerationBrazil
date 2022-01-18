create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;

create table tb_categoria(
id bigint auto_increment,
tipo varchar(20) not null,
vagas int not null,
primary key (id)
);

INSERT INTO tb_categoria (tipo, vagas) VALUES ("EAD",80);
INSERT INTO tb_categoria (tipo, vagas) VALUES ("Presencial", 60);

create table tb_curso (
id bigint auto_increment,
nome varchar (255) not null,
inicioAulas date,
fimAulas date,
mensalidade decimal(6,2) not null,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

INSERT INTO tb_curso (nome, inicioAulas, fimAulas, mensalidade, categoria_id) VALUES ("Ciência da Computação", "2022-02-01", "2022-12-20", 570.00,1);
INSERT INTO tb_curso (nome, inicioAulas, fimAulas, mensalidade, categoria_id) VALUES ("Ciência da Computação", "2022-02-01", "2022-12-20", 770.00,2);
INSERT INTO tb_curso (nome, inicioAulas, fimAulas, mensalidade, categoria_id) VALUES ("Análise e Desenvolvimento de Sistemas", "2022-02-01", "2022-12-20", 360.00,1);
INSERT INTO tb_curso (nome, inicioAulas, fimAulas, mensalidade, categoria_id) VALUES ("Análise e Desenvolvimento de Sistemas", "2022-02-01", "2022-12-20", 470.00,2);

select * from tb_curso where mensalidade > 50;

select * from tb_curso where mensalidade between 3 and 60;

select * from tb_curso where nome like "%j%";

select * from tb_curso inner join tb_categoria on tb_categoria.id = tb_curso.categoria_id;

select * from tb_curso inner join tb_categoria on tb_categoria.id = tb_curso.categoria_id where tb_categoria.id = 2;