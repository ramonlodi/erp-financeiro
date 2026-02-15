package com.erpfinanceiro.controller;

import com.erpfinanceiro.dto.DadosEndereco;
import com.erpfinanceiro.model.Endereco;
import com.erpfinanceiro.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ramon Lodi
 */

@RestController
@RequestMapping("/api/ClienteEndereco")
public class EnderecoController {
    
    @Autowired
    private EnderecoService enderecoService;
    
    @PostMapping //Para quando enviar dados via POST para /api/clienteEndereco
    public ResponseEntity criar(@RequestBody DadosEndereco dadosEndereco) {
        var endereco = new Endereco(dadosEndereco);
        var salvo = enderecoService.salvar(endereco);
        return ResponseEntity.ok(salvo);
    }
}


