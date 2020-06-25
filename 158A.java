import java.util.*;

public class solution
{
 public static void main(String[] args)
 {
    Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	int k = scan.nextInt();
	
	int[] arr = new int[n];
	
	for(int i=0;i<n;++i)
		arr[i] = scan.nextInt();
	
	int count=0;
	for(int x:arr)
		if(x>=arr[k-1] && x>0)
			count++;
		
	System.out.println(count);

 }
 
}
