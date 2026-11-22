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

public class CountVowels2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter text:");
		
		String vowels = "AÀÁÄÂEÈÉËÊIÍÌÏÎOÒÓÖÔUÙÚÜÛ";
		String text = scanner.nextLine();
		
		int vocals = 0;

		// Recórrer les vocals
		for (int i = 0; i < vowels.length(); i++) {
			char c = vowels.charAt(i);
			// Recórrer el text
			for (int j = 0; j < text.length(); j++) {
				// Comprova si el caràcter actual coincideix amb la vocal			
				if(c == Character.toUpperCase(text.charAt(j))) vocals++;
			}

		}
		// Mostra resultats		
		if (text.isBlank()) System.out.println("Text not entered");
		else System.out.println("Quantity of vowels: " + vocals);
		scanner.close(); 
	}
}