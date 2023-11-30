/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.battles;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import mx.edu.itsur.pokebatalla.model.pokemons.Pokemon;

/**
 *
 * @author Edgardo Lopez Mendez 
 */
public class Entrenador implements Serializable{
    //3a Atributos
    protected String nombre;
    protected List<Pokemon> pokemonsCapturados;
    protected Pokemon pokemonActual;

    //3b Constructor
    public Entrenador(String nombre) {
        this.nombre = nombre;
        pokemonsCapturados = new ArrayList<>();
    }

    // Metodos
    public void capturarPokemon(Pokemon pk) {
        pokemonsCapturados.add(pk);
    }

    //Instruir movimiento 
    public void instruirMovimientoAlPokemonActual(Pokemon oponente, int ordinalMovimiento)
    {
       if(pokemonActual == null)
        {
            System.out.println("NO HAY UN POKEMON ACTUAL");
            return;
        }
        
        if(ordinalMovimiento < 0 || ordinalMovimiento >= pokemonActual.getMovimientos().length)
        {
            System.out.println("EL ORDINAL MOVIMIENTO NO ES VALIDO");
            return;
        }
        this.pokemonActual.atacar(oponente, ordinalMovimiento);   
    }

    //Devuelve true cuando todos los Pokemon del entrenador tengan 0 HP
    public boolean estaDerrotado() 
    {
        int sumaHP = 0;
        for (Pokemon pokemon : pokemonsCapturados) {
            sumaHP += pokemon.getHp();
        }
        
        return (sumaHP <= 0);
    }

    //Getters y Setters
    public String getNombre(){
        return nombre;
    }

    public Pokemon getPokemonActual(){
        return this.pokemonActual;
    }

    public void setPokemonActual(Pokemon p){
        this.pokemonActual = p;
    }

    public List<Pokemon> getPokemonsCapturados(){
        return this.pokemonsCapturados;
    }    
}

