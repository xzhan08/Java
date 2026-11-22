/*
* GuessPassword.java Nov 17, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package a11_04_guessPassword;

import java.util.Scanner;

public class GuessPassword {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Login as:");
		String user = scanner.nextLine();
		
		int attempts = 0;
		
		if(user.equals("admin") || user.equals("root")) {
			while (true) {
				System.out.println(user + "@211.174.173.184's password:");
				String pass = scanner.nextLine();
				attempts++;
				if(((pass.equals("Fr34k!29$") && user.equals("admin")) || (pass.equals("kL?Je45op") && user.equals("root")))) break;
			}
			System.out.println("Welcome to Ubuntu 24.04.3 LTS. You have used " + attempts + " attempts.");
		}
		else System.out.println("This user does not exist!");
		scanner.close();
	}
}
