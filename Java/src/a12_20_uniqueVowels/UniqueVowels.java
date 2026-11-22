/*
* UniqueVowels.java Nov 18, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package a12_20_uniqueVowels;

import java.util.Scanner;

public class UniqueVowels {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter text:");
		String text = scanner.nextLine();

		String vowels = "AEIOUÀÈÒÙÁÉÍÓÚÄËÏÖÜÂÊÎÔÛ";

		String vowelsFound = "";
		
		if(text.isBlank()) {
			System.out.println("Text not entered");
		} else {
			// Cerca per text per trobar si text conté alguna lletra prohibida
			for (int i = 0; i < text.length(); i++) {
				char c = Character.toUpperCase(text.charAt(i));
				boolean isVowel = false;
	
				// Cerca per vowels per trobar si conté la vocal
				for (int j = 0; j < vowels.length(); j++) {
	
					// Si conté la vocal cal sortir del bucle perquè ja s'ha trobat i no cal seguir comprovant
					if (c == vowels.charAt(j)) {
						isVowel = true;
						break;
					}
				}
	
				// Si conté vocal
				if (isVowel) {
					boolean alreadyFound = false;
	
					// Cerca si està a vowelsFound per afegir-la si no hi és
					for (int k = 0; k < vowelsFound.length(); k++) {
	
						// Si la vocal està a vowelsFound, ja podem sortir del bucle
						if (vowelsFound.charAt(k) == c) {
							alreadyFound = true;
							break;
						}
					}
	
					// Si la vocal no està a vowelsFound, afegir-la
					if (!alreadyFound) {
						vowelsFound += c;
					}
				}
			}
	
			// Mostrar resultats
			System.out.println("Unique vowels found: " + vowelsFound);
		}
		scanner.close();
	}
}