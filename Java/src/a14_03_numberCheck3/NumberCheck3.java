/*
* NumberCheck3.java Nov 24, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package a14_03_numberCheck3;

import java.util.Scanner;

public class NumberCheck3 {

	public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	
    	int number = askNumber("Enter number:");
    	
    	printMessage("NUMBER ANALYSIS PROGRAM");
    	
    	printNumber(number);
    	
        System.out.println("The number is " + checkEvenOdd(number));
        
        System.out.println("The number is " + checkSign(number));
        
        int count = checkDigits(number);
        if (count > 1) {
            System.out.println("The number has " + count + " digits");
        } else {
            System.out.println("The number has " + count + " digit");
        }
        boolean prime = checkPrime(number);
        if (prime) {
            System.out.println("The number is a Prime number");
        } else {
            System.out.println("The number is not a Prime number");
        }
        printMessage("END OF PROGRAM");
        
        scanner.close();
    }

    public static void printMessage(String text) {
    	System.out.println(text);
    }

    public static int askNumber(String text) {
		System.out.println(text);
		int number = scanner.nextInt();
		return number;
    }

    public static String printNumber(int number) {
    	String text = "Number: " + number;
    	System.out.println(text);
    	return text;
    }

    public static String checkEvenOdd(int number) {
    	if(number % 2 == 0) return "even";
        else return "odd";
    }

    public static String checkSign(int number) {
    	String result = (number == 0) ? "zero" : (number > 0 ? "positive" : "negative");
    	return result;
    }

    public static int checkDigits(int number) {
    	int n = Math.abs(number);
		int count = 0;    
        
        do {
            n = n / 10;
            count++;
        } while (n != 0);
        
        return count;
    }

    public static boolean checkPrime(int number) {
    	boolean prime = true;

        if (number <= 1) {
            prime = false;
        } else if (number == 2) {
            prime = true;
        } else if (number % 2 == 0) {
            prime = false;
        } else {
            for (int i = 3; i <= Math.sqrt(number); i += 2) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }

}