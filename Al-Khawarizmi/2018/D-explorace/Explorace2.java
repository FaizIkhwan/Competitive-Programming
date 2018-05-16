import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Explorace2 {
	private static int [][] adj;
	private static int [] q;
	private static final int MAX = 999;

	public static void main(String [] args) throws IOException {
		
		//Scanner sc = new Scanner(new File("explorace.txt"));
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int caseNo = 1;
		while ( caseNo <=t+1){
			if (sc.hasNextLine()) {
			// Preparing the graph
			//System.out.print("Read from file, the number of vertices:" );
	    	int n = sc.nextInt(); //check points
			
			//System.out.print("Read from file, the number of paths:" );
			int m = sc.nextInt(); //paths
			//System.out.println(m);
			//System.out.println("Enter graph data in adjacency matrix form: " );
			adj = new int [n+1][n+1];
			q = new int [n+1];

			for (int i = 0; i < m; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int d = sc.nextInt();
				adj[a][b] = d;
				adj[b][a] = d;
			}
	    	
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (i == j)
						adj[i][j] = 0;
					else if (adj[i][j] == 0)
						adj[i][j] = MAX;
				}
			}
			
			for(int i=0; i <=n; i++) {
				q[i]=0;
			}
			System.out.print("\nCase #"+caseNo+": ");
			Prim(n, adj);
			caseNo++;
			} else
				break;
		} //while
		//sc.close();
	}

	//Prim's Algorithm
	public static void Prim(int n, int [][] cost) {
		int ne=1, min,a=0,b=0,u = 0,v = 0,  mincost=0;
		int [] visited = new int [n+1];
		for(int i=1; i<=n; i++)
			visited[i] = 0;

		visited[1]=1;
		while(ne < n) {
			min = MAX;
			for(int i=1; i<=n; i++)
				for(int j=1; j <=n ; j++)
					if(cost[i][j] < min)
						if(visited[i] != 0) {
							min = cost[i][j];
							a=u=i;
							b=v=j;
						}
			if(visited[u]==0 || visited[v]==0) {
				//System.out.print("(" + a + ", " + b + ") ");
				ne++;
				//System.out.printf("\n Edge %d:(%d %d) cost:%d",ne++,a,b,min);
				mincost+=min;
				visited[b]=1;
			}
			cost[a][b]=cost[b][a]=MAX;
		}
		System.out.print(mincost + " meters");
		
	} //end Prim's Algorithm
}