/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diversão;
/*IMPORTAÇÕES*/
//importando os vingadores
import real.filmes.vingadores.HomemDeFerro;
import real.filmes.vingadores.CapitãoAmérica;
import real.filmes.vingadores.Hawkeye;
import real.filmes.vingadores.Hulk;
import real.filmes.vingadores.Thor;
import real.filmes.vingadores.ViúvaNegra;
//importando La Casa De Papel
import real.series.lacasadepapel.Rio;
import real.series.lacasadepapel.Berlín;
import real.series.lacasadepapel.Nairobi;
import real.series.lacasadepapel.ElProfesor;
import real.series.lacasadepapel.Tokio;
//importando os simpsons
import desenho.simpsons.Bart;
import desenho.simpsons.Homer;
import desenho.simpsons.Lisa;
import desenho.simpsons.Maggie;
import desenho.simpsons.Marge;
//importando Toy Story
import desenho.toystory.Andy;
import desenho.toystory.BuzzLightyear;
import desenho.toystory.Sid;
import desenho.toystory.Woody;
//importando Doom
import game.primeirapessoa.Doom.FuzileiroEspacial;
//importando Gears of Wars
import game.terceirapessoa.GearsOfWars.AugustusCole;
import game.terceirapessoa.GearsOfWars.DamonBaird;
import game.terceirapessoa.GearsOfWars.Dom;
import game.terceirapessoa.GearsOfWars.MarcusFenix;
/**
 *
 * @author Luiz
 */
public class Diversão {
    public static void main(String[] args){
        // Vingadores
        HomemDeFerro hom = new HomemDeFerro();
        hom.setNome("Tony");
        hom.existir();
        hom.fazerExperiência();
        hom.vingadoresAvante();
        
        CapitãoAmérica cap = new CapitãoAmérica();
        cap.setNome("Steve");
        cap.existir();
        cap.lutar();
        cap.vingadoresAvante();
        
        Hawkeye haw = new Hawkeye();
        haw.setNome("Clint");
        haw.atirarFlecha();
        haw.espionar();
        haw.existir();
        haw.vingadoresAvante();
        
        Hulk hul = new Hulk();
        hul.setNome("Bruce");
        hom.existir();
        hom.fazerExperiência();
        hom.vingadoresAvante();
        
        Thor tho = new Thor();
        tho.setNome("Thor");
        tho.euSouUmDeusCriaturaRídicula();
        tho.vingadoresAvante();
        
        ViúvaNegra viu = new ViúvaNegra();
        viu.setNome("Natasha");
        viu.espionar();
        viu.existir();
        viu.vingadoresAvante();
        
        // Simpsons
        Bart bar = new Bart();
        bar.setNome("Bart");
        bar.ser2D();
        
        Homer home = new Homer();
        home.setNome("Homer");
        home.ser2D();
        
        Lisa lis = new Lisa();
        lis.setNome("Lisa");
        lis.ser2D();
        
        Maggie mag = new Maggie();
        mag.setNome("Maggie");
        mag.ser2D();
        
        Marge mar = new Marge();
        mar.setNome("Marge");
        mar.ser2D();
        // ToyStory
        Andy and = new Andy();
        and.setNome("Andy");
        and.existir();
        
        BuzzLightyear buz = new BuzzLightyear();
        buz.setNome("Buzz");
        buz.lutar();
        buz.brincarComDono();
        
        Sid sid = new Sid();
        sid.setNome("Sid");
        sid.existir();
        Woody woo = new Woody();
        woo.setNome("Woody");
        woo.brincarComDono();
        // Doom
        FuzileiroEspacial fuz = new FuzileiroEspacial();
        fuz.setNome("Fuzileiro");
        fuz.existir();
        fuz.lutar();
        // Gears
        AugustusCole au = new AugustusCole();
        au.setNome("Augustus");
        au.existir();
        au.lutar();
        
        DamonBaird dam = new DamonBaird();
        dam.setNome("Damon Baird");
        dam.existir();
        dam.lutar();
        
        Dom dom = new Dom();
        dom.setNome("Dominique");
        dom.existir();
        dom.lutar();
        
        MarcusFenix marc = new MarcusFenix();
        marc.setNome("Marcus Fenix");
        marc.existir();
        marc.lutar();
        // La casa de papel
        Berlín ber = new Berlín();
        ber.setNome("Berlim");
        ber.assaltar();
        ber.existir();
        
        ElProfesor el = new ElProfesor();
        el.setNome("O professor");
        el.assaltar();
        el.existir();
        
        Nairobi nai = new Nairobi();
        nai.setNome("Nairobi");
        nai.assaltar();
        nai.existir();
        
        Rio rio = new Rio();
        rio.setNome("Rio");
        rio.assaltar();
        rio.existir();
        
        Tokio tok = new Tokio();
        tok.setNome("Tokyo");
        tok.assaltar();
        tok.existir();
        
    }
    
}
