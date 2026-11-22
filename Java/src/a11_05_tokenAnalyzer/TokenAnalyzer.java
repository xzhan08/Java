/*
* TokenAnalyzer.java Nov 17, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package a11_05_tokenAnalyzer;

import java.util.Scanner;

public class TokenAnalyzer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int suspiciousToken = 0;
		int smallTokens = 0;
		int bigTokens = 0;
		int rejectedTokens = 0;

		String smallList = "";
		String bigList = "";
		String rejectedList = "";

		while (true) {
			System.out.println("Enter Token ID:");
			int token = scanner.nextInt();

			if (token >= 64500 && token <= 66700) {
				suspiciousToken = token;
				break;
			}

			if (token <= 1000) {
				if (rejectedTokens > 0) rejectedList += ", ";
				rejectedList += token;
				rejectedTokens++;
				continue;
			}

			if (token < 100000) {
				if (smallTokens > 0) smallList += ", ";
				smallList += token;
				smallTokens++;
				continue;
			}

			if (bigTokens > 0) bigList += ", ";
			bigList += token;
			bigTokens++;
		}

		String smallOut = smallTokens > 0 ? " (" + smallList + ")" : "";
		String bigOut = bigTokens > 0 ? " (" + bigList + ")" : "";
		String rejectedOut = rejectedTokens > 0 ? " (" + rejectedList + ")" : "";

		System.out.println();
		System.out.println("Analysis statistics:");
		System.out.println("AI ALERT! Suspicious token detected: " + suspiciousToken);
		System.out.println("Tokens smaller than 100000: " + smallTokens + smallOut);
		System.out.println("Tokens bigger or equal than 100000: " + bigTokens + bigOut);
		System.out.println("Rejected tokens: " + rejectedTokens + rejectedOut);

		scanner.close();
	}
}