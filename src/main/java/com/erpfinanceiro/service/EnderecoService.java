package com.erpfinanceiro.service;

import com.erpfinanceiro.model.Endereco;
import com.erpfinanceiro.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ramon Lodi
 */

@Service
public class EnderecoService {
    
    @Autowired
    private EnderecoRepository enderecoRepository;
    
    //Método para salvar endereço
    public Endereco salvar(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }
}
