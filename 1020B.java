import java.util.*;

public class solution
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i;
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		for(i=0;i<n;++i)
		{
			graph.add(new ArrayList<Integer>());
		}
		
		for(i=0;i<n;++i)
		{
			int p = scan.nextInt();
			addEdge(graph,i,p-1);
		}
		
		for(i=0;i<n;++i)
		{
			boolean[] visited = new boolean[n];
			int ans = getCulprit(graph,i,n,visited);
			System.out.print(ans+" ");
		}
	}
	
	public static void addEdge(ArrayList<ArrayList<Integer>> graph, int u,int v)
	{
		graph.get(u).add(v);
	}

	public static int getCulprit(ArrayList<ArrayList<Integer>> graph,int stu,int n,boolean[] visited)
	{	
		
		while(!visited[stu])
		{
			visited[stu]=true;
			int p = graph.get(stu).get(0);
			stu = p;
		}
	
		return stu+1;
	}
	
}
