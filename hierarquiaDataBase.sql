-- Criação do banco de dados
CREATE DATABASE hierarquia;

-- Uso do banco de dados
USE hierarquia;

-- Criação da tabela "funcionario"
CREATE TABLE funcionario (
  cpf VARCHAR(20) PRIMARY KEY,
  nome VARCHAR(100) NOT NULL,
  email VARCHAR(100) NOT NULL,
  salario DOUBLE NOT NULL,
  aniversario DATE NOT NULL,
  telefone VARCHAR(20) NOT NULL,
  departamento VARCHAR(100) NOT NULL
);

-- Criação da tabela "gerente"
CREATE TABLE gerente (
  cpf VARCHAR(20) PRIMARY KEY,
  nome VARCHAR(100) NOT NULL,
  email VARCHAR(100) NOT NULL,
  salario DOUBLE NOT NULL,
  aniversario DATE NOT NULL,
  telefone VARCHAR(20) NOT NULL,
  departamento VARCHAR(100) NOT NULL,
  gratificacao DOUBLE NOT NULL
);

-- Criação da tabela "terceiro"
CREATE TABLE terceiro (
  cpf VARCHAR(20) PRIMARY KEY,
  nome VARCHAR(100) NOT NULL,
  email VARCHAR(100) NOT NULL,
  ativo BOOLEAN NOT NULL DEFAULT false,
  situacao VARCHAR(20) NOT NULL DEFAULT "ativo"
);