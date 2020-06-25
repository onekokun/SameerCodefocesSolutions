import java.util.*;

public class solution
{
 public static void main(String[] args)
 {
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	int[] arr = new int[n-1];
	int index=0,sum=0;
	for(int i=0;i<n-1;++i)
	{
		int a = scan.nextInt();
		int b = scan.nextInt();
		sum = sum-a+b;
		arr[index]=sum;
		index++;
		
	}
	
	int max=-1;
	for(int x:arr)
		if(x>max)
			max=x;
		
	System.out.println(max);
 }

}
