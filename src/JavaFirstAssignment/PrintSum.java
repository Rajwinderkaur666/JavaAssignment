//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
package JavaFirstAssignment;

import java.util.Scanner;

public class PrintSum 
{

public static void main(String[] args) 
{
	Scanner in = new Scanner(System.in);
	System.out.print("Enter 1st number: ");
	  int num1 = in.nextInt();
    System.out.print("Enter 2nd number: ");
	  int num2 = in.nextInt();
	System.out.println("Addition of two numbers: " + num1 + " + " + num2 + " = " +(num1 + num2));
	System.out.println("subtraction of two numbers: " +num1 + " - " + num2 + " = " +(num1 - num2));
	System.out.println("Multiplication of two numbers: "+ num1 + " x " + num2 + " = "+(num1 * num2));
	System.out.println("Division of two numbers: " + num1 + " / " + num2 + " = "+(num1 / num2));
	System.out.println("Remainder of two numbers: "+ num1 + " mod " + num2 + " = "+(num1 % num2));
	}

}
