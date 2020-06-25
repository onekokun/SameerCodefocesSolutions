import java.util.*;

public class solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		List<Character> list = new ArrayList<Character>();
		list.add('h');
		list.add('e');
		list.add('l');
		list.add('l');
		list.add('o');
		
		int count=0;
		for(int i=0;i<word.length();++i)
		{
			if(count==5)
				break;
			
			if(word.charAt(i)==list.get(0))
			{
				count++;
				list.remove(0);
			}
		}
	
		if(count==5)
			System.out.print("YES");
		else
			System.out.print("NO");
	}
}
