
public abstract class Pessoa {
    private String nome;
    private String dataNascimento;
    private String login, senha;
    private int cadastrado;

    public Pessoa(String nome, String dataNascimento, String login, String senha, int cadastrado) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.login = login;
        this.senha = senha;
        this.cadastrado = cadastrado;
    }

    public int getCadastrado() {
        return cadastrado;
    }

    public void setCadastrado(int cadastrado) {
        this.cadastrado = cadastrado;
    }
    

    
    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

      
    public String toString() {
        return " " + nome + " " + dataNascimento + " " + login + " " + senha + " " + cadastrado;
    }

    
    
}