
package Control;

import Conexao.Conexao;
import Model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Funcionario_controler {
    
     public void inserirCliente(Funcionario fun) throws SQLException {
        
         try {
             
             Conexao conecta = new Conexao();        
             Connection conexao = conecta.conecta();
             String sql = "INSERT INTO Funcionario("
                     + "id_funcionario,"
                     + "RG_Funcionario, "
                     + "CPF_Funcionario,"
                     + "Login_Funcionario,"
                     + " Senha_Funcionario, "
                     + "Tipo_Acesso,"
                     + "Telefone,"
                     + "Nome_Funcionario,"
                     + " Endereco_Funcionario,"
                     + " Email_Funcionario,"
                     + "CTPS) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
             PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1, fun.getId_funcionario());
            statement.setInt(2, fun.getRG_Funcionario());
            statement.setInt(3,fun.getCPF_Funcionario() );
            statement.setString(4, fun.getLogin_Funcionario());
            statement.setInt(5, fun.getSenha_Funcionario());
            statement.setString(6, fun.getTipo_Acesso());       
            statement.setInt(7, fun.getTelefone());
            statement.setString(8, fun.getNome_Funcionario());
            statement.setString(9,fun.getEndereco_Funcionario());
            statement.setString(10,fun.getEmail_Funcionario());
            statement.setString(11, fun.getCTPS());
                   
             
             
  //  int id_funcionario,RG_Funcionario, CPF_Funcionario,Login_Funcionario, Senha_Funcionario, Tipo_Acesso,Telefone;
            
   // String Nome_Funcionario, Endereco_Funcionario, Email_Funcionario,CTPS;

              
             int rowsInserted = statement.executeUpdate(); 
             if (rowsInserted > 0) {
                 System.out.println("Novo Funcionário inserido com sucesso");
             }
         statement.close();
         }
         
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
 
 public void selectMedicamento()throws SQLException {
       
            String sql = "SELECT * FROM Funcionario";
            Conexao util2 = new Conexao();
        try (Connection conexao = util2.conecta(); Statement statement = conexao.createStatement()) {
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()){
                int id_funcionario = result.getInt("id_Cliente");
                int RG_funcionario = result.getInt("RG_Cliente");
                int CPF_Funcionario = result.getInt("CPF_cliente");
                int  Senha_Funcionario= result.getInt("senha");
                int Telefone = result.getInt("telefone");
                
                
                
               String Nome_Funcionario= result.getString("nome");
               String Endereco_Funcionario= result.getString("endereço");
               String Email_Funcionario= result.getString("email");
               String CTPS= result.getString("login");
               String Tipo_Acesso= result.getString("tipo"); 
                       
                        
                
                String output = "Funcionario #%d: %d -%d -%d -%d -%d -%s -%s -%s  -%s -%s";
                System.out.println(String.format(output, ++count, id_funcionario,RG_funcionario,CPF_Funcionario,Senha_Funcionario,Telefone,Nome_Funcionario,Endereco_Funcionario,Email_Funcionario,CTPS,Tipo_Acesso));
                                
              
            
            }
        }
             }
    
    
    
}
