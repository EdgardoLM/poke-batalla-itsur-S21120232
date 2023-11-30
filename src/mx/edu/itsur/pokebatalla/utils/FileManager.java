/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.utils;

import java.io.*;
import mx.edu.itsur.pokebatalla.model.battles.Batalla;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Edgardo Lopez Mendez
 */


    public class FileManager {

    public static final String FILE_NAME = "pokeBatalla.txt";
    
    public static void guardarHaciaArchivo(Batalla batalla){
        try{
            FileOutputStream flujoSalida = new FileOutputStream(FILE_NAME);
            ObjectOutputStream escritorDeObjetos = new ObjectOutputStream(flujoSalida);
            escritorDeObjetos.writeObject(batalla);
        } catch (FileNotFoundException ex){
            System.out.println("No se creo el archivo");
        } catch (IOException ex){
            System.out.println("Error al escribir el objeto en el archivo");
        }
    }
    
    public static Batalla leerDesdeArchivo(){
        try{
            FileInputStream flujoEntrada = new FileInputStream(FILE_NAME);
            ObjectInputStream lectorDeObjetos = new ObjectInputStream(flujoEntrada);
            
            return (Batalla) lectorDeObjetos.readObject();
        } catch (FileNotFoundException ex){
            System.out.println("No hay batalla guardada");
        }
        catch (IOException ex){
            System.out.println("Error al escribir el objeto en el archivo");
        } catch (ClassNotFoundException ex){
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}