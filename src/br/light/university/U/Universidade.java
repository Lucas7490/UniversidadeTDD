package br.light.university.U;

import br.light.university.throwss.ErrorOnSearchDisciplina;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Universidade {
    private String nome;
    private List<Disciplina> disciplinas;
    private List<Estudante> estudantes;
    
    public Universidade() {}
    public Universidade(String nome){
        this.nome = nome;
        disciplinas = new ArrayList<>();
        estudantes = new ArrayList<>();
    }
    
    public Disciplina addDisciplina(String codigo, String titulo,
            int creditos, int maxEstudantes) {
        Disciplina d = new Disciplina(codigo, titulo, creditos, maxEstudantes);
        disciplinas.add(d);
        return d;
    }
    
    public Estudante addEstudanteGraduacao(EstudanteGraduacao e) {
        estudantes.add(e);
        return e;
    }
    
    public Estudante addEstudantePosGraduacao(EstudantePosGraduacao e) {
        estudantes.add(e);
        return e;
    }
    
    public Disciplina atualizaDisciplina(String codigo, String titulo, int creditos,
            int maxEstudante) throws ErrorOnSearchDisciplina{
        Disciplina d = getDisciplina(codigo);
        if (d != null) {
            d.setCodigo(codigo);
            d.setTitulo(titulo);
            d.setCreditos(creditos);
            d.setMaxEstudantes(maxEstudante);
            return d;
        }
        throw new ErrorOnSearchDisciplina("Disciplina não exite! \n Utilize o adicionar..");
    }
    
    public Disciplina getDisciplina(String codigo) {
        Iterator<Disciplina> d = null;
        while (disciplinas.iterator().hasNext()) {
            d = disciplinas.iterator();
            if (disciplinas.iterator().next().getCodigo().equalsIgnoreCase(codigo)) {                
                return d.next();
            }
            d.next();
        }
        return null;
    }    
}
