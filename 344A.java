import java.util.*;

public class solution
{
 public static void main(String[] args)
 {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int[] arr = new int[2*n];
	int index=0;
	
	for(int i=0;i<n;++i)
		
	{
		int a = scan.nextInt();
		
		if(a==10)
		{
			arr[index] =1;
			index++;
			arr[index]=0;
			index++;
		}

		else
		{
			arr[index] =0;
			index++;
			arr[index]=1;
			index++;
		}
		
	}
	
	int count=0;
	for(int k=0;k<2*n-1;++k)
		if(arr[k]==arr[k+1])
			count++;
		
	System.out.println(count+1);
 }

}
