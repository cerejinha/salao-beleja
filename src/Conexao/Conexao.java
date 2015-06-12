
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {


    public Connection conecta() throws SQLException {
        Connection conexao = null;

        String url = "jdbc:mysql://localhost/farmacia";  //Nome da base de dados
        String user = "root"; //nome do usuário do MySQL
        String password = ""; //senha do MySQL
        try {
            conexao = DriverManager.getConnection(url, user, password);
        } catch (SQLException sqlex) {
            System.out.println("Erro na conexão " + sqlex);
        }
        return conexao;
    }

    public void desconecta(Connection conexao) {
        try {
            conexao.close();
        } catch (SQLException sqlex) {
            System.out.println("Erro na conexão " + sqlex);
        }
    }
    
    
    
    
    
    
}
