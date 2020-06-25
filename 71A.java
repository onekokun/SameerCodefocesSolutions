import java.util.*;

public class solution
{
 public static void main(String[] args)
 {
    Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	
	for(int i=0;i<n;++i)
	{
		String str = scan.next();
		if(str.length()<=10)
		{
			System.out.println(str);
		}
	
		else
		{	String num = Integer.toString(str.length()-2);
			System.out.println(str.charAt(0)+num+str.charAt(str.length()-1));
		}
	}

 }
 
}
