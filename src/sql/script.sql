-- Script para criar uma tabela de produtos em linguagem SQL 
-- Nome de tabelas podem ser definidos no plural

CREATE TABLE alunos(
	id         				SERIAL  			PRIMARY KEY,
	nome       				VARCHAR(150) 		NOT NULL,
	Telefone   				VARCHAR(20) 		NOT NULL,
	Matricula       		VARCHAR(10) 		NOT NULL,
	Data_nascimento 		DATE        		NOT NULL,
	Data_cadastro 			TIMESTAMP 			DEFAULT NOW ()
);