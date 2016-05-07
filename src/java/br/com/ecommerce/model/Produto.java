/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ecommerce.model;

/**
 *
 * @author Mychel Rennó
 */
public class Produto {
    
    public Produto(){
        
    }
    
    private int id;
    
    private String descricao;
    
    private double preco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    @Override
    public String toString(){
        return "Produto{id: "+id+", Descricao: "+descricao+"}";
    }
}
