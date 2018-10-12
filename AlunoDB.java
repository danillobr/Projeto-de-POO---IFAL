
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AlunoDB {

    private Connection conexao;

    AlunoDB() {
        try {
            conexao = DriverManager.getConnection(
                    "jdbc:mysql://localhost/escola", "root", "");
            System.out.println("Conexao com o banco de dados realizada com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro na conexao com o banco: " + e);
        }
    }

    public void inserir(Aluno a) {
        //Inseri na tabela discente do banco Escola. Nela esta contido as as coclunas: Nome, matricula, dataNascimento, login, senha e cadastrado!
        String sql = "insert into discente (Nome, matricula, dataNascimento, cadastrado) values (?,?,?,?)";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getMatricula());
            stmt.setString(3, a.getDataNascimento());
            stmt.setInt(4, a.getCadastrado());
            stmt.execute();
            stmt.close();

            System.out.println("Dados inseridos no banco!");
        } catch (SQLException e) {
            System.out.println("Erro na insercao do banco de dados: " + e);
        }

        /*for (int i = 0; i < 10; i++) {
            String sql1 = "insert into materias (nome, matricula) values (?,?)";

            try {
                PreparedStatement stmt = conexao.prepareStatement(sql1);
                stmt.setString(1, a.getM().getNome());
                stmt.setString(2, a.getM().getMatricula());
                stmt.execute();
                stmt.close();

                System.out.println("Dados inseridos no banco!");
            } catch (SQLException e) {
                System.out.println("Erro na insercao do banco de dados: " + e);
            }
        }*/
    }

    public void atualizar(Aluno a) {
        String sql = "update discente set login= ?, senha = ?, cadastrado = ? where matricula = ?";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, a.getLogin());
            stmt.setString(2, a.getSenha());
            stmt.setInt(3, a.getCadastrado());
            stmt.setString(4, a.getMatricula());
            //stmt.setString(4, a.getM().getNome());
            stmt.execute();
            stmt.close();

            System.out.println("Dados inseridos no banco!");
        } catch (SQLException e) {
            System.out.println("Erro na insercao do banco de dados: " + e);
        }
    }

    public boolean verificarAntesDeCadastrar(String matricula) {
        for (int i = 0; i < listarAluno().size(); i++) {
            if (matricula.equals(listarAluno().get(i).getMatricula())) {
                return false;
            }
        }
        return true;
    }

    public boolean verificaCadastroAluno(String matricula) {
        for (int i = 0; i < listarAluno().size(); i++) {
            if (matricula.equals(listarAluno().get(i).getMatricula())) {
                if (listarAluno().get(i).getCadastrado() == 0) {
                    //System.out.println("tem que ser 1: "+listarAluno().get(i).getCadastrado());
                    return true;
                }
            }
        }

        return false;

    }
   
    
    public ArrayList<Aluno> listarAluno() {
        ArrayList<Aluno> lista = new ArrayList();
        try {
            String sql = "select * from discente";

            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String nome = rs.getString("Nome");
                String matricula = rs.getString("matricula");
                String dataNascimento = rs.getString("dataNascimento");
                String login = rs.getString("login");
                String senha = rs.getString("senha");
                int cadastrado = rs.getInt("cadastrado");
                //Materias m = new Materias(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, "", 0, "", "");
                //int cadastrado = rs.getInt("cadastrado");
                Aluno a = new Aluno(matricula, null, nome, dataNascimento, login, senha, cadastrado);
                lista.add(a);
                //System.out.println(a);
            }
            rs.close();
            stmt.close();
            return lista;

        } catch (SQLException e) {
            System.out.println("Erro na consulta: " + e);
        }
        return null;
    }

    public boolean logado(String login, String senha) {

        ArrayList<String> listaLogin = new ArrayList();
        ArrayList<String> listaSenha = new ArrayList();

        for (int i = 0; i < listarAluno().size(); i++) {
            if (listarAluno() != null) {
                listaLogin.add(listarAluno().get(i).getLogin());
            }
        }

        for (int i = 0; i < listarAluno().size(); i++) {
            if (listarAluno() != null) {
                listaSenha.add(listarAluno().get(i).getSenha());
            }
        }
        /*System.out.println(listaLogin);
        System.out.println(listaLogin);
        System.out.println("LOGIN Esse:" + login);
        System.out.println("LOGIN Esse:" + senha);*/
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
