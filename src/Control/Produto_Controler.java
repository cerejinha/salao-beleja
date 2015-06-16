
package Control;

import Conexao.Conexao;
import Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Produto_Controler {
    
      public void inserirProduto( Produto pro) throws SQLException {
        
         try {
             
             Conexao conecta = new Conexao();        
             Connection conexao = conecta.conecta();
             String sql = "INSERT INTO Produto ("
                     + "ID_Produto"
                     + "ID_Registro,"
                     +"Qauntidade,"
                     + "Valor_Venda,"
                     + "Valor_compra,"
                     + "Nome_Produto, "
                     + "Tipo_Produto) VALUES ()";
             PreparedStatement statement = conexao.prepareStatement(sql);
             statement.setInt(1,pro.getID_Produto());
             statement.setInt(2,pro.getID_Registro());   
             statement.setInt(3,pro.getQuantidade());
             statement.setFloat(4, pro.getValor_Venda());
             statement.setFloat(5, pro.getValor_compra());
             statement.setString(6, pro.getNome_Produto());
             statement.setString(7,pro.getTipo_Produto());
             
             
         
             
             
             int rowsInserted = statement.executeUpdate(); 
             if (rowsInserted > 0) {
                 System.out.println("Novo Produto inserido com sucesso");
             }
         statement.close();
         }
         
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
 
 public void selectMedicamento()throws SQLException {
       
            String sql = "SELECT * FROM  Produto";
            Conexao util2 = new Conexao();
        try (Connection conexao = util2.conecta(); Statement statement = conexao.createStatement()) {
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()){
                
                // integer
                int ID_Produto = result.getInt("id_produto");
                int ID_Registro = result.getInt("id_registro");
                int Quantidade = result.getInt("quantidade");
                
                float Valor_Venda= result.getFloat("venda");
                float Valor_compra= result.getFloat("compra"); 
                        
                
                String Nome_Produto = result.getString("Nome");
                String Tipo_Produto = result.getString("tipo");
               
                        
                
                String output = "Produto #%d: %d -%d -%d -%f -%f -%s -%s ";

                
                System.out.println(String.format(output, ++count,ID_Produto,ID_Registro,Quantidade,Valor_Venda,Valor_compra,Nome_Produto,Tipo_Produto));
  
            
        }
             }
    

 }
}
