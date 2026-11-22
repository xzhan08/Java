/*
* CountVowels.java Nov 13, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package a12_11_countVowels;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter text:");
		
		String vowels = "AÀÁÄÂEÈÉËÊIÍÌÏÎOÒÓÖÔUÙÚÜÛ";
		String text = scanner.nextLine();
		
		int vocals = 0;

		// Recórrer les vocals
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			// Recórrer el text
			int j = 0;
			boolean found = false;
			while(j < vowels.length() || !found) {
				// Comprova si el caràcter actual coincideix amb la vocal			
				if(c == Character.toUpperCase(vowels.charAt(j))) {
					vocals++;
					found = true;
				}
				j++;
			}

		}
		// Mostra resultats		
		if (text.isBlank()) System.out.println("Text not entered");
		else System.out.println("Quantity of vowels: " + vocals);
		System.out.println("Text:: " + vocals);
		scanner.close(); 
	}
}