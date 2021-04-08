package StringAssignment;
import java.util.Scanner;
public class CountSpaces 
{
Scanner oo=new Scanner(System.in);
//int spasecount=0,res;
int word=1;
String str="my name is rajwinder";
public void Space()
{
	for(int i=0;i<str.length();i++) 
	{
		   if(str.charAt(i)==' ')
			word++;
	}
		System.out.println("count words...."+word);
		System.out.println("count spases...."+(word-1));
	}

	public static void main(String[] args) 
	{
		 CountSpaces oo=new  CountSpaces();
		 oo.Space();
		

	}

}
