package design;
import java.util.*;

public class DFS {

    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
        List<String> list = null;
//        list.add("hello");
//        list.add("nihao");
        if (list != null && !list.isEmpty()) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }

    public static int dfs (int x, int y, int step, int p, int q) {
        int next[][] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int min = 9999999;

        if (x == p && y == q) {
            if (step < min) {
                min = step;
            }
            return 0;
        }

        return 0;
    }

}
