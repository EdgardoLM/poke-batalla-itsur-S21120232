/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

import mx.edu.itsur.pokebatalla.model.moves.Azote;
import mx.edu.itsur.pokebatalla.model.moves.TrampaRocas;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.PoderPasado;

/**
 *
 * @author Edgardo Lopez Mendez 
 */
public class Kabuto extends Pokemon{
    
    public enum Movimientos {
        AZOTE,
        TRAMPAROCAS,
        PODERPASADO
        
    }
     public Kabuto() {
        tipo = "ROCA/AGUA";
        hp = 30;
        ataque = 80;
        defensa = 90;
        nivel = 1;
        precision = 3;
    }
    
 public void atacar(Pokemon oponente, Kabuto.Movimientos movimientoAUtilizar) {

        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;        
        switch (movimientoAUtilizar) {
            case AZOTE:
                instanciaMovimiento = new Azote();
                break;
            case TRAMPAROCAS:
                instanciaMovimiento = new TrampaRocas();
                break;
            case PODERPASADO:
                instanciaMovimiento = new PoderPasado();
                break;

            //Otros movimientos aquí...                
            default:
                throw new AssertionError();
        }

        //Aplicar el movimiento.
        instanciaMovimiento.utilizar(this, oponente);
    }
}
