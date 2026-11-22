/*
* Graphic8Rhombus.java Nov 18, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package a12_38_graphic8Rhombus;

import java.util.Scanner;

public class Graphic8Rhombus {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	
	    System.out.println("Enter number of lines:");
	    int line = scanner.nextInt();
	    
	    scanner.nextLine();
	    
	    System.out.println("Enter character:");
	    char c = scanner.nextLine().charAt(0);
	    
	    String llista = "";
	    
	    for(int i = 0; i < line; i++) {
	    	for (int j = 0; j < line - 1 - i; j++) {
	    		llista += " ";
	    	}
	    	for (int k = 0; k <= i; k++) {
	    		llista += c;
	    	}
	    	for (int k = 0; k < i; k++) {
	    		llista += c;
	    	}
	    	llista += "\n";
	    }
	    for(int i = 1; i < line; i++) {
	    	for (int j = 0; j < i; j++) {
	    		llista += " ";
	    	}
	    	for (int k = line - i; k > 0; k--) {
	    		llista += c;
	    	}
	    	for (int k = line - 1 - i; k > 0; k--) {
	    		llista += c;
	    	}
	    	llista += "\n";
	    }

        System.out.print(llista);

        scanner.close();
    }
}