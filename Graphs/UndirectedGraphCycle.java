package Graphs;

import java.util.*;

public class UndirectedGraphCycle {
    static class  Pair{
        int node;
        int parent;

        Pair(int node, int parent){
            this.node = node;
            this.parent = parent;
        }
    }

    public static boolean cycle(List<List<Integer>> adj){
        int n  = adj.size();
        boolean vis[] = new boolean[n];
        int start = 0 ;

        for(int i = 0 ; i < n ; i++){
            if(!vis[i]){
                if(bfs(adj,vis,i,-1)){
                        return true;
                }
            }
        }
        return false;

    }

    public static boolean bfs(List<List<Integer>> adj,boolean[]vis,int n,int p){
        vis[n] = true;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(n,p));

        while (!q.isEmpty()){
            Pair front = q.remove();
            int node = front.node;
            int parent = front.parent;

            for(int ele: adj.get(node)){
                if(!vis[ele]){
                    vis[ele]=true;
                    q.add(new Pair(ele,node));
                }else if(ele  != parent){
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        List< List <Integer>> adj = new ArrayList<>();

        adj.add(Arrays.asList(1));        // 0
        adj.add(Arrays.asList(0,2));      // 1
        adj.add(Arrays.asList(1,3,4));    // 2
        adj.add(Arrays.asList(2,4,5));    // 3
        adj.add(Arrays.asList(2,3));      // 4
        adj.add(Arrays.asList(3,6));      // 5
        adj.add(Arrays.asList(5));        // 6


        boolean res = cycle(adj);
        System.out.println(res+"<-Result");
    }
}
