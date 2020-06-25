import java.util.*;

public class solution
{
 public static void main(String[] args)
 {
	Scanner scan = new Scanner(System.in);
	
	int des = scan.nextInt();
	int sum=0;
	
	for(int i=5;i>0;i--)
	{
		sum+= des/i;
		des%=i;
		
	}
 
	System.out.print(sum);
 }

}
