/*
* StringText.java Nov 9, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package helloWorld;
public class StringText {
	public static void main (String[] args) {
		String text = "Hello, World";
		//String text2 = new String("Hello, World!!");
		int len = text.length();
		System.out.println("len:" + len);
		
		for(int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			System.out.println(i + ":" + c);
		}
		int count = 0;
		for(int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if(c == 'a') {
				count++;
			}
			if (Character.isUpperCase(c)); count++;
		}
		System.out.println("count:" + count);
	}
}
