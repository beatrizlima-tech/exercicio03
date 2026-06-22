# 🎓 Sistema de Cadastro de Alunos

Aplicação desenvolvida em Java para cadastro de alunos com persistência de dados em banco PostgreSQL utilizando JDBC.

O sistema realiza a captura de informações pelo terminal e armazena os dados em uma tabela no banco de dados.

## 🚀 Tecnologias Utilizadas

* Java
* JDBC
* PostgreSQL
* SQL
* Programação Orientada a Objetos (POO)

## 📋 Funcionalidades

* Cadastro de alunos
* Armazenamento em banco de dados PostgreSQL
* Conversão e validação de datas
* Conexão com banco utilizando JDBC
* Organização em camadas (Controller, Repository, Entity e Factory)

## 🏗️ Estrutura do Projeto

```text
src
│
├── controllers
│   └── AlunoController
│
├── entities
│   └── Aluno
│
├── repositories
│   └── AlunoRepository
│
└── factories
    └── ConnectionFactory
```

## 📊 Modelo de Dados

A aplicação utiliza a tabela:

```sql
CREATE TABLE alunos(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(150) NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    matricula VARCHAR(10) NOT NULL,
    data_nascimento DATE NOT NULL,
    data_cadastro TIMESTAMP DEFAULT NOW()
);
```

## 🖥️ Funcionamento

O usuário informa:

* Nome
* Telefone
* Matrícula
* Data de nascimento

Após a validação dos dados, o sistema realiza a inserção do aluno no banco PostgreSQL.

## ⚙️ Configuração do Banco

Crie um banco de dados chamado:

```text
bdexercicio03
```

Configure as credenciais de conexão na classe:

```java
ConnectionFactory
```

## 🎯 Objetivo do Projeto

Projeto desenvolvido para praticar:

* Programação Orientada a Objetos
* JDBC
* Integração Java com PostgreSQL
* Manipulação de datas
* Estruturação de aplicações em camadas
* Operações de persistência de dados

## 👩‍💻 Desenvolvedora

Beatriz Lima

GitHub:
https://github.com/beatrizlima-tech
