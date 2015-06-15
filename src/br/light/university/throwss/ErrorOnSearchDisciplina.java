package br.light.university.throwss;

/**
 *
 * @author Admin
 */
public class ErrorOnSearchDisciplina extends Exception{
    
    public ErrorOnSearchDisciplina(String errorDescription) {
        super(errorDescription);
    }
}
