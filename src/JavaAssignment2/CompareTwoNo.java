package JavaAssignment2;

import java.util.Scanner;

public class CompareTwoNo 
{
int a,b;
Scanner oo=new Scanner(System.in);
public void input()
{
	System.out.println("Enter Value for A=");
	a=oo.nextInt();
	System.out.println("Enter Value for B=");
	b=oo.nextInt();


      if(a>b)
      {
    	  System.out.println("A is greaterthan B");
      }
      else
      {
    	  System.out.println("B is greaterthan A");
    	  
      }
}
	public static void main(String[] args) 
	{
		CompareTwoNo oo=new CompareTwoNo ();
		oo.input();
	

	}
}
