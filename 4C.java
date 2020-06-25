import java.util.*;

public class solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		for(int i=0;i<n;++i)
		{
			String input = scan.next();
			if(!hmap.containsKey(input))
			{
				hmap.put(input,0);
				System.out.println("OK");
			}
		
			else
			{	
				hmap.put(input,hmap.get(input)+1);
				System.out.println(input+hmap.get(input)+"");
			}
		}
	}
}
 
