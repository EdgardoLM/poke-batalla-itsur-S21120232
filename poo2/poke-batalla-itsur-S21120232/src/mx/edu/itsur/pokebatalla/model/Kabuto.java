/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model;

/**
 *
 * @author Edgardo Lopez Mendez
 */
public class Kabuto extends Pokemon{
    
    public Kabuto() {
        tipo = "ROCA/AGUA";
        hp = 30;
        ataque = 80;
        defensa = 90;
        nivel = 1;
        precision = 3;
    }
    
     public Kabuto(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
     
     public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("ABZORBER")){
            
            System.out.println("Ataque realizado ABZORBER");
        }else if(habilidad.equals("CHUPAVIDAS")){
            
            System.out.println("Ataque realizado CHUPAVIDAS");            
        }
}
}
