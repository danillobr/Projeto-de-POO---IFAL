
public class Professor extends Pessoa{
    private String cpf, disciplina;
    //private final boolean coordenador;


    public Professor(String cpf, String disciplina, String nome, String dataNascimento, String login, String senha, int cadastrado) {
        super(nome, dataNascimento, login, senha, cadastrado);
        this.cpf = cpf;
        this.disciplina = disciplina;
        //this.coordenador = coordenador;
    }

    /*public boolean isCoordenador() {
        return coordenador;
    }*/

    public String getCpf() {
        return cpf;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String toString() {
        return super.toString() + cpf + " " + disciplina; 
    }
    
    
}
