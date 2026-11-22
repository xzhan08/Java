/*
* TirandoBolos.java Nov 21, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package AceptaReto;

import java.util.Scanner;

public class TirandoBolos {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLong()) {
            long f = sc.nextLong();
            long b = sc.nextLong();
            
            if (f == 0) {
                break;
            }
            
            long totalBolos = f * (f + 1) / 2;
            long filasTumbadas = f - b + 1;
            long bolosTumbados = filasTumbadas * (filasTumbadas + 1) / 2;
            
            System.out.println(totalBolos - bolosTumbados);
        }
        sc.close();
    }
}
