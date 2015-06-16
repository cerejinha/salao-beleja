
package Control;

import Conexao.Conexao;
import Model.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Fornecedor_Controler {
    
    
    public void inserirFornecedor( Fornecedor fornece ) throws SQLException {
        
         try {
             
             Conexao conecta = new Conexao();        
             Connection conexao = conecta.conecta();
             String sql = "INSERT INTO Fornecedor("
                     + "cnpj,"
                     + "telefone,"
                     + "nome,"
                     + "email,"
                     + "endereco) VALUES (?,?,?,?,?)";
             PreparedStatement statement = conexao.prepareStatement(sql);
             statement.setInt(1, fornece.getCNPJ());
             statement.setInt(2, fornece.getTelefone());
             statement.setString(3, fornece.getNome_Fornecedor());
             statement.setString(4,fornece.getEmail_Fornecedor());
             statement.setString(5, fornece.getEndereco_Fornecedor());
                     

           
             
             int rowsInserted = statement.executeUpdate(); 
             if (rowsInserted > 0) {
                 System.out.println("Novo Fornecedor inserido com sucesso");
             }
         statement.close();
         }
         
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
 
 public void selectMedicamento()throws SQLException {
       
            String sql = "SELECT * FROM Fornecedor";
            Conexao util2 = new Conexao();
        try (Connection conexao = util2.conecta(); Statement statement = conexao.createStatement()) {
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()){
                
                // integer
                int CNPJ = result.getInt("cnpj");
                int telefone = result.getInt("telefone");
                
                //String
                String Nome_Fornecedor = result.getString("nome");
                String email_Fornecedor = result.getString("email");
                String Endereco_Fornecedor = result.getString("endereco");
                

                String output = "Fornecedor #%d: %d -%d -%s -%s -%s";
                System.out.println(String.format(output, ++count,CNPJ,telefone,Nome_Fornecedor,email_Fornecedor,Endereco_Fornecedor));
  
            
     
                
        }
             }
    

 }
    
}
