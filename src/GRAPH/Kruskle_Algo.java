package GRAPH;

import java.util.Arrays;
import java.util.Scanner;

class Edge implements Comparable<Edge>{
    int v1, v2, wt;

    public Edge(int v1, int v2, int wt) {
        this.v1 = v1;
        this.v2 = v2;
        this.wt = wt;
    }
    @Override
    public int compareTo(Edge O){
        return this.wt - O.wt;
    }
}
public class Kruskle_Algo {
    public static Edge[] kruskle(Edge[] edges, int v){
        Arrays.sort(edges);
        Edge[] mst = new Edge[v-1];
        int c = 0, i = 0;
        int[] parent = new int[v];
        for(int j=0; j<v; j++){
            parent[j] = j;
        }
        while(c != v-1){
            Edge current = edges[i++];
            int v1parent = findparent(current.v1, parent);
            int v2parent = findparent(current.v2, parent);
            if(v1parent != v2parent){
                mst[c++] = current;
                parent[v1parent] = v2parent;
            }
        }
        return mst;
    }
    private static int findparent(int v1, int[] parent){
        if(v1 == parent[v1]){
            return v1;
        }
        return findparent(parent[v1], parent);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // how many vertex
        int v = sc.nextInt();
        // how many edges
        int e = sc.nextInt();
        Edge edgearray[] = new Edge[e];
        for (int i = 0; i <e ; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int weight = sc.nextInt();
            Edge obj = new Edge(v1,v2,weight);
            edgearray[i]= obj;
        }
        Edge[] mst = kruskle(edgearray,v);
        for (int i = 0; i <mst.length ; i++) {
            if(mst[i].v1<mst[i].v2)
            {
                System.out.println(mst[i].v1+" " +mst[i].v2+"  "+mst[i].wt);
            }
            else
            {
                System.out.println(mst[i].v2+" "+mst[i].v1+"  "+mst[i].wt);
            }
        }
    }
}
