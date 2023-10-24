/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla;

import mx.edu.itsur.pokebatalla.model.pokemons.Beedrill;
import mx.edu.itsur.pokebatalla.model.pokemons.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.pokemons.Pikachu;
import mx.edu.itsur.pokebatalla.model.pokemons.Charmander;
import mx.edu.itsur.pokebatalla.model.pokemons.Kabuto;
import mx.edu.itsur.pokebatalla.model.pokemons.Rapidash;

/**
 *
 * @author Edgardo Lopez Mendez 
 */
public class Main {

    
    public static void main(String[] args) {
        
        System.out.println("Hello PokeBatalla!");
        System.out.println("--------------------------------------");
        Kabuto kabu = new Kabuto();
        Beedrill bee = new Beedrill();
        Rapidash rapi = new Rapidash();
        
        System.out.println("Kabuto vs Beedrill" + '\n' + 
                "El vencedor de esta gran batalla final sera el campeon de esta edicion de la PokeBatalla");
        System.out.println("Pelea por el campeonato!:");
        System.out.println("Kabuto ataca");
        kabu.atacar(bee, Kabuto.Movimientos.TRAMPAROCAS);
        System.out.println("Turno de Beedrill");
        System.out.println("Beedrill ataca");
        bee.atacar(kabu, Beedrill.Movimientos.ONDAIGNEA);
        System.out.println("Turno de kabuto");
        kabu.atacar(bee, Kabuto.Movimientos.AZOTE);
        System.out.println("Turno de Beedrill");
        bee.atacar(kabu, Beedrill.Movimientos.RELEVO);
        System.out.println("Turno de Kabuto");
        kabu.atacar(bee, Kabuto.Movimientos.PODERPASADO);
        System.out.println("Beedrill quedo muy furioso despues de ese ataque de Kabuto");
        System.out.println("Turno de Beedrill");
        bee.atacar(kabu, Beedrill.Movimientos.HIPERRAYO);
        System.out.println("Ultimo ataque para ambos pokemons el pokemon con menos hp sera el perdedor");
        System.out.println("Ultimo turno de kabu:");
        kabu.atacar(bee, Kabuto.Movimientos.TRAMPAROCAS);
        System.out.println("Parece que kabu no le hizo mucho danio a Beedrill");
        System.out.println("Ultimo turno de Beedrill");
        bee.atacar(kabu, Beedrill.Movimientos.ONDAIGNEA);
        System.out.println("Al parecer kabu termino con mens hp que Beedrill" + '\n' + 
                "Tenemos un nuuevo campeon que es BEEDRILL");
    }
    
}

    


    

