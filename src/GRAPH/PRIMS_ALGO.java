package GRAPH;

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
}
