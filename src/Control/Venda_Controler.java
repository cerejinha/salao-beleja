
package Control;

import Conexao.Conexao;
import Model.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;



public class Venda_Controler {
    
    public void inserirVenda(Venda ven) throws SQLException {
        
         try {
             
             Conexao conecta = new Conexao();        
             Connection conexao = conecta.conecta();
             String sql = "INSERT INTO Venda ("
                     + "ID_Venda,"
                     + " ID_Item,"
                     + "ID_Cliente,"
                     + "ID_Funcionario,"
                     + "Data_Venda) VALUES (?,?,?,?,?)";
             PreparedStatement statement = conexao.prepareStatement(sql);
             statement.setInt(1,ven.getID_Venda());
             statement.setInt(2,ven.getID_Item());
             statement.setInt(3,ven.getID_Cliente());
             statement.setInt(4,ven.getID_Funcionario());
             statement.setString(5,ven.getData_Venda());
             
            
            
              
             int rowsInserted = statement.executeUpdate(); 
             if (rowsInserted > 0) {
                 System.out.println("Nova Venda inserido com sucesso");
             }
         statement.close();
         }
         
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
 
 public void selectMedicamento()throws SQLException {
       
            String sql = "SELECT * FROM Venda";
            Conexao util2 = new Conexao();
        try (Connection conexao = util2.conecta(); Statement statement = conexao.createStatement()) {
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()){
                int ID_Venda = result.getInt("ID_Venda");
                int ID_Item = result.getInt("ID_Item");
                int ID_Cliente = result.getInt("ID_Cliente");
                int ID_Funcionario = result.getInt("ID_Funcionario");
                
                String Data_Venda = result.getString("Data_Venda");
               
                        
                
                String output = "Venda #%d: %d -%d -%d -%d -%s";
                System.out.println(String.format(output, ++count,ID_Venda, ID_Item,ID_Cliente,ID_Funcionario,Data_Venda ));
                                
            
            
            }
        }
             }
    
}
