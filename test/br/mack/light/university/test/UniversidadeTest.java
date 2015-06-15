package br.mack.light.university.test;

import br.light.university.U.Disciplina;
import br.light.university.U.Estudante;
import br.light.university.U.EstudanteGraduacao;
import br.light.university.U.EstudantePosGraduacao;
import br.light.university.U.Universidade;
import br.light.university.throwss.ErrorOnSearchDisciplina;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Admin
 */
public class UniversidadeTest {
    private Universidade lightU = new Universidade("Light University");
    
    @Test
    public void addDisciplinaTest(){                
        Disciplina d = new Disciplina("277", "Introdução a programação", 30, 30);
        Assert.assertTrue(lightU.addDisciplina(d.getCodigo(), d.getTitulo(), 
                d.getCreditos(), d.getMaxEstudantes()) != null);
    }
    
    @Test
    public void addDisciplinaTest2(){
        Disciplina d = lightU.addDisciplina("288", "Tec Web I", 15, 25);
        Assert.assertEquals(lightU.addDisciplina("288", "Tec Web I", 15, 25).getCodigo(),
                d.getCodigo());
    }
    
    @Test
    public void addDisciplinaTest3(){
        Disciplina d = lightU.addDisciplina("299", "Tec Web II", 15, 25);
        Assert.assertEquals(lightU.addDisciplina("299", "Tec Web II", 15, 25).getTitulo(),
                d.getTitulo());
    }
    
    @Test
    public void addDisciplinaTest4(){
        Disciplina d = lightU.addDisciplina("288", "Computação Aplicada", 20, 25);
        Assert.assertEquals(lightU.addDisciplina("288", "Computação Aplicada", 20, 25).getCreditos(),
                d.getCreditos());
    }
    
    @Test
    public void addDisciplinaTest5(){
        Disciplina d = lightU.addDisciplina("288", "Fundamentos", 25, 35);
        Assert.assertEquals(lightU.addDisciplina("288", "Fundamentos", 25, 35).
                getMaxEstudantes(), d.getMaxEstudantes());
    }
    
    @Test
    public void addEstudanteGraduacaoTest() {
        Estudante e = new EstudanteGraduacao(1L, "Lucas", "Rua X", "3900-7841", "l@live.com",
        "Análise de Sistemas", "Culinária");        
        Assert.assertNotNull(lightU.addEstudanteGraduacao((EstudanteGraduacao)e));
    }
    
    @Test
    public void addEstudantePosGraduacaoTest() {
        Estudante e = new EstudantePosGraduacao(2L, "Gomes", "Rua X", "3943-5501",
        "g@gmail.com", "Orestes", "Tese do Gomes");        
        Assert.assertNotNull(lightU.addEstudantePosGraduacao((EstudantePosGraduacao)e));
    }
    
    @Test
    public void atualizaDisciplinaTest() throws ErrorOnSearchDisciplina {
        Disciplina d = new Disciplina("321", "Ética I", 8, 40);
        lightU.addDisciplina(d.getCodigo(), d.getTitulo(), d.getCreditos(), d.getMaxEstudantes());
        Assert.assertNotNull(lightU.atualizaDisciplina(d.getCodigo(), d.getTitulo(),
                d.getCreditos(), d.getMaxEstudantes()));
    }
    
    
}
