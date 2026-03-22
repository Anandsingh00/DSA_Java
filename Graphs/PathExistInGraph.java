package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PathExistInGraph {
    public boolean validPath(int n, int[][] edges, int source, int end) {
        boolean [] vis = new boolean[n];
        List<List<Integer>> adj = new ArrayList<>(n);

        for(int i = 0 ; i < n; i++){
            List<Integer> list = new ArrayList<>();
            adj.add(list);
        }

        for(int i = 0 ;i < edges.length ; i++){
            int a = edges[i][0];
            int b = edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        vis[source] = true;
//        bfs(source,adj,vis);
        dfs(source,adj,vis);

        if(!vis[end]){
            return false;
        }
        return true;
    }

    public static void dfs(int start , List<List<Integer>> adj , boolean [] vis){
        vis[start] = true;

        for(int ele: adj.get(start)){
            if(!vis[ele])
                dfs(ele,adj,vis);
        }
    }

    private void bfs(int start , List<List<Integer>> adj, boolean [] vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int front = q.remove();
            for(int ele: adj.get(front)){
                if(!vis[ele]){
                    q.add(ele);
                    vis[ele] = true;
                }
            }
        }

    }
}
