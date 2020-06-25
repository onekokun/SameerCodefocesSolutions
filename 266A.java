import java.util.*;

public class solution
{
 public static void main(String[] args)
 {
	Scanner scan = new Scanner(System.in);
	int len = scan.nextInt();
	String word = scan.next();
	int count=0;
	
	for(int i=0;i<word.length()-1;++i)
	{
		if(word.charAt(i)==word.charAt(i+1))
			count++;
	}
	System.out.println(count);
 }

}
