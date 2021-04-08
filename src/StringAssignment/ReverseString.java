package StringAssignment;

import java.util.Scanner;

public class ReverseString 
{
Scanner oo=new Scanner(System.in);
String str="She is a Girl";
char[] ar=str.toCharArray();
public void string()
{
	for(int i=ar.length-1;i>=0;i--)
	{
		System.out.print(ar[i]);
	}
}
	public static void main(String[] args) 
	{
		ReverseString oo=new ReverseString();
		oo.string();

	}

}
