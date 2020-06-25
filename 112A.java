import java.util.*;

public class solution
{
 public static void main(String[] args)
 {
    Scanner scan = new Scanner(System.in);

	String one = scan.next().toLowerCase();
	String two = scan.next().toLowerCase();
	
	int comp = one.compareTo(two);
	
	if(comp==0)
		System.out.println(comp);
	else
		System.out.println(comp/Math.abs(comp));
}

}
