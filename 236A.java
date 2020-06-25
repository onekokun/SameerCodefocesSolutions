import java.util.*;

public class solution
{
 public static void main(String[] args)
 {
	Scanner scan = new Scanner(System.in);
	
	String name = scan.next();
	HashSet<Character> hset = new HashSet<Character>();
	
	for(int i=0;i<name.length();++i)
		hset.add(name.charAt(i));
	
	if(hset.size()%2==0)
		System.out.println("CHAT WITH HER!");
	else
		System.out.println("IGNORE HIM!");
	
 }

}
