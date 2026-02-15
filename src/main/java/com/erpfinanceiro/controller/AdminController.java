package com.erpfinanceiro.controller;

import com.erpfinanceiro.dto.DadosDetalhamentoAdmin;
import com.erpfinanceiro.model.Admin;
import com.erpfinanceiro.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author Ramon Lodi
 */

@RestController
@RequestMapping("/api/admins")
public class AdminController {
    
    @Autowired
    private AdminService adminService;
    
    @GetMapping // Para quando acessar GET /api/admins
    public List<DadosDetalhamentoAdmin> listar() {
        return adminService.listarTodos().stream()
                .map(DadosDetalhamentoAdmin::new)
                .toList();
    }
    
    @PostMapping // Para quando enviar dados via POST para /api/admins
    public Admin criar(@RequestBody Admin admin) {
        return adminService.salvar(admin);
    }
}
