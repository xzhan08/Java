/*
* SplitLettersDigits.java Nov 10, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package a12_03_splitLettersDigits;
import java.util.Scanner;

public class SplitLettersDigits {
	public static void main (String[] args) {
		Scanner n = new Scanner(System.in);
		
		System.out.println("Enter text:");
		String text = n.nextLine();
		String letters = "";
		String digits = "";
		
		if (text.equals("")) {
			System.out.println("Text not entered");
		} else {
			for(int i = 0; i < text.length(); i++) {
				char c = text.charAt(i);
				if (Character.isLetter(c)) letters += c;
				else if (Character.isDigit(c)) digits += c;
			}
			System.out.println("Letters: " + letters);
			System.out.println("Digits: " + digits);
		}
		n.close();
	}
}