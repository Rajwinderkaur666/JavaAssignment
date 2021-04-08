package StringAssignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateSpaces 
{
	
	 public static void main(String[] args) 
	{
		//String programming;
		String str1 = "programming";
		StringBuilder str=new StringBuilder();
		Set<Character> set=new LinkedHashSet();
		for(int i=0;i<str1.length();i++)
		{
			set.add(str1.charAt(i));
		}
		for(Character c:set)
		{
			str.append(c);
		}
          System.out.println(str);
	}

}
