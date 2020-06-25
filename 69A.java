import java.util.*;
import java.lang.*;
 
public class solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int sum1=0,sum2=0,sum3=0;
		int n = scan.nextInt();
		for(int i=0;i<n;++i)
		{
			sum1+=scan.nextInt();
			sum2+=scan.nextInt();
			sum3+=scan.nextInt();
		}
	
	if(sum1==0 && sum2==0 && sum3==0)
		System.out.print("YES");
	else
		System.out.print("NO");
	
	}
}
