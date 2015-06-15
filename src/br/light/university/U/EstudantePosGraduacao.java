package br.light.university.U;

/**
 *
 * @author Admin
 */
public class EstudantePosGraduacao extends Estudante{
    private String orientador, tituloTese;
    
    public EstudantePosGraduacao(Long id, String nome, String telefone, 
            String endereco, String email, String orientador, String tituloTese) {
        super(id, nome, telefone, endereco, email);
    }

    public String getOrientador() {return orientador;}

    public void setOrientador(String orientador) {this.orientador = orientador;}

    public String getTituloTese() {return tituloTese;}

    public void setTituloTese(String tituloTese) {this.tituloTese = tituloTese;}    
}
