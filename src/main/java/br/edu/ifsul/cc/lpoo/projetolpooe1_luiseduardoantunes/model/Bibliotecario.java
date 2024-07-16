/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.projetolpooe1_luiseduardoantunes.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name="tb_bibliotecario")
public class Bibliotecario implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    
    
    @Column(name="codigoBibliotecario")
    private int codigoBibliotecario;
    
    @Column(name="nomeBibliotecario")
    private String nomeBibliotecario;
    
    @Column(name="salario", precision = 2)
    private double salario;
    
    @Column(name="telefone")
    private String telefone;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="dataAdmissao")
    private Calendar dataAdmissao;

    public int getCodigoBibliotecario() {
        return codigoBibliotecario;
    }

    public void setCodigoBibliotecario(int codigoBibliotecario) {
        this.codigoBibliotecario = codigoBibliotecario;
    }

    public String getNomeBibliotecario() {
        return nomeBibliotecario;
    }

    public void setNomeBibliotecario(String nomeBibliotecario) {
        this.nomeBibliotecario = nomeBibliotecario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Calendar getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Calendar dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    
    
    
}
