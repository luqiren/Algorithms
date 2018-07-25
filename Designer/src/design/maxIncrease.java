package design;

import java.util.*;

public class maxIncrease {
    public static void main(String[] args) {
        int[][] a = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        System.out.println(maxIncreaseKeepingSkyline(a));
    }
    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        List<Integer> row = new LinkedList<>();
        List<Integer> col = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            int temp = grid[i][0];
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] > temp) {
                    temp = grid[i][j];
                }
            }
            row.add(temp);
        }
        for (int j = 0; j < grid[0].length; j++) {
            int temp = grid[0][j];
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][j] > temp) {
                    temp = grid[i][j];
                }
            }
            col.add(temp);
        }
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int min = row.get(i) < col.get(j) ? row.get(i) : col.get(j);
                sum += min - grid[i][j];
            }
        }
        return sum;
    }
}
