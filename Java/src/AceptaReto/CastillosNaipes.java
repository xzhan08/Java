/*
* CastillosNaipes.java Nov 22, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package AceptaReto;

import java.util.Scanner;

public class CastillosNaipes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {
            long n = sc.nextLong();
            System.out.print(n * (3 * n + 1) / 2 + "\n");
        }

        
        sc.close();
    }
}