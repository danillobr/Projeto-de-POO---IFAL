
public class Aluno extends Pessoa{
    private String matricula;
    private Materias m;
    //private Connection conexao;

    public Aluno(String matricula, Materias m, String nome, String dataNascimento, String login, String senha, int cadastrado) {
        super(nome, dataNascimento, login, senha, cadastrado);
        this.matricula = matricula;
        this.m = m;
    }
    
        
    public String getMatricula() {
        return matricula;
    }

    public Materias getM() {
        return m;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setM(Materias m) {
        this.m = m;
    }
    
    public String toString(){
        return super.toString() + matricula + " " + getM();
    }
    
    
    
}
