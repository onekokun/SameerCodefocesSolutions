import java.util.*;

public class solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[4];
		for(int i=0;i<4;++i)
			arr[i] = scan.nextInt();
		int max=-1;
		for(int x:arr)
			if(x>max)
				max=x;
		for(int y:arr)
			if(max-y != 0)
			System.out.print(max-y+" ");
		
	}
}
