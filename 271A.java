import java.util.*;
import java.lang.*;

public class solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		n++;
		while(distinct(n))
			n++;
		
	System.out.print(n);
	}

public static boolean distinct(int yr)
{
	int len = (int) Math.log10(yr)+1;
	HashSet<Integer> hset = new HashSet<Integer>();
	while(yr>0)
	{
		hset.add(yr%10);
		yr/=10;
	}

	if(hset.size()==len)
		return false;
	else
		return true;
}
}
