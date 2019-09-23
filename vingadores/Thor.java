/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real.filmes.vingadores;
import Interfaces.Vingador;
import Interfaces.Deus;

/**
 *
 * @author Luiz
 */
public class Thor implements Vingador, Deus {
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
    public void vingadoresAvante() {
        System.out.println("AVENGERS ASSEMBLE!!!!!!");
    }

    @Override
    public void euSouUmDeusCriaturaRídicula() {
        System.out.println("EU SOU UM DEUS CRIATURA RIDÍCULAAA!!!");
    }
}
