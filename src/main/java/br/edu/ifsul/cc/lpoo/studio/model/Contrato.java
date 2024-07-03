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
import javax.persistence.Id;

/**
 *
 * @author 20222PF.CC0025
 */
@Entity
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="contrato_id")
    private int id;
    
    @Column(name="contrato_dataInicio", nullable = false)
    private Calendar dataInicio;
    
    @Column(name="contrato_valor", precision=2)
    private Double valorDesconto;
    
    @Column(name="contrato_formaPgto")
    private FormaPgto formaPgto;

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

    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public FormaPgto getFormaPgto() {
        return formaPgto;
    }

    public void setFormaPgto(FormaPgto formaPgto) {
        this.formaPgto = formaPgto;
    }
    
    
    
    
    
    
}
