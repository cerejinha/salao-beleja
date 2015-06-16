
package Control;

import Conexao.Conexao;
import Model.Registro_Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Registro_controler {
    
    public void inserirRegistro(Registro_Produto reg) throws SQLException {
        
         try {
             
             Conexao conecta = new Conexao();        
             Connection conexao = conecta.conecta();
             String sql = "INSERT INTO Registro (id_registro,quantidade,Id_fornecedor,data_compra,data_venda,Valor_Venda,Valor_compra) VALUES (?,?,?,?,?,?,?)";
             PreparedStatement statement = conexao.prepareStatement(sql);
             statement.setInt(1, reg.getId_registro());
             statement.setInt(2, reg.getQuantidade());
             statement.setInt(3, reg.getId_fornecedor());
             statement.setString(4,reg.getData_compra());
             statement.setString(5,reg.getData_venda());
             statement.setFloat(6, reg.getValor_Venda());
             statement.setFloat(7, reg.getValor_compra());
             
             
            
          
             
              
             int rowsInserted = statement.executeUpdate(); 
             if (rowsInserted > 0) {
                 System.out.println("Novo Registro de venda inserido com sucesso");
             }
         statement.close();
         }
         
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
 
 public void selectMedicamento()throws SQLException {
       
            String sql = "SELECT * FROM Registro_Produto";
            Conexao util2 = new Conexao();
        try (Connection conexao = util2.conecta(); Statement statement = conexao.createStatement()) {
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()){
                int id_registro= result.getInt("id_registro");
                int quantidade = result.getInt("id_quantidade");
                int Id_fornecedor = result.getInt("id_fornecedor");
               
                
                String data_compra = result.getString("data_copra");
                String data_venda = result.getString("data_venda");
                
                 float Valor_Venda= result.getFloat("venda");
                float Valor_compra= result.getFloat("compra"); 
                
                String output = "Registro #%d: %d -%d -%d  -%s -%s -%f -%f ";
                System.out.println(String.format(output, ++count,id_registro,quantidade,Id_fornecedor,data_compra,data_venda,Valor_Venda,Valor_compra));
                                
              
            
            }
        }
             }
    
}
