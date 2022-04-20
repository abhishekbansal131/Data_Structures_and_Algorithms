package GRAPH;
import Queue.Ques;

import java.util.*;


public class GraphDemo {
    Map<Integer, LinkedList<Integer>> obj;
    GraphDemo(){
        obj = new HashMap<>();
    }
    public void addEdge(int v1, int v2, boolean isBiDirectional){
//        if(!obj.containsKey(v1)) obj.put(v1, new LinkedList<>());
//        if(!obj.containsKey(v2)) obj.put(v2, new LinkedList<>());
//        LinkedList<Integer> l = obj.get(v1);
//        l.add(v2);
//        if(isBiDirectional) {
//            LinkedList<Integer> m = obj.get(v2);
//            m.add(v1);
//        }
        LinkedList<Integer> V1neighbour = obj.getOrDefault(v1, new LinkedList<>());
        V1neighbour.add(v2);
        obj.put(v1, V1neighbour);
        if(isBiDirectional){
            LinkedList<Integer> V2neighbour = obj.getOrDefault(v2, new LinkedList<>());
            V2neighbour.add(v1);
            obj.put(v2, V2neighbour);
        }
    }
//    @Override
//    public String toString(){
//        StringBuilder s = new StringBuilder();
//        for(Integer i : obj.keySet()){
//            s.append(i.toString() + ": ");
//            for(Integer j : obj.get(i)){
//                s.append(j.toString() + " ");
//            }
//            s.append("\n");
//        }
//        return s.toString();
//    }
    public void display(){
        for(Map.Entry<Integer, LinkedList<Integer>> res : obj.entrySet()){
            System.out.println(res.getKey() + " " + res.getValue());
        }
    }
    public void bfsTraversal(int source){
        Queue<Integer> bfs = new LinkedList<>();
        bfs.add(source);
        Set<Integer> visited = new HashSet<>();
        visited.add(source);
        while(!bfs.isEmpty()){
            int front = bfs.poll();
            System.out.println(front);
            LinkedList<Integer> neighbourList = obj.get(front);
            for(Integer i : neighbourList){
                if(!visited.contains(i)) {
                    bfs.add(i);
                    visited.add(i);
                }
            }
        }
    }
    public static void main(String[] args) {
        GraphDemo obj = new GraphDemo();
//        obj.addEdge(0,1,true);
//        obj.addEdge(0,4,true);
//        obj.addEdge(1,2,true);
//        obj.addEdge(1,3,false);
//        obj.addEdge(1,4,true);
//        obj.addEdge(2,3,true);
//        obj.addEdge(2,4,true);
//        obj.addEdge(3,0,true);
//        obj.addEdge(2,0,true);
        obj.addEdge(1,2,true);
        obj.addEdge(1,3,true);
        obj.addEdge(2,4,true);
        obj.addEdge(3,4,true);
        obj.addEdge(3,5,true);
        obj.addEdge(5,6,true);
        obj.display();
        obj.bfsTraversal(1);
    }
}

