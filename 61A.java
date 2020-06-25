import java.util.*;
import java.lang.*;

public class solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String n1 = scan.next();
		String n2 = scan.next();
		
		int len = n1.length();
		
		for(int i=0;i<len;++i)
		{
			if(n1.charAt(i)==n2.charAt(i))
				System.out.print(0);
			else
				System.out.print(1);
		}
		
	}
}
