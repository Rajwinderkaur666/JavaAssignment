package JavaAssignment2;
import java.util.Scanner;
public class Divisible 
{
int no;
Scanner oo=new Scanner(System.in);
public void input()
{
	System.out.println("Enter Value To check No is Divisible by 5 and 11=");
	no=oo.nextInt();
	if(no%5==0)
	{
		System.out.println("5 Divisible by:");
	}
	 else if(no%11==0)
	{
		 System.out.println("11 Divisible by: ");
	}
	 else
	 {
		 System.out.println("Please enter valid number because 5 and 11 divisible with only 0 a");
	
}

}
	public static void main(String[] args) 
	{
		
		Divisible oo=new Divisible ();
		oo.input();
	}

}
