/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.studio.model;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "tb_professor")
public class Professor extends Pessoa{
    
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "dataAdmissao")
    private Calendar dataAdmissao;

    public Calendar getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Calendar dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
     
}
