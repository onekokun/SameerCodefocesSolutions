import java.util.*;

public class solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k=0;
		for(int i=0;i<n;++i)
		{	
			if(i%2==0)
			{	
				for(int j=0;j<m;++j)
				System.out.print("#");
			
				System.out.println();
			}
			
			else
			{	k++;
				if(k%2==0)
				{
					System.out.print("#");
					for(int j=0;j<m-1;++j)
					System.out.print(".");
				}
				else
				{
					for(int j=0;j<m-1;++j)
					System.out.print(".");
					
					System.out.print("#");
				}
				
			System.out.println();
			}				
		}
	}
}
 
