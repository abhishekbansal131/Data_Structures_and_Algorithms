package GRAPH;

import java.util.Scanner;

public class PRIMS_ALGO {
    public static void prims(int[][] matrix){
        int n = matrix.length;
        int[] parent = new int[n];
        int[] wt = new int[n];
        boolean[] vis = new boolean[n];
        parent[0] = -1;
        wt[0] = 0;
        for(int i=1; i<n; i++) wt[i] = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            int minvertex = findmin(vis, wt);
            vis[minvertex] = true;
            for(int j=0; j<n; j++){
                if(matrix[minvertex][j] != 0 && !vis[j]){
                    if(wt[j] > matrix[minvertex][j]){
                        wt[j] = matrix[minvertex][j];
                        parent[j] = minvertex;
                    }
                }
            }
        }
        for(int i=0; i<n; i++){
            if(i < parent[i]) System.out.println(i + " " + parent[i] + " " + wt[i]);
            else System.out.println(parent[i] + " " + i + " " + wt[i]);
        }
    }
    private static int findmin(boolean[] vis, int[] wt){
        int minvertex = -1;
        for(int i=0; i<vis.length; i++){
            if(!vis[i] && (minvertex == -1 || wt[i] < wt[minvertex])){
                minvertex = i;
            }
        }
        return minvertex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertex");
        int n= sc.nextInt();
        System.out.println("Enter the number of edges");
        int e = sc.nextInt();
        int matrix[][] = new int[n][n];
        for (int i = 0; i <e; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int weight = sc.nextInt();
            // creation of undirected graph
            matrix[v1][v2]= weight;
            matrix[v2][v1] = weight;
        }
        prims(matrix);
    }
}

    /* prims execution
    Enter the number of vertex
        5
        Enter the number of edges
        7
        0 1 4
        0 2 8
        1 2 2
        1 3 6
        2 3 3
        2 4 9
        3 4 5
// execute the loop from value 1  insted of zero
//-1   0   0
        0   1   4
        1   2   2
        2   3   3
        3   4   5
        */