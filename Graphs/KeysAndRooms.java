package Graphs;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
public class KeysAndRooms {
    public static boolean canVisitAllRooms(List<List<Integer>> adj) {
        int n = adj.size();
        boolean [] vis = new boolean[n];
        vis[0] = true;
        bfs(0,adj,vis);

        for(boolean ele : vis){
            if(!ele) return false;
        }
         return true;
    }

    private static void bfs(int start,List<List<Integer>>adj ,boolean [] vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int front = q.remove();
            for(int idx : adj.get(front)){
                if(!vis[idx]){
                    q.add(idx);
                    vis[idx] = true;
                }
            }
        }

    }
    public static void main(String[] args) {

        // Test Case 1: Expected true
        List<List<Integer>> rooms1 = new LinkedList<>();
        rooms1.add(List.of(1));
        rooms1.add(List.of(2));
        rooms1.add(List.of(3));
        rooms1.add(List.of());

        System.out.println("Test 1: " + canVisitAllRooms(rooms1)); // true


        // Test Case 2: Expected false
        List<List<Integer>> rooms2 = new LinkedList<>();
        rooms2.add(List.of(1, 3));
        rooms2.add(List.of(3, 0, 1));
        rooms2.add(List.of(2));
        rooms2.add(List.of(0));

        System.out.println("Test 2: " + canVisitAllRooms(rooms2)); // false


        // Test Case 3: Single room
        List<List<Integer>> rooms3 = new LinkedList<>();
        rooms3.add(List.of());

        System.out.println("Test 3: " + canVisitAllRooms(rooms3)); // true


        // Test Case 4: Disconnected
        List<List<Integer>> rooms4 = new LinkedList<>();
        rooms4.add(List.of(1));
        rooms4.add(List.of(2));
        rooms4.add(List.of());
        rooms4.add(List.of());

        System.out.println("Test 4: " + canVisitAllRooms(rooms4)); // false


        // Test Case 5: Cycle but reachable
        List<List<Integer>> rooms5 = new LinkedList<>();
        rooms5.add(List.of(1));
        rooms5.add(List.of(2));
        rooms5.add(List.of(0, 3));
        rooms5.add(List.of());

        System.out.println("Test 5: " + canVisitAllRooms(rooms5)); // true
    }
}
