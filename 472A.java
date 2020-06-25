import java.util.*;

public class solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=2;i<n;++i)
			if(prime(i)==0 && prime(n-i)==0)
			{System.out.println(i+" "+(n-i));
			break;
			}
			
	}

	public static int prime(int x)
	{
		for(int i=2;i<x;++i)
			if(x%i==0)
				return 0;
			
		return 1;
	}
}
