import java.util.*;

public class solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		HashSet<Character> hset = new HashSet<Character>();
		int n = scan.nextInt();
		String str = scan.next().toLowerCase();
	
		for(int i=0;i<n;++i)
			hset.add(str.charAt(i));
		
		if(hset.size()==26)
			System.out.print("YES");
		else
			System.out.print("NO");
	}
	
}
 
