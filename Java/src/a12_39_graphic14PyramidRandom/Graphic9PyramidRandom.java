/*
* Graphic9PyramidRandom.java Nov 18, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package a12_39_graphic14PyramidRandom;

import java.util.Random;
import java.util.Scanner;

public class Graphic9PyramidRandom {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
	
		String letters = "+~ox*O";
		String star = "\u2606";
	
		System.out.println("Enter number of lines:");
		int line = scanner.nextInt();
	
		String llista = "";
	
		for (int j = 0; j < line - 1; j++) {
			llista += " ";
		}
		llista += star + "\n";
	
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line - i - 1; j++) {
				llista += " ";
			}
			for (int k = 0; k <= i; k++) {
				llista += letters.charAt(random.nextInt(letters.length()));
			}
			for (int k = 0; k < i; k++) {
				llista += letters.charAt(random.nextInt(letters.length()));
			}
			llista += "\n";
		}
	
		System.out.print(llista);
	
		scanner.close();
	}
}