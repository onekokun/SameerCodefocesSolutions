import java.util.*;

public class solution
{
 public static void main(String[] args)
 {
	 Scanner scan = new Scanner(System.in);
    for(int i=0;i<5;++i)
	{
		for(int j=0;j<5;++j)
		{
			int entry = scan.nextInt();
			if(entry==1)
				System.out.println(Math.abs(i-2)+Math.abs(j-2));
		}
	}
}

}
