/*
* Test1.java Nov 16, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package a12_17_forbiddenLetters1;

public class Test1 {
	public static void main(String[] args) {
		for(int i = 1; i <= 100; i+=5) {
			int last = i %10;
			//if(j% 2 == 0) continue; "tornar a for i incrementa i, ..."
			if (last == 0) {
				System.out.print(i * 2 + " ");
				if (i == 100) break;
			}
			else System.out.print(i / 2 + " ");
		}
	}
}
