/*
* LongestText.java Nov 13, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package a12_09_longestText;

import java.util.Scanner;

public class LongestText {
	public static void main (String[] args) {
		Scanner n = new Scanner(System.in);

		System.out.println("Enter a text (END to finish):");
		String text = n.nextLine();
		String longest = "";
		int entered = 0;

		while (!text.equalsIgnoreCase("end")) {
			entered = 1;
			if (text.length() > longest.length()) longest = text;
			System.out.println("Enter a text (END to finish):");
			text = n.nextLine();
		}

		if (entered == 0) {
			System.out.println("Text not entered");
		} else {
			System.out.println("Longest text length: " + longest.length());
			System.out.println("Text: " + longest);
		}
		n.close();
	}
}