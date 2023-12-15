// Este código cuenta con las funciones para desempeñar el juego de "Piedra, Papel y Tijeras", el cuál solamente puede llevarse a cabo con 2 jugadores y las reglas son:
// 1. Piedra le gana a tijeras, 2. Tijeras le gana a papel, 3. Papel le gana a piedra, 4. Si ambos jugadores eligen el mismo elemento se da un empate.
// Dentro del codigo se encuentra la funcion "if" con la que se definió el proceso que debe de seguir el código en cada uno de los casos. 

package org.generation;

import java.util.Scanner;

public class RevisionCodigoDeOtros {
	
	public static void main(String[] args) {

	    Scanner s = new Scanner(System.in); // Se agrega "System.in" para crear el objeto s
	    
	    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    
	    System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); // Se corrige "Turno del jugador 2"
	    Scanner s2 = new Scanner(System.in); // Se agrega "System.in" para crear el objeto s2
	    String j2 = s2.nextLine(); // Se corrige "s" por "s2"
	    
	    
	    if (j1.equals(j2)) {  // Se corrige para usar equals en lugar de ==
	      System.out.println("Empate");
	    } else {
	      int g = 2; // Indica empate por defecto
	      switch(j1) {
	        case "piedra":
	          if (j2.equals("tijeras")) { // se modifica == por equals
	            g = 1;
	          }
	          break; // Se agrega break
	        case "papel":
	          if (j2.equals("piedra")) { // se modifica == por equals
	            g = 1;
	          } // se agrega }
	          break; // Se agrega break
	        case "tijeras": // se corrige nombre de la opcion
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	        default:
	        	System.out.println("Ingrese una opcion valida"); // Se agrega mensaje default
	      }
	      System.out.println("Gana el jugador " + g);
	    }
	}
}


