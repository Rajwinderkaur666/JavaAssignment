package StringAssignment;

public class SplitMethod 
{

	public static void main(String[] args) 
	{
		String str="#Hello#how#are#you?";
		String[] ar=str.split("#");
		/*for(int i=1;i<ar.length;i++)
		{
			System.out.println("a1[i]");
		}*/
        for(String a1:ar)
        {
        	System.out.println(a1);
        }
	}

}
