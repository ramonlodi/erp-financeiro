package com.erpfinanceiro.dto;

import com.erpfinanceiro.model.Cliente;

/**
 *
 * @author Ramon Lodi
 */

public record DadosDetalhamentoCliente (Long idCliente, String nome, DadosEndereco endereco){
    
    public DadosDetalhamentoCliente(Cliente cliente) {
        this(cliente.getIdCliente(), cliente.getNome(), new DadosEndereco(cliente.getEndereco()));
    }
}
