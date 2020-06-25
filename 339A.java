import java.util.*;

public class solution
{
 public static void main(String[] args)
 {
	Scanner scan = new Scanner(System.in);
	String prob = scan.next();
	
	int num = (prob.length()/2)+1;
	int[] arr = new int[num];
	int index=0;
	for(int i=0;i<prob.length();i+=2)
	{
		arr[index] = prob.charAt(i)-'0';  
		index++;
	}
	
	Arrays.sort(arr);
	
	System.out.print(""+arr[0]);
	for(int k=1;k<num;++k)
		System.out.print("+"+arr[k]);
	
	
}

}
