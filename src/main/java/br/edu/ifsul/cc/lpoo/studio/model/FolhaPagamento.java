/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.studio.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "tb_folhaPgto")
public class FolhaPagamento implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    
    @Column(name = "folhaPgto_id")
    private Integer id;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "dataPgto")
    private Calendar dataReceber;
    
    @Column(name = "valorPgto")
    private Double valorReceber;
    
    @Column(name = "professor")
    private Professor professor;

    public Calendar getDataReceber() {
        return dataReceber;
    }

    public void setDataReceber(Calendar dataReceber) {
        this.dataReceber = dataReceber;
    }

    public Double getValorReceber() {
        return valorReceber;
    }

    public void setValorReceber(Double valorReceber) {
        this.valorReceber = valorReceber;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    
}
