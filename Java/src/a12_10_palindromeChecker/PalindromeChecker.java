/*
* PalindromeChecker.java Nov 10, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package a12_10_palindromeChecker;

import java.util.Scanner;

public class PalindromeChecker {
	public static void main (String[] args) {
		Scanner n = new Scanner(System.in);

		System.out.println("Enter word:");
		String text = n.nextLine();

		String reves = "";
		String missatge = "false";

		if (text.equals("")) {
			System.out.println("Word not entered");
		} else {
			for(int i = text.length() - 1; i >= 0; i--) {
				reves += text.charAt(i);
			}
			if(reves.equalsIgnoreCase(text)) {
				missatge = "true";
			}
			System.out.println("Palindrome: " + missatge);
		}
		n.close();
	}
}
