/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Michel
 */
public class Tipo {
    private int codigo;
    private String descricao;

    public Tipo() {
    }

    public Tipo(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
    
    public Tipo(int codigo){
    	this.codigo = codigo;
    	if(codigo==1)
    		descricao="Disponível";
    	else
    		descricao="Indisponível";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
}
