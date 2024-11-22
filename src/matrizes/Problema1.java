package matrizes;

import java.util.ArrayList;
import java.util.List;

public class Problema1 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},{4, 5, 6}, {7, 8, 9}};
        List novoArr = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                novoArr.add(arr[i][j]);
            }
        }

        System.out.println(novoArr);
    }
}
