/*
* ReplaceSpaces.java Nov 9, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package a12_02_replaceSpaces;

import java.util.Scanner;

public class ReplaceSpaces {
	public static void main (String[] args) {
		Scanner n = new Scanner(System.in);

		System.out.println("Enter text:");
		String text = n.nextLine();

		if (text.equals("")) {
		    System.out.println("Text not entered");
		} else {
			String result = "";
			for (int i = 0; i < text.length(); i++) {
				if (text.charAt(i) == ' ') result += "_";
				else result += text.charAt(i);
			}
			System.out.println(result);
		}

		n.close();
	}
}
