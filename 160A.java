import java.util.*;
import java.lang.*;
 
public class solution
{
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int[] arr = new int[n];
		int sum=0;
		
		for(int i=0;i<n;++i)
		{
			int a = scan.nextInt();
			sum+=a;
			arr[i] = a;
		}
		
		Arrays.sort(arr);
		
		int newsum=0,j=n-1,count=0;
		while(2*newsum<=sum)
		{
			newsum+=arr[j];
			j--;
			count++;
		}
	
		System.out.print(count);
	}

}
