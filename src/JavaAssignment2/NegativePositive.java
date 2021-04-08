package JavaAssignment2;
import java.util.Scanner;
public class NegativePositive 
{
static int no;
Scanner oo=new Scanner(System.in);
public void input()
{
	System.out.println("Enter Any Value:");	
	no=oo.nextInt();
}
public void show()
{
	System.out.println("Number is:"+no);

      if(no<0)
     {
	 System.out.println("Number is Negative");
     }
      else
       {
	 System.out.println("Number is not negative");
        }
}
	public static void main(String[] args) 
	{
		NegativePositive oo=new NegativePositive();
		oo.input();
		oo.show();
	
	}

}


