import java.util.*;
 
public class solution
{
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int faces=0;
		for(int i=0;i<n;++i)
		{
			String poly = scan.next();
			char ch = poly.charAt(0);
			
			switch(ch)
			{
				case 'T': faces+=4; break;
				case 'C': faces+=6; break;
				case 'O': faces+=8; break;
				case 'D': faces+=12; break;
				case 'I': faces+=20; break;
			}
		}

	System.out.print(faces);
	}
	
}
