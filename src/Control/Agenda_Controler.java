
package Control;

import Conexao.Conexao;
import Model.Agenda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Agenda_Controler {
    
    public void inserirAgenda(Agenda age) throws SQLException {
        
         try {
             
             Conexao conecta = new Conexao();        
             Connection conexao = conecta.conecta();
             String sql = "INSERT INTO Agenda ("
                     + "id_agenda,"
                     + "id_cliente,"
                     + "id_funcionario,"
                     + "nome_servico,"
                     + "data_marcada,"
                     + "hora_marcada,"
                     + "valor_servico) VALUES (?,?,?,?,?,?,?)";
             PreparedStatement statement = conexao.prepareStatement(sql);
             statement.setInt(1,age.getId_agenda());
             statement.setInt(2,age.getId_cliente());
             statement.setInt(3,age.getId_funcionario());
             statement.setString(4,age.getNome_servico());
             statement.setString(5,age.getData_marcada());
             statement.setString(6,age.getHora_marcada());
             statement.setFloat(7,age.getValor_servico());
          
             
    
              
             int rowsInserted = statement.executeUpdate(); 
             if (rowsInserted > 0) {
                 System.out.println("Novo serviço inserido na agenda com sucesso");
             }
         statement.close();
         }
         
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
 
 public void selectMedicamento()throws SQLException {
       
            String sql = "SELECT * FROM Agenda";
            Conexao util2 = new Conexao();
        try (Connection conexao = util2.conecta(); Statement statement = conexao.createStatement()) {
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()){
                int id_agenda = result.getInt("id_agenda");
                int id_cliente = result.getInt("id_cliente");
                int id_funcionario = result.getInt("id_funcionario");
              
                
                String nome_servico = result.getString("nome_servico");
                String data_marcada = result.getString("data_marcada");
                String hora_marcada= result.getString("hora_marcada");
                        
                float valor_servico= result.getFloat("valor_servico");
                
                String output = "Agenda #%d: %d -%d -%d  -%s -%s -%s -%f ";
                System.out.println(String.format(output, ++count,id_agenda,id_cliente,id_funcionario,nome_servico,data_marcada,hora_marcada,valor_servico ));
                                
              
           
            }
        }
             }
}
