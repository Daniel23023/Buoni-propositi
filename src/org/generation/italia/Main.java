package org.generation.italia;
import java.util.Scanner;


public class Main {


	    public static void main(String[] args) {
	        String[] propositi = {
	            "Fare più attività fisica",
	            "Esercitarsi sulla respirazione sott'acqua",
	            "Leggere un libro al mese",
	            "Imparare una nuova lingua",
	            "Migliorare le abilità culinarie"
	        };

	        Scanner scanner = new Scanner(System.in);
	        boolean[] conseguiti = new boolean[propositi.length];
	        int completati = 0;

	        while (completati < propositi.length) {
	            System.out.println("\nBuoni propositi per il futuro:");
	            for (int i = 0; i < propositi.length; i++) {
	                if (!conseguiti[i]) {
	                    System.out.println((i + 1) + ". " + propositi[i]);
	                }
	            }

	            System.out.print("\nIndica il numero del proposito che hai conseguito: ");
	            int scelta = scanner.nextInt();

	            if (scelta >= 1 && scelta <= propositi.length && !conseguiti[scelta - 1]) {
	                conseguiti[scelta - 1] = true;
	                completati++;
	                System.out.println("Hai conseguito: " + propositi[scelta - 1]);
	            } else {
	                System.out.println("Scelta non valida o proposito già conseguito. Riprova.");
	            }
	        }

	        System.out.println("\nComplimenti! Hai conseguito tutti i tuoi buoni propositi.");
	        scanner.close();
	    }
	}


