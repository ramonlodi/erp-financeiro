package com.erpfinanceiro.repository;

import com.erpfinanceiro.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ramon Lodi
 */

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    boolean existsByCpf(String cpf);
    boolean existsByEmail(String email);
    
    Cliente findByNome(String nome);
    Cliente findByCpf(String cpf);
}
