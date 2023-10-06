
package mx.edu.itsur.pokebatalla.model;
/**
 *
 * @author Edgardo Lopez Mendez
 */

public class Rapidash extends Pokemon{
    
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
      
      public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("PLACAJE")){
            
            System.out.println("Ataque realizado PLACAJE");
        }else if(habilidad.equals("DOBLE GOLPE")){
            
            System.out.println("Ataque realizado DOBLE GOLPE");            
        }
     
}
}
