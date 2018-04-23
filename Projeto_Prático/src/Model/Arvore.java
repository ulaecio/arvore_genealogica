/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Nando
 */
public class Arvore {
    private Long id;
    private String nomeCompleto;
    private String parentesco;
    private String sexo;

    public Arvore(String nomeCompleto, String parentesco, String sexo) {
        this.nomeCompleto = nomeCompleto;
        this.parentesco = parentesco;
        this.sexo = sexo;
    }

    public Arvore() {
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
    
    
}
