/*
* EscudoRomanos.java Nov 22, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package AceptaReto;

import java.util.Scanner;

public class EscudoRomanos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLong()) {
        	long legionarios  = sc.nextLong();
        	
        	if (legionarios == 0) break;
        	
        	long total = 0;
        	while(legionarios > 0) {
        		long a = (long) Math.sqrt(legionarios);
        		total += a*(4+a);
        		legionarios -= a*a;
        	}
        	System.out.println(total);
        }

        sc.close();
    }
}
