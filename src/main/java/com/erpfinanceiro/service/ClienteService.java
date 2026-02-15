package com.erpfinanceiro.service;

import com.erpfinanceiro.model.Cliente;
import com.erpfinanceiro.repository.ClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ramon Lodi
 */

@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepository;
    
    //Método para listar todos os clientes
    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }
    
    //Método para salvar cliente
    public Cliente salvar(Cliente cliente) {
        if(clienteRepository.existsByCpf(cliente.getCpf())) {
            throw new RuntimeException("CPF já cadastrado!");
        }
        
        if(clienteRepository.existsByEmail(cliente.getEmail())) {
            throw new RuntimeException("E-mail já cadastrado!");
        }
        
        return clienteRepository.save(cliente);
    }
}
