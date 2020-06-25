import java.util.*;
import java.lang.*;

public class solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
			
		int[] arr = new int[n];
		for(int i=0;i<n;++i)
			arr[i]=scan.nextInt();
		
		int num=1;
		for(int j=0;j<n;++j)
		{	
			for(int k=0;k<n;k++)
			{
				if(num==arr[k])
					System.out.print(k+1+" ");
			}
			num++;
		}
	}
}
