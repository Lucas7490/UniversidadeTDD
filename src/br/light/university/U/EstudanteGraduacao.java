package br.light.university.U;

/**
 *
 * @author Admin
 */
public class EstudanteGraduacao extends Estudante{
    private String areaPrimaria, areaSecundaria;
    
    public EstudanteGraduacao(Long id, String nome, String telefone, 
            String endereco, String email, String areaPrimaria, String areaSecundaria) {
        super(id, nome, telefone, endereco, email);
        this.areaPrimaria = areaPrimaria;
        this.areaSecundaria = areaSecundaria;
    }

    public String getAreaPrimaria() {return areaPrimaria;}

    public void setAreaPrimaria(String areaPrimaria) {this.areaPrimaria = areaPrimaria;}

    public String getAreaSecundaria() {return areaSecundaria;}

    public void setAreaSecundaria(String areaSecundaria) {this.areaSecundaria = areaSecundaria;}    
}
