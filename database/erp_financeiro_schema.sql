CREATE DATABASE IF NOT EXISTS erp_financeiro;

USE erp_financeiro;

CREATE TABLE admins (
	id_admin INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    matricula INT NOT NULL UNIQUE,
    email VARCHAR(50) NOT NULL UNIQUE,
    senha VARCHAR(300) NOT NULL,
    ativo BOOLEAN DEFAULT TRUE
);

CREATE TABLE enderecos (
	id_endereco INT AUTO_INCREMENT PRIMARY KEY,
    rua VARCHAR(150) NOT NULL,
    numero INT NOT NULL,
    complemento VARCHAR(100),
    cep VARCHAR(10) NOT NULL,
    cidade VARCHAR(50),
    estado CHAR(2),
    pais VARCHAR(20)
);

CREATE TABLE clientes (
	id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
	cpf VARCHAR(11) NOT NULL UNIQUE,
    telefone VARCHAR(11) NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE,
    data_nascimento DATE NOT NULL,
    id_endereco INT,
    
    FOREIGN KEY (id_endereco) REFERENCES enderecos(id_endereco)
        ON DELETE SET NULL
		ON UPDATE CASCADE
);

CREATE TABLE contas (
	id_conta INT AUTO_INCREMENT PRIMARY KEY,
    numero_conta INT NOT NULL,
    agencia INT NOT NULL,
    numero_banco INT NOT NULL,
    nome_banco VARCHAR(50) NOT NULL,
    saldo DECIMAL(15,2) NOT NULL,
    tipo VARCHAR(60) NOT NULL,
    id_cliente INT NOT NULL,
    data_criacao DATETIME NOT NULL,
    status BOOLEAN NOT NULL DEFAULT TRUE,
    
    FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente)
		ON DELETE RESTRICT
        ON UPDATE CASCADE
);

CREATE TABLE transacoes (
	id_transacao INT AUTO_INCREMENT PRIMARY KEY,
    valor DECIMAL(15, 2) NOT NULL,
    id_conta_origem INT, -- Sem NOT NULL para transações do tipo depósito
    id_conta_destino INT, -- Sem NOT NULL para transações do tipo saque
    tipo VARCHAR(60) NOT NULL,
    data_hora DATETIME DEFAULT CURRENT_TIMESTAMP,
    status BOOLEAN NOT NULL,
    
    FOREIGN KEY (id_conta_origem) REFERENCES contas(id_conta),
    FOREIGN KEY (id_conta_destino) REFERENCES contas(id_conta)
);
