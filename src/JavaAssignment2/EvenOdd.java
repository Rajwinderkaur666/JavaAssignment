package JavaAssignment2;

import java.util.Scanner;

public class EvenOdd 
{

	public static void main(String[] args) 
	{
		int num;
		System.out.println("Enter num:");
		Scanner oo=new Scanner(System.in);
		num=oo.nextInt();
		if(num%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}

	}

}
