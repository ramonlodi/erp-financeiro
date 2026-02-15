package com.erpfinanceiro.controller;

import com.erpfinanceiro.dto.DadosDetalhamentoCliente;
import com.erpfinanceiro.model.Cliente;
import com.erpfinanceiro.service.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ramon Lodi
 */

@RestController
@RequestMapping("/api/Cliente")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping //Para quando enviar dados via GET para /api/Cliente
    public List<DadosDetalhamentoCliente> listar() {
        return  clienteService.listarTodos().stream()
                .map(DadosDetalhamentoCliente::new)
                .toList();
    }
    
    @PostMapping //Para quando enviar dados via POST para /api/Cliente
    public Cliente criar(@RequestBody Cliente cliente) {
        return clienteService.salvar(cliente);
    }
}
