import java.util.*;

public class solution
{
 public static void main(String[] args)
 {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	
	int sum=0;
	for(int i=0;i<n;++i)
		sum+=scan.nextInt();
	
	if(sum>0)
		System.out.println("hard");
	else
		System.out.println("EASY");
 }

}
