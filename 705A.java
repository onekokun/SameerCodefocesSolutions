import java.util.*;
import java.lang.*;

public class solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=0;i<n-1;++i)
		{
			if(i%2==0)
				System.out.print("I hate that ");
			else
				System.out.print("I love that ");
		}
		
		if(n%2==1)
			System.out.print("I hate it");
		else
			System.out.print("I love it");
	}
}
