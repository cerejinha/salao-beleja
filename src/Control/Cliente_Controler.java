
package Control;

import Conexao.Conexao;

import Model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Cliente_Controler {
    
    
     public void inserirCliente(Cliente cliente) throws SQLException {
        
         try {
             
             Conexao conecta = new Conexao();        
             Connection conexao = conecta.conecta();
             String sql = "INSERT INTO Cliente (id_cliente, Telefone_Cliente, RG_Cliente, CPF_cliente,Nome_Cliente,Endereco_Cliente,Email_Cliente) VALUES (?,?,?,?,?,?,?)";
             PreparedStatement statement = conexao.prepareStatement(sql);
             statement.setInt(1,cliente.getId_cliente());
             statement.setInt(2,cliente.getTelefone_Cliente());
             statement.setInt(3,cliente.getRG_Cliente());
             statement.setInt(4,cliente.getCPF_cliente());
             statement.setString(5,cliente.getNome_Cliente());
             statement.setString(6,cliente.getEndereco_Cliente());
             statement.setString(7,cliente.getEmail_Cliente());
            
              
             int rowsInserted = statement.executeUpdate(); 
             if (rowsInserted > 0) {
                 System.out.println("Novo Cliente inserido com sucesso");
             }
         statement.close();
         }
         
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
 
 public void selectMedicamento()throws SQLException {
       
            String sql = "SELECT * FROM Cliente";
            Conexao util2 = new Conexao();
        try (Connection conexao = util2.conecta(); Statement statement = conexao.createStatement()) {
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()){
                int id_cliente = result.getInt("id_Cliente");
                int Telefone_Cliente = result.getInt("Telefone_Cliente");
                int RG_Cliente = result.getInt("RG_Cliente");
                int CPF_cliente = result.getInt("CPF_cliente");
                
                String Nome_Cliente = result.getString("Nome_Cliente");
                String Endereco_Cliente = result.getString("Endereco_Cliente");
                String Email_Cliente= result.getString("Email_Cliente");
                        
                
                String output = "Cliente #%d: %d -%d -%d -%d -%s -%s -%s ";
                System.out.println(String.format(output, ++count, id_cliente,Telefone_Cliente,RG_Cliente,CPF_cliente,Nome_Cliente,Endereco_Cliente,Email_Cliente));
                                
              
            
            }
        }
             }

}
    
    
    
