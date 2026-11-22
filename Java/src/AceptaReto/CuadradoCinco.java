/*
* CuadradoCinco.java Nov 22, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package AceptaReto;

import java.util.Scanner;

public class CuadradoCinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {
            long n = sc.nextLong();
            if(n/10==0 && n != 0) System.out.println("25");
            else System.out.println(n/10 * (n/10 + 1) + "25");
        }
        	
        
        sc.close();
    }
}


