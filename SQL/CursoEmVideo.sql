create database aulaguanabara
default character set utf8mb4
default collate utf8mb4_general_ci;

create table pessoas (
id int NOT NULL auto_increment,
nome varchar (30) NOT NULL,
nascimento date,
sexo enum ('M', 'F'),
peso decimal (5,2),
altura decimal (3,2),
nacionalidade varchar (20) DEFAULT 'Brasil',
PRIMARY KEY (id)
) default charset = utf8mb4;
desc pessoas;
select * from pessoas;

insert into pessoas values
(default, 'Godofredo', '1984-01-02', 'M', '78.5', '1.83', 'Brasil'),
(default, 'Maria','1999-12-30', 'F', '55.2', '1.65', 'Portugal'),
(default, 'Creuza', '1920-12-30', 'F', '50.2', '1.65', default),
(default, 'Adalgiza', '1930-11-2', 'F', '63.2', '1.75', 'Irlanda'),
(default, 'Ana', '1975-12-22', 'F', '52.3', '1.45', 'EUA'),
(default, 'Pedro', '2000-07-15', 'M', '52.3', '1.45', default),
(default, 'Maria', '1999-05-30', 'F', '75.9', '1.70', 'Porgual'),
(default, 'Matheus', '1990-08-16', 'M', '98.6', '1.70', default),
(default, 'Cláudio', '1975-4-22', 'M', '99', '2.15', 'Brasil'),
(default, 'Pedro', '1999-12-3', 'M', '87', '2', default),
(default, 'Janaína', '1987-11-12', 'F', '75.4', '1.66', 'EUA');
