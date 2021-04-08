//Write a java program to find the no of days in a month.
package JavaAssignment2;

public class MonthDay 
{

	public static void main(String[] args) 
	{
		int march=31,sum = 0;
		for(int i=31;i>=march;i--)
		{
			sum=sum+i;
		}
		System.out.println("Your month is="+sum);
	}

}
