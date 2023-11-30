/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

import mx.edu.itsur.pokebatalla.model.moves.Hiperrayo;
import mx.edu.itsur.pokebatalla.model.moves.Relevo;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.OndaIgnea;

/**
 *
 * @author Edgardo Lopez Menez 
 */
public class Beedrill extends Pokemon {
    
    @Override
    public Enum[] getMovimientos() {
    return Beedrill.Movimientos.values();
		}
    
    
    public enum Movimientos {
        RELEVO,
        HIPERRAYO,
        ONDAIGNEA

    }
    
    public Beedrill() {
        tipo = "BICHO/VENENO";
        hp = 45;
        ataque = 49;
        defensa = 49;
        nivel = 1;
        precision = 4;
    }
    
     public Beedrill(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
     
    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        Beedrill.Movimientos movimientoAUtilizar =
                Beedrill.Movimientos.values()[ordinalMovimiento];
        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;        
        switch (movimientoAUtilizar) {
            case RELEVO:
                instanciaMovimiento = new Relevo();
                break;
            case HIPERRAYO:
                instanciaMovimiento = new Hiperrayo();
                break;
            case ONDAIGNEA:
                instanciaMovimiento = new OndaIgnea();
                break;

            //Otros movimientos aquí...                
            default:
                throw new AssertionError();
        }

        //Aplicar el movimiento.
        instanciaMovimiento.utilizar(this, oponente);
    }
}
