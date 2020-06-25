import java.util.*;
import java.lang.*;
 
public class solution
{
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		for(int i=1;i<=1000;++i)
		{
			if(lucky(i))
				list.add(i);
		}
		
		int check=0;
		for(int j=0;j<list.size();++j)
		{
			if(n%list.get(j)==0)
				check++;
		}

		if(check>0)
			System.out.print("YES");
		else
			System.out.print("NO");
	}

	public static boolean lucky(int x)
	{
		int count=0;
		while(x>0)
		{
			int r = x%10;
			if(r!=4 && r!=7)
				count++;
			x/=10;
		}
		if(count>0)
			return false;
		else
			return true;
	}

}
