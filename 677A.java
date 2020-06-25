import java.util.*;
import java.lang.*;

public class solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int h = scan.nextInt();
		int width=0;
		for(int i=0;i<n;++i)
		{
			int a = scan.nextInt();
			if(a>h)
				width+=2;
			else
				width++;
		}
	System.out.print(width);
	}
}
