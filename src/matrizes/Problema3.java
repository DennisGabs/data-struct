package matrizes;

public class Problema3 {
    public static void main(String[] args) {
        // problema3();
       // problema4();
        //problema5();
        problema7();
    }

    static void problema3(){
        int[][] mat = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};

        for (int i = 0; i < mat.length; i++) {
            for (int j = i; j < mat[i].length ; j++) {
                System.out.printf("%d ", mat[i][j]);
            }
            System.out.println();
        }
    }

    static void problema4(){
        int[][] mat = { {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9} };

        for (int i = 0; i < mat.length; i++) {
            for (int j = i + 1; j < mat[i].length ; j++) {
                System.out.printf("%d ", mat[i][j]);
            }
            System.out.println();
        }
    }

    static void problema5(){
        int[][] mat = { {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9} };

        for (int i = 0; i < mat.length; i++) {
            System.out.printf("%d - ", mat[i][i]);
        }
    }

    static void problema6(){
        int[][] mat = { {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9} };

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.printf("%d ", mat[j][i]);
            }
            System.out.println();
        }
    }

    static void problema7(){
        int[][] mat = { {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9} };

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length - i ; j++) {
                System.out.printf("%d ", mat[j][i]);
            }
            System.out.println();
        }
    }
}
