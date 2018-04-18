/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import JDBC.ConexaoBD;
import Model.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PessoaDao {
    private Connection con;
    
    public PessoaDao(){
        this.con = new ConexaoBD().getConnection();
    } 
    
    public boolean add(Pessoa p){
       String sql = "INSERT INTO cadastro(nome,dtNascimento, senha) VALUES (?,?,?);"; 
    
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getDtNascimento());
            stmt.setString(3, p.getSenha());
            stmt.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
}
  
    public boolean update(Pessoa p){
       String sql = "UPDATE cadastro SET nome = ?, DtNascimento = ?, senha = ? WHERE id = ?;"; 
    
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getDtNascimento());
            stmt.setString(3, p.getSenha());
            stmt.setLong(4, p.getId());
            stmt.execute();
            stmt.close();
            con.close();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
        
    public boolean delete(Pessoa p){
        String sql = "DELETE FROM cadastro WHERE id = ?;"; 

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1, p.getId());
            stmt.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(PessoaDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
}
    
    
}