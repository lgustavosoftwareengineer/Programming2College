/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desenho.toystory;

import Interfaces.Brinquedo;

/**
 *
 * @author Luiz
 */
public class Woody implements Brinquedo {
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
    public void brincarComDono() {
        System.out.println("Eu só sirvo para servir ao meu dono...");
    }
}
