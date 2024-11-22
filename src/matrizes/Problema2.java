package matrizes;

public class Problema2 {
    public static void main(String[] args) {
        problema2();
    }

    static void problema2(){
        int[][] mat = {{1, 2, 3},{4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%d ", mat[i][j]);
            }
            System.out.println();
        }
    }
}
