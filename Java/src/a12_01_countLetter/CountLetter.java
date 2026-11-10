/*
* CountLetter.java Nov 9, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package a12_01_countLetter;
import java.util.Scanner;

public class CountLetter {
	public static void main (String[] args) {
		Scanner n = new Scanner(System.in);

		System.out.println("Enter text:");
		String text = n.nextLine();

		if (text.equals("")) {
		    System.out.println("Text not entered");
		} else {
			System.out.println("Enter letter:");
			char letter = n.nextLine().charAt(0);

			int count = 0;
			for (int i = 0; i < text.length(); i++) {
				if (Character.toLowerCase(text.charAt(i)) == Character.toLowerCase(letter)) count++;
			}
			System.out.println("Occurrences: " + count);
		}

		n.close();
	}
}