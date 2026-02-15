package com.erpfinanceiro.repository;

import com.erpfinanceiro.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ramon Lodi
 */

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
    
}
