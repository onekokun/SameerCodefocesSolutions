import java.util.*;
import java.lang.*;
 
public class solution
{
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int count=0;
		for(int i=0;i<str.length();++i)
		{
			char ch = str.charAt(i);
			if(ch=='H' || ch =='Q' || ch=='9')
				count++;
		}
		if(count>0)
			System.out.print("YES");
		else
			System.out.print("NO");
	
	}

}
