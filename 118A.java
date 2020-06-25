import java.util.*;
import java.lang.*;

public class solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		word = word.toLowerCase();
		for(int i=0;i<word.length();++i)
		{
			char character = word.charAt(i);
			if(character!='a' && character!='e' && character!='i' && character!='o' && character!='u' && character!='y')
				System.out.print("."+character);
		}
		
	}
}
