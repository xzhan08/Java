/*
* ForbiddenLetters3.java Nov 16, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package a12_19_forbiddenLetters3;

import java.util.Scanner;

public class ForbiddenLetters3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a text:");
		String text = scanner.nextLine();

		String letters = "çñwzqx";
		String message = "Text does not contain special letters";

		String forbidden = "";

		// Recorregut per text per comptar letters 
		for (int i = 0; i < text.length(); i++) {
			char c = Character.toLowerCase(text.charAt(i));
			boolean isForbidden = false;

			// Cerca per letters per trobar si és prohibida
			for (int j = 0; j < letters.length(); j++) {
				if (c == letters.charAt(j)) {
					// Si és lletra prohibida cal sortir del bucle perquè ja s'ha trobat i no cal seguir comprovant
					isForbidden = true;
					break;
				}
			}

			// Si és lletra prohibida
			if (isForbidden) {
				message = "Text contains special letters";

				//Cerca si està a results per afegir-la si no hi és
				boolean found = false;
				for (int k = 0; k < forbidden.length(); k++) {
					if (c == forbidden.charAt(k)) {
						found = true;
						break;
					}
				}
				if (!found) {
					forbidden += c;
				}
			}
		}

		// Mostrar resultats
		System.out.println(message);
		if (message.equals("Text contains special letters")) {
			System.out.println("Forbidden letters: " + forbidden);
		}

		scanner.close();
	}
}