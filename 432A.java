import java.util.*;

public class solution
{
 public static void main(String[] args)
 {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int k = scan.nextInt();
	int count=0;
	for(int i=0;i<n;++i)
	{
		int tm = scan.nextInt();
		if(5-tm>=k)
			count++;
	}		
	
	System.out.print(count/3);

 }

}
