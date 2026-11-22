/*
* RemoveRepeatedLetters.java Nov 13, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package a12_07_removeRepeatedLetters;

import java.util.Scanner;

public class RemoveRepeatedLetters {
	public static void main (String[] args) {
		Scanner n = new Scanner(System.in);

		System.out.println("Enter a text:");
		String text = n.nextLine();

		if (text.equals("")) {
			System.out.println("Text not entered");
		} else {
			String llista = "" + text.charAt(0);
			for (int i = 1; i < text.length(); i++) {
				if(text.charAt(i) != text.charAt(i - 1)) {
					llista += text.charAt(i);
				}
			}
			System.out.println("Clean text: " + llista);

		}
		n.close();
	}
}
