/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla;

import mx.edu.itsur.pokebatalla.model.battles.Batalla;
import mx.edu.itsur.pokebatalla.model.battles.Entrenador;
import mx.edu.itsur.pokebatalla.model.pokemons.Beedrill;
import mx.edu.itsur.pokebatalla.model.pokemons.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.pokemons.Pikachu;
import mx.edu.itsur.pokebatalla.model.pokemons.Charmander;
import mx.edu.itsur.pokebatalla.model.pokemons.Kabuto;
import mx.edu.itsur.pokebatalla.model.pokemons.Rapidash;
import mx.edu.itsur.pokebatalla.utils.FileManager;

/**
 *
 * @author Edgardo Lopez Mendez 
 */
public class Main {

    
    public static void main(String[] args) {
        
        System.out.println("Hello PokeBatalla!");
        
       
        Kabuto Kabu = new Kabuto();
        Beedrill bee = new Beedrill();
        Rapidash rapi = new Rapidash();
        
        Entrenador ent1 = new Entrenador("Edgardo");
        ent1.capturarPokemon(rapi);
        ent1.capturarPokemon(bee);

        Entrenador ent2 = new Entrenador("Gute");
        ent2.capturarPokemon(Kabu);
        
        Batalla battle = new Batalla(ent1, ent2);
        battle.desarrollarBatalla();
        
        //Guardar hacia archivo
        FileManager.guardarHaciaArchivo(battle);
       
        
        
        
        Batalla b1 = FileManager.leerDesdeArchivo();
        
        
      
       
        
        
    }
            
        
        
        
        
}

    


    

