/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grupostrabalho;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Rian Alves Leal <ral2 at aluno.ifnmg.edu.br>
 */
@Entity
public class Grupo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 65)
    private String nome;
    @Column
    private Boolean ativo  = true;

    @OneToMany(mappedBy = "grupo")
    private List<Atuacao> atuacoes;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lider_id")
    @JsonbTransient
    private Pessoa lider;

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Grupo() {
        this.atuacoes = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Pessoa getLider() {
        return lider;
    }

    public void setLider(Pessoa lider) {
        this.lider = lider;
    }

    public List<Atuacao> getAtuacao() {
        return atuacoes;
    }

    public void setAtuacao(ArrayList<Atuacao> atuacao) {
        this.atuacoes = atuacao;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Grupo{" + "id=" + id
                + ", nome=" + nome
                + ", ativo=" + ativo
                + ", lider=" + lider
                + ", atuacao=" + atuacoes + '}';
    }

}
