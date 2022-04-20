package GRAPH;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class SSOP_BFS {
    GraphDemo obj1; // using object of GraphDemo class to use the methods created inside the graphDemo class
    SSOP_BFS(){
        obj1 = new GraphDemo();
    }
    public void SSOPbfs(int source, int des){
        Queue<Integer> bfs = new LinkedList<>();
        bfs.add(source);
        Map<Integer, Integer> dis = new HashMap<>();
        for(int i : obj1.obj.keySet()){
            dis.put(i, Integer.MAX_VALUE);
        }
        dis.put(source, 0);
        while(!bfs.isEmpty()){
            int front = bfs.poll();
            LinkedList<Integer> neighbourList = obj1.obj.get(front);
            for(int i : neighbourList){
                if(dis.get(i) == Integer.MAX_VALUE){
                    bfs.add(i);
                    int distance = dis.get(front) + 1;
                    dis.put(i, distance);
                    if(i == des)
                    System.out.println("Distance of " + i + " from source " + source + " is " + distance);
                }
            }
        }
    }

    public static void main(String[] args) {
        SSOP_BFS obj = new SSOP_BFS();
        obj.obj1.addEdge(1,2,true);
        obj.obj1.addEdge(1,3,true);
        obj.obj1.addEdge(2,4,true);
        obj.obj1.addEdge(3,4,true);
        obj.obj1.addEdge(3,5,true);
        obj.obj1.addEdge(5,6,true);
        obj.obj1.bfsTraversal(1);
        obj.SSOPbfs(4, 6);
    }
}
