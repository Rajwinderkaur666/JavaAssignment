//Write a Java program to divide two numbers and print on the screen.
package JavaFirstAssignment;

import java.util.Scanner;

public class Divide 
{
int a,b;
int res;
	Scanner oo=new Scanner(System.in);
	void get()
	{
		 System.out.println("Enter Val for A:");
		 a=oo.nextInt();
		 System.out.println("Enter val for B:");
	     b=oo.nextInt();
	     System.out.println("Result is:");
	     res=a/b;
	     }
	void show()
	{
		 System.out.println("Enter Val for A:"+a);
		 System.out.println("Enter val for B:"+b);
		 System.out.println("Result is:"+res);
	     
	     
	     
	     }
	
	 
	public static void main(String[] args) 
	{
		 Divide oo=new  Divide ();
     oo.get();
     oo.show();

	}

}
