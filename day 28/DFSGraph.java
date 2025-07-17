import java.util.*;

public class DFSGraph {
    private int V;
    private LinkedList<Integer>[] adjList;

    public DFSGraph(int v) {
        V = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++)
            adjList[i] = new LinkedList<>();
    }

    void addEdge(int u, int v) {
        adjList[u].add(v);
        adjList[v].add(u); // remove this for directed graph
    }

    void dfs(int start) {
        boolean[] visited = new boolean[V];
        System.out.print("DFS Traversal starting from node " + start + ": ");
        dfsUtil(start, visited);
        System.out.println();
    }

    void dfsUtil(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : adjList[node]) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();
        DFSGraph g = new DFSGraph(v);

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        System.out.println("Enter edges (u v): ");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v1 = sc.nextInt();
            g.addEdge(u, v1);
        }

        System.out.print("Enter starting node for DFS: ");
        int start = sc.nextInt();

        g.dfs(start);

        sc.close();
    }
}
