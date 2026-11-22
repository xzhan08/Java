/*
* Graphic7Pyramid.java Nov 18, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package a12_37_graphic7Pyramid;

import java.util.Scanner;

public class Graphic7Pyramid {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	
	    System.out.println("Enter number of lines:");
	    int line = scanner.nextInt();
	    
	    scanner.nextLine();
	    
	    System.out.println("Enter character:");
	    char c = scanner.nextLine().charAt(0);
	    
	    String llista = "";
	
        for (int i = 1; i <= line; i++) {
        	for (int k = line - i; k > 0; k--) {
        		llista += " ";
        	}
            for (int j = 0; j < i; j++) {
                llista += c;
            }
            for (int k = 1; k < i; k++) {
                llista += c;
            }
            llista += "\n";
        }
        for (int i = 1; i < line; i++) {
            for(int j = 0; j < i; j++) {
            	llista += " ";
            }
            for(int j = line; j > i; j--) {
            	llista += c;
            }
            for(int k = line - 1; k > i; k--) {
            	llista += c;
            }
            llista += "\n";
        }

        System.out.print(llista);

        scanner.close();
    }
}