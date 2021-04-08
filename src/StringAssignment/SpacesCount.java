package StringAssignment;

import java.util.Scanner;

public class SpacesCount 
{
Scanner oo=new Scanner(System.in);
int count=0;
String str="My Name Is Raj";
public void Method()
{
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)!=' ')
			count++;
	}
	System.out.println("Total no of Spaces="+count);
	
}
	public static void main(String[] args) 
	{
		SpacesCount oo=new SpacesCount ();
		oo.Method();

	}

}
