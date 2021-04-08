//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
package JavaFirstAssignment;
import java.util.Scanner;
public class Average 
{
Scanner oo=new Scanner(System.in);
int a,b,c,avg;

void input()
{
	System.out.println("Enter 1st no:");
	a=oo.nextInt();
	System.out.println("Enter 2nd no:");
	b=oo.nextInt();
	System.out.println("Enter 3rd no:");
	c=oo.nextInt();
     avg=a*b*c/3;
	
}
void show()
{
	System.out.println("1st no is:"+a);
	System.out.println("2nd no is:"+b);
	System.out.println("3rd no is:"+c);
	System.out.println("Average is"+avg);
}


	public static void main(String[] args) 
	
	{
		Average oo=new Average ();
		oo.input();
		oo.show();

	}

}
