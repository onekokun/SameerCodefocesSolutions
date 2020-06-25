import java.util.*;
import java.lang.*;

public class solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);


		String a = scan.next();
		String b = scan.next();
		
		if(a.length()!=b.length())
			System.out.print("NO");
		else
		{
			int count=0;
			for(int i=0;i<a.length();++i)
			{
				if(a.charAt(i)!=b.charAt(b.length()-1-i))
					count++;
				
			}
			if(count>0)
				System.out.print("NO");
			else
				System.out.print("YES");
			}
		
	}
}
