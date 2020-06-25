import java.util.*;

public class solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int index=0;
		int[] arr = new int[n];
		for(int i=0;i<n;++i)
			{
				arr[index] = scan.nextInt();
				index++;
			}
	
		int max=-1;
		for(int x:arr)
			if(x>max)
				max=x;
		
		int sum=0;
		for(int y:arr)
			sum+=(max-y);
		
		System.out.println(sum);
	}
}
