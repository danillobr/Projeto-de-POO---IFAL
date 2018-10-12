import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProfessorDB {
        
    private Connection conexao;
    
    ProfessorDB(){
        try {
            conexao = DriverManager.getConnection(
                     "jdbc:mysql://localhost/escola", "root", "");
             System.out.println("Conexao com o banco de dados realizada com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro na conexao com o banco: "+e);
        }
    }
    
    public void inserir(Professor p){
        //Inseri na tabela docente do banco Escola. Nela esta contido as as coclunas: nome, login, senha,disciplina, cadastrado, cpf e dataNascimento!
       String sql = "insert into docente (nome, cpf, disciplina, dataNascimento, cadastrado) values (?,?,?,?,?)";
        try{
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getCpf());
            stmt.setString(3, p.getDisciplina());
            stmt.setString(4, p.getDataNascimento());
            stmt.setInt(5, p.getCadastrado());
            stmt.execute();
            stmt.close();

            System.out.println("Dados inseridos no banco!");
        }catch(SQLException e){
            System.out.println("Erro na insercao do banco de dados: "+e);
        }
   }
    
    public void atualizar(Professor p){
       String sql = "update docente set login= ?, senha = ?, cadastrado = ? where cpf = ?";
       
        try{
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, p.getLogin());
            stmt.setString(2, p.getSenha());
            stmt.setInt(3,p.getCadastrado());
            stmt.setString(4, p.getCpf());
            //stmt.setString(4, a.getM().getNome());
            stmt.execute();
            stmt.close();

            System.out.println("Dados inseridos no banco!");
        }catch(SQLException e){
            System.out.println("Erro na insercao do banco de dados: "+e);
        }
   }
    
   public boolean verificarAntesDeCadastrar(String cpf){
       for(int i=0; i<listarProfessor().size(); i++){
           //System.out.print(listarProfessor().get(i));
           if(cpf.equals(listarProfessor().get(i).getCpf())){
               return false;
           }         
       }
       return true;
   }
   
   public boolean verificaCadastroProfessor(String cpf){
       for(int i=0; i<listarProfessor().size(); i++){
           if(cpf.equals(listarProfessor().get(i).getCpf())){
                if(listarProfessor().get(i).getCadastrado()==0){
                   //System.out.println("tem que ser 1: "+listarAluno().get(i).getCadastrado());
                   return true;

               }         
           }
       }   
       
       return false;
       
   } 
   
       
   
   public ArrayList<Professor> listarProfessor(){
       ArrayList<Professor> lista = new ArrayList();
       try {
           String sql = "select * from docente";
           
           PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
             while (rs.next()) {
                 String nome = rs.getString("nome");
                 String cpf = rs.getString("cpf");
                 String disciplina = rs.getString("disciplina");
                 String dataNascimento = rs.getString("dataNascimento");
                 String login = rs.getString("login");
                 String senha = rs.getString("senha");
                 int cadastrado = rs.getInt("cadastrado");
                 
                 //int cadastrado = rs.getInt("cadastrado");
                 Professor p = new Professor(cpf,disciplina,nome,dataNascimento,login,senha,cadastrado);
                 lista.add(p);
                 //System.out.println(p);
             }
            rs.close();
            stmt.close();
        return lista;

     } catch (SQLException e) {
         System.out.println("Erro na consulta: "+e);
     }
     return null;
   }
   
   public boolean logado(String login, String senha){
       ArrayList<String> listaLogin = new ArrayList();
       ArrayList<String> listaSenha = new ArrayList();

        for (int i = 0; i < listarProfessor().size(); i++) {
            if (listarProfessor() != null) {
                listaLogin.add(listarProfessor().get(i).getLogin());
            }
        }

        for (int i = 0; i < listarProfessor().size(); i++) {
            if (listarProfessor() != null) {
                listaSenha.add(listarProfessor().get(i).getSenha());
            }
        }
       for (int i = 0; i < listaLogin.size(); i++) {
            //String Login = listarAluno().get(i).getLogin();
            //System.out.println(Login);
            //String Senha = listarAluno().get(i).getSenha();
            if (listaLogin.get(i).equals(login) && listaSenha.get(i).equals(senha)) {
                return true;
            }
        }
       return false;
   }
}

    

