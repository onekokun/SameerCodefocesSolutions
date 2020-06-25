import java.util.*;

public class solution
{
 public static void main(String[] args)
 {
    Scanner scan = new Scanner(System.in);

	int pro =1;
	
	for(int i=0;i<2;++i)
		pro*=scan.nextInt();
	
	System.out.println(pro/2);
	
	
 }
}
