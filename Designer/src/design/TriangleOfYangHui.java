package design;

import java.util.ArrayList;
import java.util.List;

public class TriangleOfYangHui {
    public static void main (String[] args) {
        int n = 50;
        List<List<Integer>> triangle = generate(n);
        for (int i = 0; i < triangle.size(); i++) {
            System.out.println(triangle.get(i));
        }
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(triangle.get(i -1).get(j) + triangle.get(i - 1).get(j - 1));
                }
            }
            triangle.add(row);
        }
        return triangle;
    }
}

