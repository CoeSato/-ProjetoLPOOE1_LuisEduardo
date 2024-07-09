/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.studio.test;

import br.edu.ifsul.cc.lpoo.studio.dao.PersistenciaJPA;
import br.edu.ifsul.cc.lpoo.studio.model.Aluno;
import br.edu.ifsul.cc.lpoo.studio.model.Contrato;
import br.edu.ifsul.cc.lpoo.studio.model.FolhaPagamento;
import br.edu.ifsul.cc.lpoo.studio.model.FormaPgto;
import br.edu.ifsul.cc.lpoo.studio.model.Modalidade;
import br.edu.ifsul.cc.lpoo.studio.model.Pacote;
import br.edu.ifsul.cc.lpoo.studio.model.Pagamento;
import br.edu.ifsul.cc.lpoo.studio.model.Pessoa;
import br.edu.ifsul.cc.lpoo.studio.model.Professor;
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
    
    @Before // o que fazer antes da persistencia
    public void setUp() {
        jpa.conexaoAberta();
    }
    
    @After
    public void tearDown() {
        jpa.fecharConexao();
    }
    
    @Test
    public void test() throws Exception{
        Contrato c = new Contrato();
        c.setValor(20.678);
        c.setForma_pgto(FormaPgto.PIX);
         
        Pagamento p = new Pagamento();
        p.setValor(200.00);
        p.setDataVcto(Calendar.getInstance());
        p.setContrato(c);
        
        String formatacao = "yyyy-MM-dd"; 
        SimpleDateFormat sdf = new SimpleDateFormat(formatacao);
        String dataString = "2001-07-11";
        Calendar cal = Calendar.getInstance();
        cal.setTime(sdf.parse(dataString));
        
        Aluno a = new Aluno();
        a.setNome("Celso Portioli");
        a.setEmail("celso.portioli@gmail.com");
        a.setEndereco("Rua Greenwich 175");
        a.setFone("1107200199");
        a.setDataAniver(cal);
        a.setDataInicio(Calendar.getInstance());
        a.setDataPgto(10);
         
        dataString = "1980-04-03";
        cal.setTime(sdf.parse(dataString));
        
        Professor pro = new Professor();
        pro.setNome("Renhato Dina");
        pro.setEmail("dina@gmail.com");
        pro.setEndereco("Rua Marilurde 333");
        pro.setFone("3333333333");
        pro.setDataAniver(cal);
        pro.setDataAdmissao(Calendar.getInstance());
        
        Modalidade m = new Modalidade();
        m.setDescricao("Dança Livre");
        
        FolhaPagamento f = new FolhaPagamento();
        f.setDataReceber(Calendar.getInstance());
        f.setValorReceber(3000.00);
        
        Pacote pct = new Pacote();
        pct.setDescricao("3x");
        pct.setValor(100);
        pct.setModalidade(m);
         
        jpa.persist(c);
        jpa.persist(m);
        jpa.persist(p);
        jpa.persist(pct);
        jpa.persist(a);
        jpa.persist(f);
        jpa.persist(pro);
         
        Modalidade persistidoModalidade = (Modalidade)jpa.find(Modalidade.class, m.getId());
            Assert.assertEquals(m.getDescricao(), 
                persistidoModalidade.getDescricao());
            
        Contrato persistidoContrato = (Contrato)jpa.find(Contrato.class, c.getId());
            Assert.assertEquals(c.getForma_pgto(), 
                persistidoContrato.getForma_pgto());
        
        Pacote persistidoPacote = (Pacote)jpa.find(Pacote.class, pct.getId());
            Assert.assertEquals(pct.getDescricao(), 
                persistidoPacote.getDescricao());
            
        Pagamento persistidoPagamento = (Pagamento)jpa.find(Pagamento.class, p.getId());
            Assert.assertEquals(p.getValor(), 
                persistidoPagamento.getValor());
            
        Aluno persistidoAluno = (Aluno)jpa.find(Aluno.class, a.getId());
            Assert.assertEquals(a.getNome(), 
                persistidoAluno.getNome());
            
        Professor persistidoProfessor = (Professor)jpa.find(Professor.class, pro.getId());
            Assert.assertEquals(pro.getNome(), 
                persistidoProfessor.getNome());
            
        FolhaPagamento persistidoFolhaPagamento = (FolhaPagamento)jpa.find(FolhaPagamento.class, f.getId());
            Assert.assertEquals(f.getValorReceber(), 
                persistidoFolhaPagamento.getValorReceber()); 
           
    }
    
}
