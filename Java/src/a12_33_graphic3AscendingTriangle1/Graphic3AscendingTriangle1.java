/*
* Graphic3AscendingTriangle1.java Nov 17, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
/*
 * Graphic3AscendingTriangle1.java Nov 17, 2026
 *
 *
 * ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://gnu.org for more information.
 */

package a12_33_graphic3AscendingTriangle1;

import java.util.Scanner;

public class Graphic3AscendingTriangle1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of lines:");
        int line = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter character:");
        char c = scanner.nextLine().charAt(0);

        String llista = "";

        for (int i = 1; i <= line; i++) {
            for (int j = 0; j < i; j++) {
                llista += c;
            }
            llista += "\n";
        }

        System.out.print(llista);

        scanner.close();
    }
}
