package com.company.algorithm;

public class NumberOfIslands {
        public int numIslands(char[][] grid) {
            if (grid == null || grid.length == 0 || grid[0].length == 0) {
                return 0;
            }

            int count = 0;
            for (int curRow = 0; curRow < grid.length; curRow++) {
                for (int curCol = 0; curCol < grid[0].length; curCol++) {
                    if (grid[curRow][curCol] == '1') {
                        dfs(grid, grid.length, grid[0].length, curRow, curCol);
                        count++;
                    }
                }
            }

            return count;
        }

        private void dfs(char[][] grid, int rows, int cols, int curRow, int curCol) {
            if (curRow < 0 || curRow >= rows || curCol < 0 || curCol >= cols || grid[curRow][curCol] == '0') {
                return;
            }

            grid[curRow][curCol] = '0';

            dfs(grid, rows, cols, curRow - 1, curCol);
            dfs(grid, rows, cols, curRow + 1, curCol);
            dfs(grid, rows, cols, curRow, curCol + 1);
            dfs(grid, rows, cols, curRow, curCol - 1);
        }

    public static void main(String[] args) {
        char[][] grid ={
                { '1', '1', '0', '0', '0' },
                { '1', '1', '0', '0', '0' },
                { '0', '0', '1', '0', '0' },
                { '0', '0', '0', '1', '1' }

        };
        int count = new NumberOfIslands().numIslands(grid);
        System.out.println(count);
    }
}
