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
public class Filme {
    private int codigo;
    private String titulo;
    private double preco;
    private String genero;
    private String descricao;
    private Tipo tipo;

    public Filme() {
    }

    public Filme(int codigo, String titulo, double preco, String genero, String descricao) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.preco = preco;
        this.genero = genero;
        this.descricao = descricao;
    }
    
    public Filme(int codigo, String titulo, double preco, String genero, String descricao, Tipo tipo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.preco = preco;
        this.genero = genero;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    
}
