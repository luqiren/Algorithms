package design;

public class InvertImage {
    public static void main (String[] args) {
        int[][] a = {{1,1,0},{1,0,1},{0,0,0}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        int[][] b = flipAndInvertImage(a);
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] flipAndInvertImage(int[][] A) {
        for (int index = 0; index < A.length; index++) {
            int i = 0, j = A[index].length - 1;
            while (i <= j) {
                int temp = A[index][i];
                A[index][i] = A[index][j]^1;
                A[index][j] = temp^1;
                i++;
                j--;
            }
        }
        return A;
    }
}
