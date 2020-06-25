import java.util.*;
 
public class solution
{
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		String s= scan.nextLine();
		HashSet<Character> hset = new HashSet<Character>();
		for(int i=0;i<s.length();++i)
		{	char ch = s.charAt(i);
			if(ch!= '{' && ch!=' ' &&ch!=',' && ch!='}')
				hset.add(ch);
		}
		System.out.print(hset.size());
	}
	
}
