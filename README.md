# 🎓 Sistema de Cadastro de Alunos

![Java](https://img.shields.io/badge/Java-21-red?style=for-the-badge\&logo=openjdk)
![JDBC](https://img.shields.io/badge/JDBC-Database-orange?style=for-the-badge)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-blue?style=for-the-badge\&logo=postgresql)
![Build](https://img.shields.io/badge/build-passing-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/license-MIT-lightgrey?style=for-the-badge)

---

# 📌 Sobre o projeto

O **Sistema de Cadastro de Alunos** é uma aplicação Java desenvolvida para registrar alunos em um banco de dados PostgreSQL utilizando **JDBC**.

A aplicação realiza a captura dos dados pelo terminal, valida as informações fornecidas e realiza a persistência no banco de dados, aplicando conceitos fundamentais de Programação Orientada a Objetos, SQL e arquitetura em camadas.

Este projeto foi desenvolvido como prática de integração entre aplicações Java e bancos de dados relacionais.

---

# 🚀 Funcionalidades

* Cadastro de alunos
* Persistência de dados em PostgreSQL
* Conversão e validação de datas
* Integração com JDBC
* Organização em camadas
* Entrada de dados pelo terminal

---

# 🧱 Tecnologias Utilizadas

* Java 21
* JDBC
* PostgreSQL
* SQL
* Maven
* Programação Orientada a Objetos (POO)

---

# 🏗️ Estrutura do Projeto

```text
src/

├── controllers
├── entities
├── factories
└── repositories
```

---

# 📊 Arquitetura

```text
Usuário
    │
    ▼
Controller
    │
    ▼
Repository
    │
    ▼
JDBC
    │
    ▼
PostgreSQL
```

---

# 🗄️ Banco de Dados

Banco utilizado:

```text
PostgreSQL
```

Tabela utilizada:

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

---

# ⚙️ Funcionamento

Ao executar a aplicação, o usuário informa:

* Nome
* Telefone
* Matrícula
* Data de nascimento

Após a validação dos dados, o sistema realiza o cadastro do aluno no banco de dados.

---

# ⚙️ Como Executar o Projeto

## 1. Clonar o repositório

```bash
git clone https://github.com/beatrizlima-tech/exercicio03.git
```

---

## 2. Criar o banco de dados

```sql
CREATE DATABASE bdexercicio03;
```

Execute também o script de criação da tabela disponível no projeto.

---

## 3. Configurar a conexão

Atualize as credenciais de acesso ao banco na classe **ConnectionFactory**.

---

## 4. Executar a aplicação

Abra o projeto em uma IDE Java (IntelliJ IDEA, Eclipse ou VS Code) e execute a classe principal.

---

# 📚 Conceitos Aplicados

* Programação Orientada a Objetos (POO)
* JDBC
* PostgreSQL
* SQL
* CRUD (Create)
* Manipulação de datas
* Repository Pattern
* Organização em camadas
* Persistência de dados

---

# 📌 Melhorias Futuras

* Implementar consulta de alunos
* Atualizar dados cadastrais
* Excluir registros
* Adicionar validações mais robustas
* Migrar para Spring Boot e Spring Data JPA
* Criar testes automatizados

---

# 👩‍💻 Autora

Desenvolvido por **Beatriz Lima**

🔗 GitHub
https://github.com/beatrizlima-tech

💼 LinkedIn
https://www.linkedin.com/in/beatrizlima-tech
