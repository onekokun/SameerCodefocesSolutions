import java.util.*;
import java.lang.*;

public class solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String outcome = scan.next();
		int a=0,d=0;
		for(int i=0;i<n;++i)
		{
			if(outcome.charAt(i)=='A')
				a++;
			else
				d++;
		}
		
		if(a>n/2)
			System.out.print("Anton");
		else if(d>n/2)
			System.out.print("Danik");
		else
			System.out.print("Friendship");
	
	}
}
