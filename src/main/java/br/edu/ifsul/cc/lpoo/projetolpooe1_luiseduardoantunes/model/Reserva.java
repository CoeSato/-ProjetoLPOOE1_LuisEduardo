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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name="tb_reserva")
public class Reserva implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    
    @Column(name="codigoReserva")
    private int codigoReserva;
    
    @Column(name="livroReservado")
    private String livroReservado;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="dataInicio")
    private Calendar dataInicio;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="dataFim")
    private Calendar dataFim;
    
    @ManyToOne
    @JoinColumn(name="cliente_id")
    private Cliente cliente;
    
    @ManyToOne
    @JoinColumn(name="codigoBibliotecario")
    private Bibliotecario bibliotecario;

    public int getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(int codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public String getLivroReservado() {
        return livroReservado;
    }

    public void setLivroReservado(String livroReservado) {
        this.livroReservado = livroReservado;
    }

    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Calendar getDataFim() {
        return dataFim;
    }

    public void setDataFim(Calendar dataFim) {
        this.dataFim = dataFim;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }
    
    
}
