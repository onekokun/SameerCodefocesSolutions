import java.util.*;

public class solution
{
 public static void main(String[] args)
 {
	Scanner scan = new Scanner(System.in);
	long n = scan.nextLong();
	long sum=0;
	if(n%2==0)
		sum= n/2;
	else
		sum= (-n-1)/2;
	System.out.println(sum);

 }

}
