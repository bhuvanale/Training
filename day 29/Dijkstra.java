import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair> {
    int vertex, dist;

    public Pair(int v, int d) {
        this.vertex = v;
        this.dist = d;
    }

    @Override
    public int compareTo(Pair other) {
        return this.dist - other.dist; // Min heap based on distance
    }
}

public class Dijkstra {
    static int V = 6;
    static ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

    public static void addEdge(int u, int v, int w) {
        adj.get(u).add(new Pair(v, w)); // directed graph
    }

    public static void dijkstraAlgo(int source) {
        int dist[] = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.offer(new Pair(source, 0)); 

        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int u = current.vertex;

            for (Pair neighbor : adj.get(u)) {
                int v = neighbor.vertex;
                int weight = neighbor.dist;

                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.offer(new Pair(v, dist[v]));
                }
            }
        }

        System.out.println("Shortest distances from source 0 :");
        for (int i = 0; i < V; i++) {
            System.out.println("Start  " + i + " --> Distance: " + dist[i]);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(0, 1, 4);
        addEdge(0, 2, 2);
        addEdge(1, 2, 5);
        addEdge(1, 3, 10);
        addEdge(2, 4, 3);
        addEdge(4, 3, 4);
        addEdge(3, 5, 11);

        dijkstraAlgo(0);
    }
}
