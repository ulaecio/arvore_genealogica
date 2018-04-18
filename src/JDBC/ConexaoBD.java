package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoBD {
    
    public Connection getConnection(){
        System.out.println("Conectado ao Banco");
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/swingapp","root","admin");
		return con;	
        } catch (SQLException ex) {
            System.out.println("ERRO, NÃO ABRIR CONEXÃO!");
            throw new RuntimeException(ex);
        }
                
    }
}
