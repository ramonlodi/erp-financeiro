package com.erpfinanceiro.dto;

import com.erpfinanceiro.model.Endereco;

/**
 *
 * @author Ramon Lodi
 */

public record DadosEndereco(String rua, Integer numero, String complemento, String cep, String cidade, String estado, String pais){
    
    public DadosEndereco(Endereco endereco) {
        this(endereco.getRua(),
             endereco.getNumero(),
             endereco.getComplemento(),
             endereco.getCep(),
             endereco.getCidade(),
             endereco.getEstado(),
             endereco.getPais());
    }
}
