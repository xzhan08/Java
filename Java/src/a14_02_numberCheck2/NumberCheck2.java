/*
* NumberCheck2.java Nov 24, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package a14_02_numberCheck2;

import java.util.Scanner;

public class NumberCheck2{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();

        printMessage("NUMBER ANALYSIS PROGRAM");
        printNumber(number);
        checkEvenOdd(number);
        checkSign(number);
        checkDigits(number);
        checkPrime(number);
        printMessage("END OF PROGRAM");

        scanner.close();
    }

    public static void printMessage(String text) {
    	System.out.println(text);
    	
    }

    public static void printNumber(int number) {
    	System.out.println("Number: " + number);
    }

    public static void checkEvenOdd(int number) {
    	if(number % 2 == 0) System.out.println("The number is even");
        else System.out.println("The number is odd");
    }

    public static void checkSign(int number) {
    	String result = (number == 0) ? "The number is zero" : (number > 0 ? "The number is positive" : "The number is negative");

    	System.out.println(result);
    }

    public static void checkDigits(int number) {
        int count = 0;
        int n = number;
        
        do {
            n = n / 10;
            count++;
        } while (n != 0);

        if (count > 1) {
            System.out.println("The number has " + count + " digits");
        } else {
            System.out.println("The number has " + count + " digit");
        }
    }

    public static void checkPrime(int number) {
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

        if (prime) {
            System.out.println("The number is a Prime number");
        } else {
            System.out.println("The number is not a Prime number");
        }
    }

}