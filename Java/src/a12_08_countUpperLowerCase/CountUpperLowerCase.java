/*
* CountUpperLowerCase.java Nov 11, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package a12_08_countUpperLowerCase;

import java.util.Scanner;

public class CountUpperLowerCase {
	public static void main (String[] args) {
		Scanner n = new Scanner(System.in);

		System.out.println("Enter a text:");
		String text = n.nextLine();

		int majuscules = 0;
		int minuscules = 0;

		if (text.equals("")) {
			System.out.println("Text not entered");
		} else {
			for (int i = 0; i < text.length(); i++) {
				if (Character.isUpperCase(text.charAt(i))) majuscules++;
				else if (Character.isLowerCase(text.charAt(i))) minuscules++;
			}
			System.out.println("Uppercase = " + majuscules);
			System.out.println("Lowercase = " + minuscules);
		}
		n.close();
	}
}

