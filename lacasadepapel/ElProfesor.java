/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.series.lacasadepapel;

import Interfaces.Assaltante;
import Interfaces.Humano;

/**
 *
 * @author Luiz
 */
public class ElProfesor implements Humano, Assaltante{
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
    public void assaltar() {
        System.out.println("Roubar bancos é a minha especialidade, especialmente se for a casa da moeda!");
    }
}
