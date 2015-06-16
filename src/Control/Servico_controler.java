
package Control;

import Conexao.Conexao;
import Model.Servico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Servico_controler {
    
     public void inserirServico( Servico ser) throws SQLException {
        
         try {
             
             Conexao conecta = new Conexao();        
             Connection conexao = conecta.conecta();
             String sql = "INSERT INTO Servico ("
                     + "ID_Servico"
                     + "Valor_Servico,"
                     +"Nome_Servico,"
                     + "Descricao_Servico) VALUES (?,?,?,?)";
             PreparedStatement statement = conexao.prepareStatement(sql);
             statement.setInt(1,ser.getID_Servico());
             statement.setFloat(2, ser.getValor_Servico());
             statement.setString(3, ser.getNome_Servico());
             statement.setString(4,ser.getDescricao_Servico());
             
  
         
             
             
             int rowsInserted = statement.executeUpdate(); 
             if (rowsInserted > 0) {
                 System.out.println("Novo Serviço inserido com sucesso");
             }
         statement.close();
         }
         
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
 
 public void selectMedicamento()throws SQLException {
       
            String sql = "SELECT * FROM Servico";
            Conexao util2 = new Conexao();
        try (Connection conexao = util2.conecta(); Statement statement = conexao.createStatement()) {
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()){
                
                // integer
                int ID_Servico = result.getInt("ID_Servico");
     
                float Valor_Servico= result.getFloat("Valor_Servico");
  
                String Nome_Servico = result.getString("Nome_Servico");
                String  Descricao_Servico = result.getString(" Descricao_Servico");
               
                        
                
                String output = "Servico #%d: %d -%f -%s -%s";

                
                System.out.println(String.format(output, ++count,ID_Servico,Valor_Servico,Nome_Servico, Descricao_Servico));
  
          
    
        }
             }
    

 }
}
