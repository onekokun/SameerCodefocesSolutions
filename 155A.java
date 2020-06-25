import java.util.*;

public class solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int count=0;
		int a = scan.nextInt();
		int max=a,min=a;
		for(int i=0;i<n-1;i++)
		{
			int b = scan.nextInt();
			if(max>b)
			{
				max=b;
				count++;
			}
			else if(min<b)
			{
				min=b;
				count++;
			}
		}
		System.out.print(count);
	}
}
