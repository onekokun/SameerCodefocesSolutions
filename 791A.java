import java.util.*;

public class solution
{
 public static void main(String[] args)
 {
	Scanner scan = new Scanner(System.in);
	
	int l = scan.nextInt();
	int b = scan.nextInt();
	int yrs=0;
	
	while(l<=b)
	{
		l*=3;
		b*=2;
		yrs++;
	}
	System.out.println(yrs);
 }

}
