import java.util.*;

public class solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if(n==1)
			System.out.print("3");
		
		if(n%2==1)
			System.out.print("1");
		else
		{
			int m =1;
			while(prime(n*m+1))
				m++;
			
			System.out.print(m);
		}
	}
	
	public static boolean prime(int x)
	{
		for(int i=2;i<x;++i)
			if(x%i==0)
				return false;
			
		return true;
	}
	
}
