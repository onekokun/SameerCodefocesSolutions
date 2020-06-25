import java.util.*;
import java.lang.*;

public class solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String frmtn = scan.next();
		HashSet<Integer> hset = new HashSet<Integer>();
		int count=0;
		int len = frmtn.length();
		char[] arr = new char[len];
		
		for(int i=0;i<len;++i)
			arr[i]=frmtn.charAt(i);		
		
		for(int j=0;j<len-1;++j)
		{	
			
			if(arr[j]==arr[j+1])
				{
					count++;
					hset.add(count);
				}
			else
				count=0;	
		}
		int max = -1;
	for(int x:hset)
	if(x>max)
		max=x;
	
	if(max+1<7)
	System.out.print("NO");
	else
		System.out.print("YES");
	}
}
