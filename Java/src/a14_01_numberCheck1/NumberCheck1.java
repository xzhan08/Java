/*
* NumberCheck1.java Nov 24, 2026
*
*
* ©Copyright 2026 xinyi zhan <2627_xinyi.zhan@iticbcn.cat>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package a14_01_numberCheck1;

public class NumberCheck1{

    public static int number = 12343;

    public static void main(String[] args) {
        printTitle();
        printNumber();
        checkEvenOdd();
        checkSign();
        checkDigits();
        checkPrime();
        printEndMessage();
    }

    public static void printTitle() {
        System.out.println("NUMBER ANALYSIS PROGRAM");
    }

    public static void printNumber() {
    	System.out.println("Number: " + number);
    }

    public static void checkEvenOdd() {
        if(number % 2 == 0) System.out.println("The number is even");
        else System.out.println("The number is odd");
    }

    public static void checkSign() {

    	String result = (number == 0) ? "The number is zero" : (number > 0 ? "The number is positive" : "The number is negative");

    	System.out.println(result);

    }

    public static void checkDigits() {
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
    
    public static void checkPrime() {
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

    public static void printEndMessage() {
    	System.out.println("END OF PROGRAM");
    }

}