/*
* ReverseString.java Nov 10, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package a12_05_reverseString;

import java.util.Scanner;

public class ReverseString {
	public static void main (String[] args) {
		Scanner n = new Scanner(System.in);

		System.out.println("Enter a text:");
		String text = n.nextLine();

		if (text.equals("")) {
		    System.out.println("Text not entered");
		} else {
			String result = "";
			for(int i = text.length() - 1; i >= 0; i--) {
				result += text.charAt(i);
			}
			System.out.println(result);
		}

		n.close();
	}
}
