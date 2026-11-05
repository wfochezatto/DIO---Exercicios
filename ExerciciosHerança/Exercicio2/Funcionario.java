package ExerciciosHerança.Exercicio2;

public class Funcionario {

    private String nome;

    private String email;

    private String senha;

    private final Boolean admin;

    public Funcionario(String nome, String email, String senha, Boolean admin) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.admin = admin;
    }
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getAdmin() {
        return admin;
    }
}
