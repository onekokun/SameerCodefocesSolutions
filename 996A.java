import java.util.*;

public class solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int sum=0;
		sum+=n/100;
		n%=100;
		sum+=n/20;
		n%=20;
		sum+=n/10;
		n%=10;
		sum+=n/5;
		n%=5;
		sum+=n/1;
		n%=1;
			System.out.print(sum);

	}
}
 
