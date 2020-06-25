import java.util.*;
 
public class solution
{
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		HashSet<Integer> hset = new HashSet<Integer>();
		int[] arr = new int[m];
		
		for(int i=0;i<m;++i)
			arr[i] = scan.nextInt();
		
		Arrays.sort(arr);
		
		for(int j=0;j<m-n+1;++j)
			hset.add(arr[j+n-1]-arr[j]);
		
		int min=1001;
		for(int x:hset)
			if(x<min)
				min=x;
			
		System.out.print(min);
	}
	
}
