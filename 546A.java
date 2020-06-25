import java.util.*;

public class solution
{
 public static void main(String[] args)
 {
	Scanner scan = new Scanner(System.in);
	
	int k = scan.nextInt();
	int n = scan.nextInt();
	int w = scan.nextInt();
	
	int bill = (k*w*(w+1))/2;
	
	if(n<bill)
		System.out.print(bill-n);
	else
		System.out.print(0);
	
 }

}
