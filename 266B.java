import java.util.*;

public class solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int t = scan.nextInt();
		
		String word = scan.next();
		
		char[] charArr = word.toCharArray();
		for(int i=0;i<t;++i)
		{
			for(int j=0;j<n-1;++j)
			{
				if(charArr[j]=='B' && charArr[j+1]=='G')
				{	charArr[j]='G';
					charArr[j+1]='B';
					j++;
				}
			}
		}
	
	word = String.valueOf(charArr);
	System.out.print(word);
	}
}
