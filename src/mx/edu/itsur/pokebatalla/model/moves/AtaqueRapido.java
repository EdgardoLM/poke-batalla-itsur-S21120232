package mx.edu.itsur.pokebatalla.model.moves;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import mx.edu.itsur.pokebatalla.model.moves.MovimientoFisico;

/**
 *
 * @author FJML1983
 */
public class AtaqueRapido extends MovimientoFisico{

    public AtaqueRapido() {
        this.tipo=TiposDeMovimiento.NORMAL;
        this.potencia = 40;
        this.precision = 100;
        this.puntosPoder = 30;
    }
    
}
