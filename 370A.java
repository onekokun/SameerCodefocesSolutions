import java.util.*;

public class solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int r1 = scan.nextInt();
		int c1 = scan.nextInt();
		int r2 = scan.nextInt();
		int c2 = scan.nextInt();
		
		int d1 = Math.abs(r1-r2);
		int d2 = Math.abs(c1-c2);
		
		int king = Math.max(d1,d2);
		
		int rook;
		if(r1==r2 || c1==c2)
			rook=1;
		else
			rook=2;
		
		int nop1 = (r1+c1)%2;
		int nop2 = (r2+c2)%2;
		
		int bishop = 1;
		if(nop1!=nop2)
			bishop=0;
		else if(d1!=d2)
			bishop=2;
			
		System.out.print(rook+ " " +bishop+ " " +king);
	}
	
}
