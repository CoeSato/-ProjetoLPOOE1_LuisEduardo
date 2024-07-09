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
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "tb_aluno")
public class Aluno extends Pessoa{
    
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "dataInicio")
    private Calendar dataInicio;
    
    @Column(name = "dataPgto")
    private Integer dataPgto;
    
    public Aluno() {
        dataInicio = Calendar.getInstance();
    }

    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Integer getDataPgto() {
        return dataPgto;
    }

    public void setDataPgto(Integer dataPgto) {
        this.dataPgto = dataPgto;
    }
    
    
    
}
