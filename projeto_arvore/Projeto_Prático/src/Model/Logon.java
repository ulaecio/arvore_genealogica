/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class Logon {
    private String email;
    private String senha; 
    private String confsenha;

    public Logon() {
    }

    public Logon(String email, String senha, String confsenha) {
        this.email = email;
        this.senha = senha;
        this.confsenha = confsenha;
    }
    
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfsenha() {
        return confsenha;
    }

    public void setConfsenha(String confsenha) {
        this.confsenha = confsenha;
    }

    
    
    
}
