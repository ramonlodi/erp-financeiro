package com.erpfinanceiro.dto;

import com.erpfinanceiro.model.Admin;

/**
 *
 * @author Ramon Lodi
 */

public record DadosDetalhamentoAdmin (Long idAdmin, String nome, String email, Integer matricula) {
    
    public DadosDetalhamentoAdmin(Admin admin) {
        this(admin.getIdAdmin(), admin.getNome(), admin.getEmail(), admin.getMatricula());
    }
}
