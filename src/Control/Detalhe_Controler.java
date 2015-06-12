
package Control;

import Conexao.Conexao;
import Model.Detalhe_Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;







public class Detalhe_Controler {
  
    
     public void inserirDetalhe( Detalhe_Controler detalhe) throws SQLException {
        
         try {
             
             Conexao conecta = new Conexao();        
             Connection conexao = conecta.conecta();
             String sql = "INSERT INTO Detalhe (Id_Detalhe, Quantidade, ID_Venda, ID_Cliente,ID_Produto,Preco_Unitario, Preco_Total,Forma_Pagamento) VALUES (?,?,?,?,?,?,?,?)";
             PreparedStatement statement = conexao.prepareStatement(sql);
           
           
             
             int rowsInserted = statement.executeUpdate(); 
             if (rowsInserted > 0) {
                 System.out.println("Novo Detalhe inserido com sucesso");
             }
         statement.close();
         }
         
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
 
 public void selectMedicamento()throws SQLException {
       
            String sql = "SELECT * FROM  Detalhe_Controler";
            Conexao util2 = new Conexao();
        try (Connection conexao = util2.conecta(); Statement statement = conexao.createStatement()) {
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()){
                int ID_Detalhe = result.getInt("id_detalhe");
                int Quantidade = result.getInt("quantidade");
                int ID_Venda= result.getInt("id_venda");
                int ID_Cliente= result.getInt("id_Cliente");
                int ID_Produto= result.getInt("id_produto");
                
                float Preco_Unitario=  result.getFloat("preco_unitario");
                float Preco_Total = result.getFloat("preco_unitario");
                
                String Forma_Pagamento = result.getString("forma_pagamento");
       
                String output = "Detalhe #%d: %d -%d -%d -%d -%f -%f -%s";
                System.out.println(String.format(output, ++count,ID_Detalhe,Quantidade,ID_Venda,ID_Cliente,ID_Produto,Preco_Unitario,Preco_Total,Forma_Pagamento));
  
            
        }
             }
    

 }
 }
 
