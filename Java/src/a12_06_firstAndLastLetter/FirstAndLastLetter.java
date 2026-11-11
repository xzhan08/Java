/*
* ReverseString.java Nov 10, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package a12_06_firstAndLastLetter;

import java.util.Scanner;

public class FirstAndLastLetter {
	public static void main (String[] args) {
		Scanner n = new Scanner(System.in);

		System.out.println("Enter word:");
		String text = n.nextLine();

		String llista = "";
		int count = 0;
		int entered = 0;

		while (!text.equalsIgnoreCase("END")) {
			entered++;
			if (text.length() >= 2) {
				char first = Character.toLowerCase(text.charAt(0));
				char last = Character.toLowerCase(text.charAt(text.length() - 1));
				if (first == last && Character.isLetter(first)) {
					llista += text + "\n";
					count++;
				}
			}
			System.out.println("Enter word:");
			text = n.nextLine();
		}

		if (entered == 0) {
			System.out.println("No words entered");
		} else {
			System.out.println("Total words: " + count);
			System.out.print(llista);
		}

		n.close();
	}
}