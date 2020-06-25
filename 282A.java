import java.util.*;

public class solution
{
 public static void main(String[] args)
 {
    Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	int ans =0;
	
	for(int i=0;i<n;++i)
	{
		String state = scan.next();
		if(state.charAt(1)=='+')
			ans++;
		else
			ans--;
	} 

	System.out.println(ans);
}

}
