/*
* TextWithMaxVowels.java Nov 13, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package a12_15_textWithMaxVowels;

import java.util.Scanner;

public class TextWithMaxVowels {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String vowels = "AÀÁÄÂEÈÉËÊIÍÌÏÎOÒÓÖÔUÙÚÜÛ";

		int max = 0;
		String mes = "";

		System.out.println("Enter text (enter to finish):");
		String text = scanner.nextLine();

		while (!text.isBlank()) {
			int vocals = 0;
			for (int i = 0; i < text.length(); i++) {
				char c = Character.toLowerCase(text.charAt(i));
				int j = 0;
				boolean found = false;
				while (j < vowels.length() && !found) {
					if (c == Character.toLowerCase(vowels.charAt(j))) {
						vocals++;
						found = true;
					}
					j++;
				}
			}
			if (vocals >= max) {
				if(vocals == max) {
					max = vocals;
					mes += ", " + text;
				} else { 
					max = vocals;
					mes = text;
				}
			}
			System.out.println("Enter text (enter to finish):");
			text = scanner.nextLine();
		}

		if (!mes.equalsIgnoreCase("")) {
			System.out.println("Quantity of vowels: " + max);
			System.out.println("Text: " + mes);
		} else System.out.println("Text not entered");
		scanner.close();
	}
}