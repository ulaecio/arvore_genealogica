/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import JDBC.ConexaoBD;
import Model.Logon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogonDao {
    private Connection con;
    
    public LogonDao(){
        this.con = new ConexaoBD().getConnection();
    } 
    
    public boolean add(Logon p){
       String sql = "INSERT INTO login(email,senha, confsenha) VALUES (?,?,?);"; 
    
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, p.getEmail());
            stmt.setString(2, p.getSenha());
            stmt.setString(3, p.getConfsenha());
            stmt.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(LogonDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
}
  
    
}
