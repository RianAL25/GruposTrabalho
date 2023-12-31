/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grupostrabalho;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Rian Alves Leal <ral2 at aluno.ifnmg.edu.br>
 */
@Entity
public class Endereco implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private TipoLogradouro tipoLogradouro;
    @Column(length = 150)
    private String logradouro;

    private Integer numero;
    @Column(length = 25)
    private String bairro;

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Endereco() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Endereco{" + "id=" + id
                + ", tipoLogradouro=" + tipoLogradouro
                + ", logradouro=" + logradouro
                + ", numero=" + numero
                + ", bairro=" + bairro + '}';
    }

}
