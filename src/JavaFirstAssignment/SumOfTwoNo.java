//Write a Java program to print the sum of two numbers.
package JavaFirstAssignment;

import java.util.Scanner;

public class SumOfTwoNo 
{
	int a,b;
	int sum;
Scanner oo=new Scanner(System.in);
public void calculate()
{
    System.out.println("Enter val for A:");
	a=oo.nextInt();
	System.out.println("Enter val for B:");
	b=oo.nextInt();
	sum=a+b;
}
public void show()
{
	System.out.println("Value of  A is:"+a);
	System.out.println("Value of  B is:"+b);
	System.out.println("Sum is:"+sum);
}
	public static void main(String[] args) 
	{
	
		SumOfTwoNo oo=new SumOfTwoNo();
		oo.calculate();
		oo.show();
	}
	

}
