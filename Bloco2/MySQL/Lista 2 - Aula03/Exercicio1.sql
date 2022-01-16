create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe (
id bigint auto_increment,
nome varchar (50),
descricao varchar (200),
primary key (id)
);

insert into tb_classe (nome, descricao) values ("Guerreiro", "Guerreiros são exímios lutadores marciais, sempre prontos para o combate");
insert into tb_classe (nome, descricao) values ("Mago", "Se distingue pela capacidade de lançar certos tipos de magia, mas sendo fraco em combate");
insert into tb_classe (nome, descricao) values ("Paladino", "São campeões da justiça, bondade e lealdade.");
insert into tb_classe (nome, descricao) values ("Caçador", "É um predador vivendo de seu conhecimento de sobrevivência e habilidade com o arco ou a lança.");
insert into tb_classe (nome, descricao) values ("Sacerdote", "Mestres das artes da cura conservam seus companheiros em combate.");

create table tb_personagem (
id bigint auto_increment,
nome varchar (50),
raca varchar(50),
pontoAtaque int,
poderDefesa int,
classe_id bigint,
primary key (id),
foreign key (classe_id) references tb_classe(id)
);

insert into tb_personagem(nome, raca, pontoAtaque, poderDefesa, classe_id) values ("Aggrias", "Humana",1500,2500,3); 
insert into tb_personagem(nome, raca, pontoAtaque, poderDefesa, classe_id) values ("Ferdanne","Elfa",3000,3000,2); 
insert into tb_personagem(nome, raca, pontoAtaque, poderDefesa, classe_id) values ("Nasisum","Goblim",2450,1990,4); 
insert into tb_personagem(nome, raca, pontoAtaque, poderDefesa, classe_id) values ("Grimeal","Anão",1100,1900,1); 
insert into tb_personagem(nome, raca, pontoAtaque, poderDefesa, classe_id) values ("Gendalf","Humano",4600,4500,2); 

select * from tb_personagem where pontoAtaque > 2000;

select * from tb_personagem where poderDefesa between 1000 and 2000;

select * from tb_personagem where nome like '%c%';

select * from tb_personagem inner join tb_classe on tb_classe.id = tb_personagem.classe_id;

select * from tb_personagem inner join tb_classe on tb_classe.id = tb_personagem.classe_id where classe_id = 2;