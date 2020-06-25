import java.util.*;
 
public class solution
{
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		HashSet<Integer> hset = new HashSet<Integer>();
		if(n==1)
			System.out.print(1);
		else
		{
		int[] arr = new int[n];
		for(int i=0;i<n;++i)
			arr[i] = scan.nextInt();
		
		int count=0;
		for(int j=0;j<n-1;++j)
		{
			if(arr[j]<=arr[j+1])
			{
				count++;
				hset.add(count+1);
			}
			
			else
				count=0;
		}
			
		int max = 1;
		for(int x:hset)
			if(x>max)
				max=x;
			
		System.out.print(max);
		}
	}
	
}
