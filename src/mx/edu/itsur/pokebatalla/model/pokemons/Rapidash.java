/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

;
import mx.edu.itsur.pokebatalla.model.moves.Bote;
import mx.edu.itsur.pokebatalla.model.moves.Contoneo;
import mx.edu.itsur.pokebatalla.model.moves.DobleFilo;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;

/**
 *
 * @author Edgardo Lopez Mendez
 */
public class Rapidash extends Pokemon{
    
    @Override
    public Enum[] getMovimientos() {
    return Rapidash.Movimientos.values();
		}
    
    public enum Movimientos {
        CONTONEO,
        BOTE,
        DOBLEFILO
        
    }
     public Rapidash() {
        tipo = "FUEGO";
        hp = 65;
        ataque = 100;
        defensa = 70;
        nivel = 1;
        precision = 2;
    }
     
      public Rapidash(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
      
@Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {

        Rapidash.Movimientos movimientoAUtilizar =
        Rapidash.Movimientos.values()[ordinalMovimiento];
        
        //Instanciar el movimiento solicitado
        Movimiento instanciaMovimiento;        
        switch (movimientoAUtilizar) {
            case CONTONEO:
                instanciaMovimiento = new Contoneo();
                break;
            case BOTE:
                instanciaMovimiento = new Bote();
                break;
            case DOBLEFILO:
                instanciaMovimiento = new DobleFilo();
                break;

            //Otros movimientos aquí...                
            default:
                throw new AssertionError();
        }

        //Aplicar el movimiento.
        instanciaMovimiento.utilizar(this, oponente);
    }
}
