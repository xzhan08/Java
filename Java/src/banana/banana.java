/*
* banana.java Nov 13, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package banana;

import java.util.Scanner;

public class banana {
	public static void main (String[] args) {
		Scanner n = new Scanner(System.in);
	
		String banana = "banana";
		
		for (int i = 0; i < banana.length(); i++) {
			char c = banana.charAt(i);
			int count = 0;
			for (int j = 0; j < banana.length(); j++) {
				if(c == banana.charAt(j)) count++;
			}
			System.out.println(c + " appear " + count + " times");
		}
		n.close();
	}
}