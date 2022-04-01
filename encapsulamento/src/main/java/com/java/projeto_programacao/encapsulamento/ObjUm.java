/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.projeto_programacao.encapsulamento;

/**
 *
 * @author Guilherme Silva
 */
public class ObjUm {
    private     String nome;
    private int idade;
    private Double dinheiroInicial;
    private Double dinheiroFinal;

    public ObjUm(String nome, int idade, Double dinheiroInicial, Double dinheiroFinal) {
        this.nome = nome;
        this.idade = idade;
        this.dinheiroInicial = dinheiroInicial;
        this.dinheiroFinal = dinheiroFinal;
    }

    public String getNome() {
        
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Double getDinheiroInicial() {
        return dinheiroInicial;
    }

    public void setDinheiroInicial(Double dinheiroInicial) {
        this.dinheiroInicial = dinheiroInicial;
    }

    public Double getDinheiroFinal() {
        return dinheiroFinal;
    }

    public void setDinheiroFinal(Double dinheiroFinal) {
        this.dinheiroFinal = dinheiroFinal;
    }
    
    
   public Double conta (){
    Double valor = (this.dinheiroInicial+this.dinheiroFinal);
        return valor;
   }
}


