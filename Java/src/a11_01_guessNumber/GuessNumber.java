/*
* ForbiddenLetters3.java Nov 16, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package a11_01_guessNumber;

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final int SECRET = 7;
		int attempts;
		int num;

		do {
			System.out.println("Enter number of attempts (grater than 1):");
			attempts = scanner.nextInt();
		} while (attempts <= 1);

		System.out.println("Attempt 1: Enter your guess (1..10):");

		for (int i = 1; i <= attempts; i++) {
			num = scanner.nextInt();

			while (num < 1 || num > 10) {
				System.out.println("Attempt " + i + ": Enter your guess (1..10):");
				num = scanner.nextInt();
			}

			if (num == SECRET) {
				System.out.println("Correct! You guessed the number.");
				break;
			} else if (num < SECRET) {
				if (i == attempts) System.out.println("Too low. You lost! The secret number was " + SECRET + ".");
				else System.out.println("Too low. Attempt " + (i + 1) + ": Enter your guess (1..10):");
			} else {
				if (i == attempts) System.out.println("Too high. You lost! The secret number was " + SECRET + ".");
				else System.out.println("Too high. Attempt " + (i + 1) + ": Enter your guess (1..10):");
			}
		}

		scanner.close();
	}
}