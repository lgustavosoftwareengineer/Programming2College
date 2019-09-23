/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desenho.simpsons;

import Interfaces.Desenho;

/**
 *
 * @author Luiz
 */
public class Homer implements Desenho {
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
    public void ser2D() {
        System.out.println("Eu sou um desenho a procura da minha terceira dimensão....");
    }
}
