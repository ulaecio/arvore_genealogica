/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class Pessoa {
    private Long id;
    private String nome;
    private String dtNascimento;
    private String senha;
    
     public Pessoa() {
        
    }

    public Pessoa(Long id, String nome, String dtNascimento) {
        this.id = id;
        this.nome = nome;
        this.dtNascimento = dtNascimento;
    }

    public Pessoa(String nome, String dtNascimento, String senha) {
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.senha = senha;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }
    
}
