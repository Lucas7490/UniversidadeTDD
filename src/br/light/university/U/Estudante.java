package br.light.university.U;

/**
 *
 * @author Admin
 */
public abstract class Estudante {
    private Long id;
    private String nome, telefone, endereco, email;

    public Estudante(Long id, String nome, String telefone, String endereco, String email) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
    }

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getTelefone() {return telefone;}

    public void setTelefone(String telefone) {this.telefone = telefone;}

    public String getEndereco() {return endereco;}

    public void setEndereco(String endereco) {this.endereco = endereco;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}
}
