package com.erpfinanceiro.service;

import com.erpfinanceiro.model.Admin;
import com.erpfinanceiro.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import java.util.List;

/**
 *
 * @author Ramon Lodi
 */

@Service
public class AdminService {
    
    @Autowired
    private AdminRepository adminRepository;
    
    @Autowired
    private BCryptPasswordEncoder encoder;
    
    //Método para listar todos os admins
    public List<Admin> listarTodos() {
        return adminRepository.findAll();
    }
    
    //Método para salvar um novo admin
    public Admin salvar(Admin admin) {
        if(adminRepository.existsByEmail(admin.getEmail())){
            throw new RuntimeException("E-mail já cadastrado!");
        }
        
        if(adminRepository.existsByMatricula(admin.getMatricula())) {
            throw new RuntimeException("Matrícula já cadastrada!");
        }
        
        String senhaCriptografada = encoder.encode(admin.getSenha());
        admin.setSenha(senhaCriptografada);
        
        return adminRepository.save(admin);
    }
}
