package com.erpfinanceiro.service;

import com.erpfinanceiro.model.Admin;
import com.erpfinanceiro.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 *
 * @author Ramon Lodi
 */

@Service
public class AdminService {
    
    @Autowired
    private AdminRepository adminRepository;
    
    // Método para listar todos os admins
    public List<Admin> listarTodos() {
        return adminRepository.findAll();
    }
    
    // Método para salvar um novo admin
    public Admin salvar(Admin admin) {
        // Adicionar validações para criação (verificar email e matricula, e criptografar senha)
        return adminRepository.save(admin);
    }
}
