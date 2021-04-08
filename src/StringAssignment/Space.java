package StringAssignment;
import java.io.*;
public class Space 
{
	public static void main(String[] args) 
	{
	 /*String str=new String("My name is Rajwinder");
	 
	 System.out.println(str.replaceAll("rrr", "pppp"));
	 System.out.print("String is->" );
	 str=str.replaceAll("dddd", "ssss");
	 System.out.println("The final String Is***"+str);*/
		String str="This is class time";
		System.out.println("string is"+str);
		str=str.replaceAll("\\s", "");
		System.out.println("After changes:"+str);
	}

}
