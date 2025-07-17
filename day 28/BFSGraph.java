import java.util.*;

public class BFSGraph {
    private int V; 
    private LinkedList<Integer>[] adjList;

    public BFSGraph(int v) {
        V = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++)
            adjList[i] = new LinkedList<>();
    }

    // Add edge (undirected graph)
    void addEdge(int u, int v) {
        adjList[u].add(v);
        adjList[v].add(u); // remove this for directed graph
    }

    // BFS traversal
    void bfs(int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        System.out.print("BFS Traversal starting from node " + start + ": ");

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : adjList[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();
        BFSGraph g = new BFSGraph(v);

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        System.out.println("Enter edges (u v): ");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v1 = sc.nextInt();
            g.addEdge(u, v1);
        }

        System.out.print("Enter starting node for BFS: ");
        int start = sc.nextInt();

        g.bfs(start);

        sc.close();
    }
}
