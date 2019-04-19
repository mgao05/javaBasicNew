package com.company.algorithm;

public class Maze {

        private static final int SIZE = 9;

        //the maze problem
        private static int[][] maze = {
                {0,1,0,1,1,1,0,0,1},
                {0,0,0,0,0,1,1,1,0},
                {1,0,1,0,1,0,0,1,1},
                {0,0,1,0,0,1,1,1,1},
                {1,1,1,0,1,0,0,0,0},
                {0,0,1,0,0,1,0,1,0},
                {1,0,1,0,1,0,0,1,1},
                {0,0,1,0,0,0,0,0,0},
                {1,1,1,1,1,0,0,0,0}
        };

        //matrix to store the solution
      private static int[][] solution = new int[SIZE][SIZE];

      //  function to print the solution matrix so we can check if the result is correct using testing cases
        private static void printSolution()
        {
            for(int i=0;i<SIZE;i++)
            {
                for(int j=0;j<SIZE;j++)
                {
                    System.out.print(solution[i][j]+"\t");
                }
                System.out.print("\n\n");
            }
        }

        //function to solve the maze
        //using backtracking
      // go from(r,c) to (l,w)
        private static boolean solveMaze(int r, int c, int l, int w)
        {
            //if destination is reached, maze is solved
            if((r==l-1) && (c==w-1))
            {
                solution[r][c] = 1;
                return true;
            }

            if(r>=0 && c>=0 && r<l && c<w && solution[r][c] == 0 && maze[r][c] == 0)
            {
                //if safe to visit then visit the cell
                solution[r][c] = 1;
                //going down
                if(solveMaze(r+1, c, l, w))
                    return true;
                //going right
                if(solveMaze(r, c+1, l, w))
                    return true;
                //going up
                if(solveMaze(r-1, c, l, w))
                    return true;
                //going left
                if(solveMaze(r, c-1, l, w))
                    return true;
                //backtracking
                solution[r][c] = 0;
                return false;
            }
            return false;

        }

        public static void main(String[] args)
        {
            if (solveMaze(0,0, 8, 8))
                System.out.println("Yes");
                //printSolution();
            else
                System.out.println("No");
        }
    }
