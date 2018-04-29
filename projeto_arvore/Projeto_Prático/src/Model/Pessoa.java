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
    private String sexo;
    private String parentesco;

    public Pessoa() {
    }

    public Pessoa(String nome, String dtNascimento, String sexo, String parentesco) {
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.sexo = sexo;
        this.parentesco = parentesco;
    }

    public Pessoa(Long id, String nome, String dtNascimento, String sexo, String parentesco) {
        this.id = id;
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.sexo = sexo;
        this.parentesco = parentesco;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    
    
}
