package backtracking.rat_in_a_maze;

public class RatInAMaze {


    public boolean canTraverseInTheMaze(int[][] maze, int x, int y, int[][] sol) {

        if (x == maze.length - 1 && y == maze.length - 1) {
            sol[x][y] = 1;
            return true;
        }
        if (isCellSafe(maze, x, y)) {
            sol[x][y] = 1;

            if (canTraverseInTheMaze(maze, x + 1, y, sol))
                return true;

            if (canTraverseInTheMaze(maze, x, y + 1, sol))
                return true;

            sol[x][y] = 0;
            return false;
        }


        return false;
    }

    private static boolean isCellSafe(int[][] maze, int x, int y) {

        return (x >= 0 && (x <= maze.length - 1) && y >= 0 && (y <= maze.length - 1) && maze[x][y] == 1);
    }
}
