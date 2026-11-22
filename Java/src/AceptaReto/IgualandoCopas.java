/*
* IgualandoCopas.java Nov 22, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package AceptaReto;

import java.util.Scanner;

public class IgualandoCopas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLong()) {
        	int casos = sc.nextInt();
        	if(casos == 0) break;
        	long max = 0;
        	long total = 0;
            for (int i = 0; i < casos; i++) {
                long n = sc.nextLong();
                total += n;
                if(n > max) max = n;
            }
            System.out.println(max*casos - total);
        }
        
        
        sc.close();
    }
}
