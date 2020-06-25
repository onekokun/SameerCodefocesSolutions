import java.util.*;
import java.lang.*;

public class solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		HashSet<Integer> hset = new HashSet<Integer>();
		int p = scan.nextInt();
		for(int i=0;i<p;++i)
			hset.add(scan.nextInt());
		int q = scan.nextInt();
		for(int j=0;j<q;++j)
			hset.add(scan.nextInt());
		
		if(hset.size()==n)
			System.out.print("I become the guy.");
		else
			System.out.print("Oh, my keyboard!");
	}
}
