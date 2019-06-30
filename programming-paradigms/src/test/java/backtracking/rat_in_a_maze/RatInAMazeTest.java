package backtracking.rat_in_a_maze;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RatInAMazeTest {

    int[][] maze;
    int[][] sol;
    RatInAMaze ratInAMazeRunner;

    @Before
    public void init() {
        maze = new int[][]{{1, 0, 0, 0}, {1, 1, 0, 1}, {0, 1, 0, 0}, {1, 1, 1, 1}};
        sol = new int[maze.length][maze.length];
        ratInAMazeRunner = new RatInAMaze();
    }

    @Test
    public void testRatInAMaze() {

        boolean result = ratInAMazeRunner.canTraverseInTheMaze(maze, 0, 0, sol);
        Assert.assertEquals(true, result);
    }

}