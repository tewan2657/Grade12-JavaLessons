/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview;

/**
 *
 * @author tewan2657
 */
public class MazeSolver {

    /**
     * @param args the command line arguments
     */
    public void printMaze(char[][]maze){
        //loop through all rows
        for (int i = 0; i < maze.length; i++) {
            //go through the row
            for (int j = 0; j < maze[i].length; j++) {
                //Printing current location
                System.out.print(maze[i][j]);
            }
            //move to the next line
            System.out.println("");
        }
    }
    public boolean solveMaze(char[][] maze, int row, int col){
        //Am I off the map?
        if(row < 0 || col < 0 
           || row >= maze.length
           || col>=maze[0].length){
        return false;  
        }
          //did i find the end?>
        if(maze[row][col]== 'e'){
            printMaze(maze);
            return true;
        }
        
        //Is this a bad spot?
        if(maze[row][col]== '+'
         ||maze[row][col] == 'w'){
            return false;
        }
        //I'm on a vaild location
        //mark I've been here!
        maze[row][col] = '+';
        //check north!
        boolean check = solveMaze(maze, row-1, col);
        //Did it work?
        if(check){
            return true;
        }
        //check east
        check = solveMaze(maze, row, col + 1);
        if(check){
            return true;
        }
         //check south
        check = solveMaze(maze, row +1, col);
        if(check){
            return true;
        }
        //check west
        check = solveMaze(maze, row, col - 1);
        if(check){
            return true;
        }
        //spot no good
        //"unmoving..."
        maze[row][col] = '.';
        return false;
    
    }
    
    public static void main(String[] args) {
      //  char[][]maze = new char[10][10];
        char[][]maze = {{'w', 'w', 'w', 'w', '.', '.'},
                         {'s', '.', 'w', '.', 'w', '.'}, 
                         {'w', '.', 'w', '.', 'w', '.'},
                         {'w', '.', '.', '.', '.', '.'},
                         {'w', 'w', 'w', 'e', 'w', '.'},
        };
       MazeSolver test = new MazeSolver();
       test.printMaze(maze);
       test.solveMaze(maze, 1, 0);


        
        
        
    } 
}
