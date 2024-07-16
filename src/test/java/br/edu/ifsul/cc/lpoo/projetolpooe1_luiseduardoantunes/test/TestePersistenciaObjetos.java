/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.projetolpooe1_luiseduardoantunes.test;

import br.edu.ifsul.cc.lpoo.projetolpooe1_luiseduardoantunes.dao.PersistenciaJPA;
import br.edu.ifsul.cc.lpoo.projetolpooe1_luiseduardoantunes.model.Bibliotecario;
import br.edu.ifsul.cc.lpoo.projetolpooe1_luiseduardoantunes.model.Cliente;
import br.edu.ifsul.cc.lpoo.projetolpooe1_luiseduardoantunes.model.Reserva;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestePersistenciaObjetos {
    PersistenciaJPA jpa = new PersistenciaJPA();
    
    public TestePersistenciaObjetos() {
    }
    
    @Before
    public void setUp() {
        jpa.conexaoAberta();
    }
    
    @After
    public void tearDown() {
        jpa.fecharConexao();
    }
    
    @Test
    public void test() throws Exception{
        Cliente c = new Cliente();
        c.setId(1);
        c.setNome("Robisvaldo Franco");
        c.setEmail("robisvaldo.franco@gmail.com");
        c.setTelefone("9999999999");
         
        Bibliotecario b = new Bibliotecario();
        b.setCodigoBibliotecario(5);
        b.setNomeBibliotecario("Marilurde Pierre");
        b.setSalario(2500.00);
        b.setTelefone("8888888888");
        
        String formatacao = "yyyy-MM-dd"; 
        SimpleDateFormat sdf = new SimpleDateFormat(formatacao);
        String dataString = "2001-07-11";
        Calendar cal = Calendar.getInstance();
        cal.setTime(sdf.parse(dataString));
        b.setDataAdmissao(cal);
        
        Reserva r = new Reserva();
        r.setCodigoReserva(10);
        r.setLivroReservado("Apostila Java I");
        r.setBibliotecario(b);
        r.setCliente(c);
        
        dataString = "2024-07-10";
        cal.setTime(sdf.parse(dataString));
        r.setDataInicio(cal);
        
        dataString = "2024-07-17";
        cal.setTime(sdf.parse(dataString));
        r.setDataFim(cal);
        
        jpa.persist(c);
        jpa.persist(b);
        jpa.persist(r);
         
        Cliente persistidoCliente = (Cliente)jpa.find(Cliente.class, c.getNome());
            Assert.assertEquals(c.getNome(), 
                persistidoCliente.getNome());
            
        Bibliotecario persistidoBibliotecario = (Bibliotecario)jpa.find(Bibliotecario.class, b.getCodigoBibliotecario());
            Assert.assertEquals(b.getCodigoBibliotecario(), 
                persistidoBibliotecario.getCodigoBibliotecario());
        
        Reserva persistidoReserva = (Reserva)jpa.find(Reserva.class, r.getCodigoReserva());
            Assert.assertEquals(r.getCodigoReserva(), 
                persistidoReserva.getCodigoReserva());   
    }
    
}
