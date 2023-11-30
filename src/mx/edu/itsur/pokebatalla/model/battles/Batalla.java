package mx.edu.itsur.pokebatalla.model.battles;





import java.io.Serializable;
import mx.edu.itsur.pokebatalla.model.battles.Entrenador;
import mx.edu.itsur.pokebatalla.model.pokemons.Pokemon;
import mx.edu.itsur.pokebatalla.utils.FileManager;

/**
 *
 * @author Edgardo Lopez Mendez 
 */
public class Batalla implements Serializable {
     protected Entrenador entrenador1;
    protected Entrenador entrenador2;
    protected int turno = 1;
    protected boolean batallaFinalizada = false;

    public Batalla(Entrenador entrenador1, Entrenador entrenador2) {
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
    }

    public void desarrollarBatalla() {
        Entrenador entrenadorEnTurno = null;
        Entrenador entrenadorOponente = null;

        System.out.println("HELLO  POKEBATALLA!!\n");
        System.out.println("LOS CONTRINCANTES SON");
        System.out.println( entrenador1.nombre + " V.S " + entrenador2.nombre);
        System.out.println("-------------------------------------------");
        
        do {
            try {
                seleccionarPokemon(entrenador1);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("TUS POKEMONES DISPONIBLES SON ESTOS:" + entrenador1.getPokemonsCapturados().size()
                        + "ELIGE UNO");
                System.out.println("-------------------------------------------");
                entrenador1.setPokemonActual(null);
            }
        } while (entrenador1.getPokemonActual() == null);

        do {
            try {
                seleccionarPokemon(entrenador2);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("TUS POKEMONES DISPONIBLES SON ESTOS:  " + entrenador2.getPokemonsCapturados().size()
                        + "ELIGE UNO");
                System.out.println("-------------------------------------------\n");
                entrenador2.setPokemonActual(null);
            }
        } while (entrenador2.getPokemonActual() == null);

        while (!batallaFinalizada) {
            char auxLectura = '0';
            
            if (turno == 1) {
                entrenadorEnTurno = entrenador1;
                entrenadorOponente = entrenador2;
                turno = 2;
            } else if(turno == 2){
                entrenadorEnTurno = entrenador2;
                entrenadorOponente = entrenador1;
                turno =1 ;
            }
            
            do{
                System.out.println("-------------------------------------------");
                System.out.println("TURNO DE: " + entrenadorEnTurno.nombre);
                System.out.println(entrenadorOponente.getNombre());
                System.out.println(entrenadorOponente.getPokemonActual());
                System.out.println(entrenadorEnTurno.getNombre());
                System.out.println(entrenadorEnTurno.getPokemonActual());
                System.out.println("Elige un opcion:");
                System.out.println("1 = CONTINUAR BATALLA  O  2 = ELEGIR POKEMON ");
                
                try {
                    auxLectura = (char) System.in.read();
                    System.in.read(new byte[System.in.available()]);
                    
                    if (auxLectura != '1' && auxLectura != '2'){
                        System.out.println("ELIGE UNA OPCION VALIDA");
                    }
                    
                    if (auxLectura == '3' && auxLectura == '4'){
                        System.out.println("ELIGE UNA OPCION VALIDA");
                        auxLectura = 0;
                    }
                    
                    if (auxLectura == '2'){  
                        do {
                            try {
                                System.out.println("-------------------------------------");
                                seleccionarPokemon(entrenadorEnTurno);
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("TUS POKEMONES SON " + entrenador1.getPokemonsCapturados().size()
                                + " ELIGE A UN POKEMON! \n");
                            System.out.println("--------------------------------------");
                            entrenadorEnTurno.setPokemonActual(null);
                        }
                        } while (entrenadorEnTurno.getPokemonActual() == null);
                    }
                    char auLectura = '0';
                    if (auxLectura == '1'){
                        do{
                            
                            System.out.println("-------------------------------------------");
                            System.out.println("TURNO DE: " + entrenadorEnTurno.nombre );
                            System.out.println(entrenadorOponente.getNombre());
                            System.out.println(entrenadorOponente.getPokemonActual());
                            System.out.println(entrenadorEnTurno.getNombre());
                            System.out.println(entrenadorEnTurno.getPokemonActual());
                            System.out.println("ELIGE UN MOVIMIENTO");
                            for (Enum movimiento : entrenadorEnTurno.getPokemonActual().getMovimientos()) {
                                System.out.println(movimiento.ordinal() + 1 + " " + movimiento.name());
                            }
                            System.out.println("");
                            try {
                                auLectura = (char) System.in.read();
                                System.in.read(new byte[System.in.available()]);
                                if (auLectura < '1' || auLectura > '4') {
                                    throw new IndexOutOfBoundsException("\n        "
                                            + "ELIGE UNA TECLA DEL 1 AL 3.");
                                }
                                entrenadorEnTurno.instruirMovimientoAlPokemonActual(entrenadorOponente.
                                        getPokemonActual(), Character.getNumericValue(auLectura) - 1);

                            } catch (IndexOutOfBoundsException ex) {
                                System.out.println(ex.getMessage());
                                auLectura = '0';
                            }
                        }while(auLectura < '1' || auLectura > '4');
                    }  
                } catch(Exception ex) {
                    ex.printStackTrace();
                }

            } while (auxLectura != '1' && auxLectura != '2');

            if (entrenadorOponente.getPokemonActual().getHp() <= 0) {
            System.out.println("");
            System.out.println("-------------------------------------------");    
            System.out.println("El Pokemon del entrenador " + entrenadorOponente.getNombre() + " ah perdido!");
            System.out.println("FELICIDADES " + entrenadorEnTurno.getNombre() + ", haz ganado la batalla!");
            System.out.println("-------------------------------------------");
            System.out.println(entrenadorEnTurno.pokemonActual + "Haz ganado la batalla " + "/n" 
                    + "!!! FELICIDADES !!!");
            batallaFinalizada = true;

            
            }
        FileManager.guardarHaciaArchivo(this);
        }
    }
    
    private void seleccionarPokemon(Entrenador ent) {
        char auxLectura = '0';
        
        System.out.println("CUAL DE LOS POKEMONS DEBERIA UTILIZAR " + ent.nombre );

        int auxCount = 1;
        for (Pokemon p : ent.getPokemonsCapturados()) {
            System.out.println(p + "\n");
            auxCount++;
        }
        try {
            auxLectura = (char) System.in.read();
            System.in.read(new byte[System.in.available()]);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Pokemon pokemonSeleccionado = ent.getPokemonsCapturados()
                .get(Character.getNumericValue(auxLectura) - 1);

        ent.setPokemonActual(pokemonSeleccionado);
        System.out.println("TE ELIGO " + ent.pokemonActual.getNombre());
        System.out.println(ent.nombre + " MANDO A PELAR A " + ent.pokemonActual.getNombre());
        System.out.println("-------------------------------------------");
    }
}
