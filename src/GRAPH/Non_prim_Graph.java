package GRAPH;

import java.util.*;

class Emp{
    private int ID, salary;
    private String name;

    public Emp(int ID, int salary, String name) {
        this.ID = ID;
        this.salary = salary;
        this.name = name;
    }

    public int getID() {
        return ID;
    }


    public int getSalary() {
        return salary;
    }


    public String getName() {
        return name;
    }

}
public class Non_prim_Graph {
    // By using Adjacency List
    Map<Emp, LinkedList<Emp>> obj;
    Non_prim_Graph(){
        obj = new HashMap<>();
    }
    public void addEdge(Emp v1, Emp v2, boolean isBiDirectional){
        LinkedList<Emp> v1neighbour = obj.getOrDefault(v1, new LinkedList<>());
        v1neighbour.add(v2);
        obj.put(v1, v1neighbour);
        if(isBiDirectional){
            LinkedList<Emp> V2neighbour = obj.getOrDefault(v2, new LinkedList<>());
            V2neighbour.add(v1);
            obj.put(v2, V2neighbour);
        }
    }
    
    public void display(){
        for(Map.Entry<Emp, LinkedList<Emp>> res : obj.entrySet()){
            System.out.println(res.getKey().getName() + " " + res.getValue());
        }
    }
    public void bfsTraversal(Emp source){
        Queue<Emp> bfs = new LinkedList<>();
        bfs.add(source);
        Set<Emp> visited = new HashSet<>();
        visited.add(source);
        while(!bfs.isEmpty()){
            Emp front = bfs.poll();
            System.out.println(front.getName());
            LinkedList<Emp> neighbourList = obj.get(front);
            for(Emp i : neighbourList){
                if(!visited.contains(i)) {
                    bfs.add(i);
                    visited.add(i);
                }
            }
        }
    }
    public static void main(String[] args) {
        Non_prim_Graph obj5 = new Non_prim_Graph();
        Emp obj1 = new Emp(1, 1000, "Abhishek");
        Emp obj2 = new Emp(2, 2000, "Aksh");
        Emp obj3 = new Emp(3, 3000, "Ayush");
        Emp obj4 = new Emp(4, 4000, "Ankur");
        obj5.addEdge(obj1, obj2, true);
        obj5.addEdge(obj1, obj3, true);
        obj5.addEdge(obj1, obj4, true);
        obj5.addEdge(obj2, obj4, true);
        obj5.addEdge(obj3, obj4, true);
        obj5.bfsTraversal(obj1);
    }
}
