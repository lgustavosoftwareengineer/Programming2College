/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.filmes.vingadores;

import Interfaces.Cientista;
import Interfaces.Humano;
import Interfaces.Vingador;

/**
 *
 * @author Luiz
 */
public class HomemDeFerro implements Humano, Cientista, Vingador {
    private String nome;
    // Obtendo acesso ao atributo privado com o método Get
    public String getNome(){
        return this.nome;
    };
    // Setando o valor para o atributo this.nome que será nome
    public void setNome(String nome){
        this.nome = nome;
    };

    @Override
    public void existir() {
        System.out.println("Por que existimos? O que é existir? E se eu existo eu sou humano?");
    }

    @Override
    public void fazerExperiência() {
        System.out.println("A descoberta é uma fase de um novo caminho a ser alcançado!");
    }

    @Override
    public void vingadoresAvante() {
        System.out.println("AVENGERS ASSEMBLE!!!!!!");
    }

}
