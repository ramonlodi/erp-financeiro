package com.erpfinanceiro.dto;

import java.util.Date;

/**
 *
 * @author Ramon Lodi
 */

public record DadosCliente(String nome, String cpf, String email, String telefone, Date dataNascimento, DadosEndereco endereco){
    
}
