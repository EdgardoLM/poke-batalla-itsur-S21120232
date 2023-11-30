/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla;

import mx.edu.itsur.pokebatalla.model.battles.Batalla;
import mx.edu.itsur.pokebatalla.model.battles.Entrenador;
import mx.edu.itsur.pokebatalla.model.pokemons.Beedrill;
import mx.edu.itsur.pokebatalla.model.pokemons.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.pokemons.Charmander;
import mx.edu.itsur.pokebatalla.model.pokemons.Kabuto;
import mx.edu.itsur.pokebatalla.model.pokemons.Pikachu;
import mx.edu.itsur.pokebatalla.model.pokemons.Rapidash;
import mx.edu.itsur.pokebatalla.utils.FileManager;

/**
 *
 * @author Edgardo Lopez Mendez 
 */
public class Main {
       
    public static void main(String[] args) {
       

        System.out.println("++++++ HELLO POKEBATALLA +++++");

        Pikachu pika = new Pikachu();
        Beedrill bee = new Beedrill();
        Kabuto kabu = new Kabuto();
        Rapidash rapi = new Rapidash();
        Charmander charm = new Charmander();
        Bullbasaur bull = new Bullbasaur();
                
        Entrenador ent1 = new Entrenador("Edgardo");
        ent1.capturarPokemon(bee);
        ent1.capturarPokemon(kabu);
        ent1.capturarPokemon(charm);
        
        
        Entrenador ent2 = new Entrenador("Kylian");
        ent2.capturarPokemon(pika);
        ent2.capturarPokemon(rapi);
        ent2.capturarPokemon(bull);
        
        Batalla b = null;
        
        Batalla batallaGuardada = FileManager.leerDesdeArchivo();
        
        if(batallaGuardada != null){
            
            b = batallaGuardada;

        } else {
                    System.out.println("Pokebatalla itsur");
            b = new Batalla(ent1, ent2);
                   
        }
        
        b.desarrollarBatalla();
    }
}

    


    

