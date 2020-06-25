import java.util.*;

public class solution
{
 public static void main(String[] args)
 {
	Scanner scan = new Scanner(System.in);
	
	int num = scan.nextInt();
	int freq = scan.nextInt();
	
	for(int i=0;i<freq;++i)
	{
		if(num%10==0)
			num/=10;
		else
			num--;
	}

	System.out.print(num);
 }

}
