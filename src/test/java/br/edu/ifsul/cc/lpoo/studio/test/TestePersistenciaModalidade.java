/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.studio.test;

import br.edu.ifsul.cc.lpoo.studio.dao.PersistenciaJPA;
import br.edu.ifsul.cc.lpoo.studio.model.Modalidade;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestePersistenciaModalidade {
    PersistenciaJPA jpa = new PersistenciaJPA();
    
    public TestePersistenciaModalidade() {
    }
    
    @Before // o que fazer antes da persistencia
    public void setUp() {
        jpa.conexaoAberta();
    }
    
    @After
    public void tearDown() {
        jpa.fecharConexao();
    }
    
    @Test
    public void testePersistencia() throws Exception{
        Modalidade m = new Modalidade();
        m.setDescricao("Dança Livre");
        jpa.persist(m);
        
        Modalidade persistidoModalidade = (Modalidade)jpa.find(Modalidade.class, m.getId());
        Assert.assertEquals(m.getDescricao(), 
                 persistidoModalidade.getDescricao());
    }
    
}
