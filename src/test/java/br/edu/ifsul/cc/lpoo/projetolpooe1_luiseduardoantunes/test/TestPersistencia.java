/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.projetolpooe1_luiseduardoantunes.test;

import br.edu.ifsul.cc.lpoo.projetolpooe1_luiseduardoantunes.dao.PersistenciaJPA;
import org.junit.Test;

/**
 *
 * @author vanessalagomachado
 */
public class TestPersistencia {

    @Test
    public void testeConexao(){
        PersistenciaJPA jpa = new PersistenciaJPA();
        if(jpa.conexaoAberta()){
            System.out.println("Conexão realizada com sucesso");
        } else {
            System.out.println("Falha ao conectar ao Banco");
        }
    }
}
