package com.erpfinanceiro.controller;

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
    public List<Admin> listar() {
        return adminService.listarTodos();
    }
    
    @PostMapping // Para quando enviar dados via POST para /api/admins
    public Admin criar(@RequestBody Admin admin) {
        return adminService.salvar(admin);
    }
}
