
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexão 
{
    public Connection getConexao() 
    {
                    try 
                    {
                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/veronica_cosmeticos_bd","root","duque");
                        System.out.println("conectado" );
                        return conn;
            
                    } 
                    catch (Exception e) 
                    {
                        System.out.println("Erro ao conectar: " + e.getMessage());
                        return null;
                    }
    }
}
