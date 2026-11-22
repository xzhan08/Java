/*
* MostFrequentChar.java Nov 13, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package a12_12_mostFrequentChar;

import java.util.Scanner;

public class MostFrequentChar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter text:");
		String text = scanner.nextLine();
		
		int max = 0;
		char caracter = ' ';
		
		// Recórrer cada caràcter del text
		for (int i = 0; i < text.length(); i++) {
			int count = 0;
			char c = Character.toLowerCase(text.charAt(i));
			// Recórrer un altre cop cada caràcter del text
			for (int j = 0; j < text.length(); j++) {
				// Comptem quantes vegades apareix aquest caràcter			
				if (c == Character.toLowerCase(text.charAt(j))) count++;
			}

			// Actualitzem el màxim si cal
			if (count > max) {
				max = count;
				caracter = c;
			}
		}

		// Mostrem resultats
		if (max > 1) System.out.println("Most freqüent character: '" + caracter + "' appears " + max +" times");
		else System.out.println("Most freqüent character: '" + caracter + "' appears " + max +" time");
		scanner.close();
	}
}