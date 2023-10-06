
package mx.edu.itsur.pokebatalla.model;

/**
 *
 * @author FJML1983
 */
public class Bullbasaur extends Pokemon {

    public Bullbasaur() {
        tipo = "PLANTA/VENENO";
        hp = 45;
        ataque = 49;
        defensa = 49;
        nivel = 1;
        precision = 4;
    }

    //Constructor alterno 1
    public Bullbasaur(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
    
    
}
