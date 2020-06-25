import java.util.*;
 
public class solution
{
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		HashSet<Integer> hset = new HashSet<Integer>();
		int count=0;
		
		for(int i=0;i<4;++i)
		{
			int inp = scan.nextInt();
			if(!hset.contains(inp))
				hset.add(inp);
			else
				count++;
		}

	System.out.print(count);
	}
	
}
