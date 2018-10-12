
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MateriasDB {

    private Connection conexao;

    MateriasDB() {
        try {
            conexao = DriverManager.getConnection(
                    "jdbc:mysql://localhost/escola", "root", "");
            System.out.println("Conexao com o banco de dados realizada com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro na conexao com o banco: "
                    + e);
        }
    }

    public boolean verificaCadastroMateria(String nome, String matricula) {
        //if(listar().size()>0){    
        
        ArrayList<String> listaNome = new ArrayList();
        ArrayList<String> listaMatricula = new ArrayList();
        
        for (int i = 0; i < listar().size(); i++) {
            if (listar().get(i).getNome() != null) {
                listaNome.add(listar().get(i).getNome());
            }
        }

        for (int i = 0; i < listar().size(); i++) {
            if (listar().get(i).getMatricula() != null) {
                listaMatricula.add(listar().get(i).getMatricula());
            }
        }
        for (int i = 0; i < listar().size(); i++) {
            //String Login = listarAluno().get(i).getLogin();
            //System.out.println(Login);
            //String Senha = listarAluno().get(i).getSenha();
            if (listaNome.get(i).equals(nome) && listaMatricula.get(i).equals(matricula)) {
                return true;
            }
        }
        return false;
    }
   

    public void inserir(Materias m) {
        //Inseri na materias do banco Escola. Nela esta contido as as coclunas: nome, bim1, bim2, bim3, bim4, r1, r2, rfinal, bimestre, matricula, atualizado1 e atualizado2! 
        String sql1 = "insert into materias (nome,matricula,bim1,bim2,bim3,bim4,r1,r2,rfinal,"
                + "possibilidade,status,bimestre,atualizado1,atualizado2) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql1);
            stmt.setString(1, m.getNome());
            stmt.setString(2, m.getMatricula());
            stmt.setDouble(3, m.getBim1());
            stmt.setDouble(4, m.getBim2());
            stmt.setDouble(5, m.getBim3());
            stmt.setDouble(6, m.getBim4());
            stmt.setDouble(7, m.getR1());
            stmt.setDouble(8, m.getR2());
            stmt.setDouble(9, m.getRf());
            stmt.setDouble(10, m.getPossibilidade());
            stmt.setString(11, m.getStatus());
            stmt.setInt(12, m.getBimestre());
            stmt.setInt(13, m.getAtualizado1());
            stmt.setInt(14, m.getAtualizado2());

            stmt.execute();
            stmt.close();

            System.out.println("Dados inseridos no banco!");
        } catch (SQLException e) {
            System.out.println("Erro na insercao do banco de dados: " + e);
        }
    }

    public void atualizar(Materias m) {
        String sql = "update materias set bim1 = ?, bim2 = ?, bim3 = ?, bim4 = ?, r1 = ?, r2 = ?, rfinal = ?, possibilidade = ?, status = ?, bimestre = ? where nome = ?";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setDouble(1, m.getBim1());
            stmt.setDouble(2, m.getBim2());
            stmt.setDouble(3, m.getBim3());
            stmt.setDouble(4, m.getBim4());
            stmt.setDouble(5, m.getR1());
            stmt.setDouble(6, m.getR2());
            stmt.setDouble(7, m.getRf());
            stmt.setDouble(8, m.getPossibilidade());
            stmt.setString(9, m.getStatus());
            stmt.setInt(10, m.getBimestre());
            stmt.setString(11, m.getNome());
            stmt.execute();
            stmt.close();

            System.out.println("Dados inseridos no banco!");
        } catch (SQLException e) {
            System.out.println("Erro na insercao do banco de dados: " + e);
        }
    }

    public ArrayList<Materias> listar() {
        ArrayList<Materias> lista = new ArrayList();
        try {
            String sql = "select * from materias";

            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String nome = rs.getString("nome");
                double bim1 = rs.getDouble("bim1");
                double bim2 = rs.getDouble("bim2");
                double bim3 = rs.getDouble("bim3");
                double bim4 = rs.getDouble("bim4");
                double r2 = rs.getDouble("r2");
                double r1 = rs.getDouble("r1");
                double rfinal = rs.getDouble("rfinal");
                double possibilidade = rs.getDouble("possibilidade");
                String status = rs.getString("status");
                int bimestre = rs.getInt("bimestre");
                String matricula = rs.getString("matricula");

                //int cadastrado = rs.getInt("cadastrado");
                //int cadastrado = rs.getInt("cadastrado");
                Materias m = new Materias(bim1, bim2, bim3, bim4, r1, r2, rfinal, possibilidade, nome, bimestre, status,matricula);
                lista.add(m);
            }
            rs.close();
            stmt.close();
            return lista;

        } catch (SQLException e) {
            System.out.println("Erro na consulta: " + e);
        }
        return null;
    }

    public Materias retonarNotas(String matricula, String disciplina) {
        for (int i = 0; i < listar().size(); i++) {
            if (listar().get(i).getMatricula().equals(matricula) && listar().get(i).getNome().equals(disciplina)) {
                return listar().get(i);
            }
        }
        return null;
    }

}
