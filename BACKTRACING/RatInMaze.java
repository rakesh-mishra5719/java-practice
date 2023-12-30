package BACKTRACING;

//import javax.naming.spi.DirStateFactory.Result;

public class RatInMaze {
    
    static void mazeSolver(int [][]maze){
        
        int m = maze.length;
        int n = maze[0].length;
        int result[][]= new int [m][n];
        helper(maze,result,0,0);

}
static boolean helper(int maze[][],int result[][],int x, int y){
    if(y == maze.length && x==maze.length) {
        x = y + 1;
        y = 0;
    }

    // Base Case
    if(x == maze.length) {
        display(result);
        return true;
    }
    if(isSafe(maze,x,y)){
        result[x][y]=1;
        boolean flag = helper(maze, result, x+1, y);
        if(flag) {
            return true;
        }
        flag = helper(maze, result, x, y+1);
        if(flag){
            return true;
        }
        //backtracking
        result[x][y]=0;
        return false;

    }
    return false;

}
static boolean isSafe(int maze[][],int x, int y){
    if(x<=maze.length && x<=maze.length){

        return maze[x][y] == 1;
    }
    return false;

}
static void display(int maze[][]) {
    for(int i = 0; i < maze.length; i++) {
        for(int j = 0; j < maze.length; j++) {
            System.out.print(maze[i][j] + ",");
        }
        System.out.println();
    }
}


public static void main(String[] args) {
    
    
        int arr[][]={
        {1,0,0,0},
        {1,1,0,1},
        {0,1,0,0},
        {1,1,1,1}
    };
    mazeSolver(arr);

        
    }
}
