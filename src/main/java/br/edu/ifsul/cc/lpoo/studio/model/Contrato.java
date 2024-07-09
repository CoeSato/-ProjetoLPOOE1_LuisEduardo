/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.studio.model;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_contrato")
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="contrato_id")
    private int id;
    
    @Column(name="contrato_data_inicio", nullable = false)
    private Calendar dataInicio;
    
    @Column(name="contrato_valor", precision = 2)
    private double valor;
    
    @Column(name = "contrato_forma_pgto")
    @Enumerated(EnumType.STRING) 
    
    private FormaPgto forma_pgto;

    public Contrato() {
        dataInicio = Calendar.getInstance();
    }
    
    @ManyToOne
    @JoinColumn(name="aluno_id")
    private Aluno aluno;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public FormaPgto getForma_pgto() {
        return forma_pgto;
    }

    public void setForma_pgto(FormaPgto forma_pgto) {
        this.forma_pgto = forma_pgto;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    
    
    
}
