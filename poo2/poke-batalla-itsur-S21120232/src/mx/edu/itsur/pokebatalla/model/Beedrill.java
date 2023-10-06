
package mx.edu.itsur.pokebatalla.model;

/**
 *
 * @author Edgardo Lopez Mendez
 */
public class Beedrill extends Pokemon{
    
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
     
     public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("ATAQUE FURIA")){
            
            System.out.println("Ataque realizado ATAQUE FURIA");
        }else if(habilidad.equals("PICADURA")){
            
            System.out.println("Ataque realizado PICADURA");            
        }
        
      
    }
     
}
