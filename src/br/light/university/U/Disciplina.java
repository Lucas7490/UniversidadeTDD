package br.light.university.U;

/**
 *
 * @author Admin
 */
public class Disciplina {
    private String codigo, titulo;
    private int creditos, maxEstudantes;
    
    public Disciplina(String codigo, String titulo, int creditos, int maxEstudantes) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.creditos = creditos;
        this.maxEstudantes = maxEstudantes;
    }

    public String getCodigo() {return codigo;}

    public void setCodigo(String codigo) {this.codigo = codigo;}

    public String getTitulo() {return titulo;}

    public void setTitulo(String titulo) {this.titulo = titulo;}

    public int getCreditos() {return creditos;}

    public void setCreditos(int creditos) {this.creditos = creditos;}

    public int getMaxEstudantes() {return maxEstudantes;}

    public void setMaxEstudantes(int maxEstudantes) {this.maxEstudantes = maxEstudantes;}       
}
