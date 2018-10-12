import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProdutosBanco {
        
    private Connection conexao;
    
    ProdutosBanco(){
        try {
            conexao = DriverManager.getConnection(
                     "jdbc:mysql://localhost/escola", "root", "");
             System.out.println("Conexao com o banco de dados realizada com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro na conexao com o banco: "+e);
        }
    }
    
    public void inserir(Produtos p){
       String sql = "insert into jantar (nome, preco) values (?,?)";
        try{
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, p.getNome());
            stmt.setDouble(2, p.getPreco());
            stmt.execute();
            stmt.close();

            System.out.println("Dados inseridos no banco!");
        }catch(SQLException e){
            System.out.println("Erro na insercao do banco de dados: "+e);
        }
   }
   

    
}
