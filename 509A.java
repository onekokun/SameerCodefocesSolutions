import java.util.*;

public class solution
{
 public static void main(String[] args)
 {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt(),i,j;
	if(n==1)
		System.out.print(1);
	else
	{
	int[][] a = new int[n][n];
	
	for(i=0;i<n;++i)
	{
		a[i][0]=1;
		a[0][i]=1;
	}
	
	for(i=1;i<n;++i)
		for(j=1;j<n;++j)
			a[i][j] = a[i-1][j]+a[i][j-1];

	System.out.print(a[n-1][n-1]);
	}
 }

}
