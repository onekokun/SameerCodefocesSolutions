import java.util.*;
 
public class solution
{
 public static void main(String[] args)
 {
	Scanner scan = new Scanner(System.in);
	
	long num = scan.nextLong();
	int count=0;
	while(num>0)
	{
		int dig = (int) (num%10);
		if(dig==4 || dig==7)
			count++;
		num/=10;
	}
	
	if(count==4 || count==7)
		System.out.print("YES");
	else
		System.out.print("NO");
 }
 
}
