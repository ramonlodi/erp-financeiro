package com.erpfinanceiro.model;

import com.erpfinanceiro.dto.DadosEndereco;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

/**
 *
 * @author Ramon Lodi
 */

@Entity
@Table(name = "enderecos")
@NoArgsConstructor
public class Endereco {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEndereco;
    
    @Column(nullable = false)
    private String rua;
    
    @Column(nullable = false)
    private Integer numero;
    
    @Column(nullable = true)
    private String complemento;
    
    @Column(nullable = true)
    private String cep;
    
    @Column(nullable = true)
    private String cidade;
    
    @Column(nullable = true)
    private String estado;
    
    @Column(nullable = true)
    private String pais;

    public Long getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Long idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public Endereco(DadosEndereco dados) {
        this.rua = dados.rua();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
        this.cep = dados.cep();
        this.cidade = dados.cidade();
        this.estado = dados.estado();
        this.pais = dados.pais();
    }
}
