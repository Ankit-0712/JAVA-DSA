package Recursion.BackTracking;

import java.util.Arrays;

public class AllPathsMaze {
    public static void main(String[] args){
        boolean[][] board = {
            {true, true, true},
            {true, true, true},
            {true, true, true},
        };

        int[][] path = new int[board.length][board[0].length];
        allPath("", board, 0, 0);
        allPathPrints("", board, 0, 0, path, 1);
    }

    static void allPath(String p, boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        if(r< maze.length-1){
            allPath(p + 'D', maze, r+1, c);
        }

        if(c< maze[0].length-1){
            allPath(p + 'R', maze, r, c+1);

        }
        if(r>0){
            allPath(p+ 'U', maze, r-1, c);
        }

        if(c>0){
            allPath(p+'L', maze, r, c-1);
        }

        maze[r][c] = true;//backtracking
    }

    static void allPathPrints(String p, boolean[][] maze, int r, int c, int[][] path, int step){

        if(r==maze.length-1 && c== maze[0].length-1){
           for(int[] arr:path){
            System.out.println(Arrays.toString(arr));

           }
           System.out.println(p);
           System.out.println();
           return;
        }
        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;
        path[r][c] = step;

        if(r< maze.length-1){
            allPathPrints(p+'D', maze, r+1, c, path, step+1);
        }
        if(c<maze[0].length-1){
            allPathPrints(p+'R', maze, r, c+1, path, step+1);
        }
        if(r>0){
            allPathPrints(p+'U', maze, r-1, c, path, step+1);
        }
        if(c>0){
            allPathPrints(p+'L', maze, r, c-1, path, step+1);
        }

        maze[r][c] = true;
        path[r][c] = 0;
    }
}
