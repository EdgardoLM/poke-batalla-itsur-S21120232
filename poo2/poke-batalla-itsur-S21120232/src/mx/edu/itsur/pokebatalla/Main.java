/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla;

import mx.edu.itsur.pokebatalla.model.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.Pikachu;
import mx.edu.itsur.pokebatalla.model.Charmander;
import mx.edu.itsur.pokebatalla.model.Beedrill;
import mx.edu.itsur.pokebatalla.model.Kabuto;
import mx.edu.itsur.pokebatalla.model.Rapidash;
/**
 *
 * @author FJML1983
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Hello PokeBatalla!");
        
        //Pikachu pikachuSalvaje = new Pikachu();
       // Charmander charmanderSalvaje = new Charmander() ;
        
        //Realizar la captura del pikachu salvaje
        //pikachuSalvaje.setNombre("Pedro");        
        //Pikachu miPikachu = pikachuSalvaje;
        
        
        //miPikachu.atacar(charmanderSalvaje);
        
        //miPikachu.atacar(charmanderSalvaje, "ATACKTRUENO");
        
        Beedrill beedrill = new Beedrill();
        Rapidash rapidash = new Rapidash();
        Kabuto kabu = new Kabuto();
        
        beedrill.setNombre("Miles");
        rapidash.setNombre("Spirit");
        kabu.setNombre("Enzo");
        
        System.out.println("Hello PokeBatalla!");
        System.out.println("----------------------------------------------------------");
        System.out.println("Pelea 1:");
        kabu.atacar(beedrill);
        kabu.atacar(beedrill, "CHUPAVIDAS");
        System.out.println("El ganador es " + kabu);
        
        System.out.println("----------------------------------------------------------");
        System.out.println("Pelea 2");
        rapidash.atacar(kabu);
        rapidash.atacar(kabu, "DOBLE GOLPE");
        System.out.println("El ganador es " + rapidash);
        
        System.out.println("-----------------------------------------------------------");
        System.out.println("Pelea 3");
        beedrill.atacar(rapidash);
        beedrill.atacar(rapidash, "PICADURA");
        System.out.println("El ataque de " + beedrill + "fue nulo");
        System.out.println("Turno de ataque de " + kabu);
        kabu.atacar(beedrill);
        kabu.atacar(beedrill, "ABZORBER");
        System.out.println("El ganador es " + kabu);
        
    }
    
}
