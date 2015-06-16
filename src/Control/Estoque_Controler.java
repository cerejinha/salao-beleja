
package Control;

import Conexao.Conexao;
import Model.Estoque;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Estoque_Controler {
    
     public void inserirEstoque( Estoque estoque) throws SQLException {
        
         try {
             
             Conexao conecta = new Conexao();        
             Connection conexao = conecta.conecta();
             String sql = "INSERT INTO Estoque ("
                     + "id_produto_estoque, "
                     + "id_registro_produto, "
                     + "quantidade_estoque,"
                     + "tipo_produto"
                     + ",nome_produto) VALUES (?,?,?,?,?)";
             PreparedStatement statement = conexao.prepareStatement(sql);
             statement.setInt(1,estoque.getID_Produto_Estoque());
             statement.setInt(2, estoque.getID_Registro_Produto() );
             statement.setInt(3, estoque.getQuantidade_Estoque());
             statement.setString(4, estoque.getTipo_Produto());
             statement.setString(5, estoque.getNome_Produto());
           
    
             int rowsInserted = statement.executeUpdate(); 
             if (rowsInserted > 0) {
                 System.out.println("Novo Estoque Criado com sucesso");
             }
         statement.close();
         }
         
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
 
 public void selectMedicamento()throws SQLException {
       
            String sql = "SELECT * FROM  Estoque";
            Conexao util2 = new Conexao();
        try (Connection conexao = util2.conecta(); Statement statement = conexao.createStatement()) {
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()){
                
                // integer
                int ID_Produto = result.getInt("id_detalhe");
                int ID_Registro_Produto = result.getInt("id_registro");
                int Quantidade_Estoque = result.getInt("quantidade");
                
                //String 
                String Tipo_Produto = result.getString("tipo");
                String Nome_Produto = result.getString("nome_produto");

              

                String output = "Estoque #%d: %d -%d -%d -%s -%s";
                System.out.println(String.format(output, ++count,ID_Produto,ID_Registro_Produto,Quantidade_Estoque,Tipo_Produto,Nome_Produto));
  
            
        }
             }
    

 }
 }
    
    

