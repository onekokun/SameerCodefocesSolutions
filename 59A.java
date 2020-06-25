import java.util.*;
import java.lang.*;

public class solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);


		String a = scan.next();
		int len = a.length();

		int countl=0,countu=0;
		for(int i=0;i<len;++i)
		{
		if(Character.isLowerCase(a.charAt(i)))
			countl++;
		else
			countu++;
		}
		
		if(countu>len/2)
			System.out.print(a.toUpperCase());
		else if(countl>len/2)
			System.out.print(a.toLowerCase());
		else
			System.out.print(a.toLowerCase());
	}
}
