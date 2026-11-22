/*
* ForbiddenLetters1.java Nov 16, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package a12_17_forbiddenLetters1;

import java.util.Scanner;

public class ForbiddenLetters1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a text:");
		String text = scanner.nextLine();

		String letters = "çñwzqx";
		String message = "Text does not contain special letters";
		// Recorregut per text per comptar letters 
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
		    // Cerca per letters per trobar si és prohibida
			for (int j = 0; j < letters.length(); j++) {					
								
				if (Character.toLowerCase(c) == letters.charAt(j)) {	
					// Si és lletra prohibida cal sortir del bucle perquè ja s'ha trobat i no cal seguir comprovant		}	
					message = "Text contains special letters";
					break;
					
				}
			}
		}
		// Mostrar resultats		
		System.out.println(message);
		scanner.close();
	}
}
