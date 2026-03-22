package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class NoOfIslands {
    public static int numIslands(char[][] grid) {
            int m = grid.length, n = grid[0].length;
//        make  a boolean vis[][] array
        boolean vis [][] = new boolean[m][n];
        int count = 0;

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ;j++){
                if(grid[i][j] == '1' && !vis[i][j] ){
//                    bfs(i,j,grid,vis);
                    dfs(i,j,grid,vis);
                    vis[i][j]= true;
                    count++;
                }
            }
        }

        return count;

    }

    static class Pair{
        int row;
        int col;

        Pair(int row , int col){
            this.row = row;
            this.col = col;
        }
    }

    public static void dfs(int row , int col , char[][] grid , boolean vis[][]){
        int m = grid.length;
        int n = grid[0].length;
        vis[row][col] = true;

        if(row-1 >= 0 && vis[row-1][col] == false && grid[row-1][col] == '1')
            dfs(row-1,col,grid,vis);
        if(row+1 <= m-1 && vis[row+1][col] == false && grid[row+1][col] == '1')
            dfs(row+1,col,grid,vis);
        if(col-1 >= 0 && vis[row][col-1] == false && grid[row][col-1] == '1')
            dfs(row,col-1,grid,vis);
        if(col+1 <= n-1 && vis[row][col+1] == false && grid[row][col+1] == '1')
            dfs(row,col+1,grid,vis);
    }

    public static  void bfs(int i , int j , char[][] grid,boolean [][] vis){
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,j));

        while(!q.isEmpty()){
            Pair front = q.remove();
            int row = front.row, col= front.col;

            //up: row-1,col
            if(row > 0){
                if(vis[row-1][col] == false && grid[row-1] [col] == '1'){
                    q.add(new Pair(row-1,col));
                    vis[row-1] [col] = true ;
                }
            }
            //down: row+1,col
            if ((row + 1) < m){
                if(vis[row+1][col] == false && grid[row+1][col] == '1'){
                    q.add(new Pair(row+1,col));
                    vis[row+1][col] = true;
                }
            }

            //left: row,col-1
            if (col > 0){
                if(vis[row][col-1] == false && grid[row][col-1] == '1'){
                    q.add(new Pair(row,col-1));
                    vis[row][col-1] = true;
                }
            }
            //right: row,col+1
            if ((col+1) < n){
                if(vis[row][col+1] == false && grid[row][col+1] == '1'){
                    q.add(new Pair(row,col+1));
                    vis[row][col+1] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };

        int result = numIslands(grid);
        System.out.println("No of Islands: " + result);
    }
}
