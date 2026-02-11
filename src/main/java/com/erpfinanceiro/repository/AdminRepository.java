package com.erpfinanceiro.repository;

import com.erpfinanceiro.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ramon Lodi
 */

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long>{
    
}
