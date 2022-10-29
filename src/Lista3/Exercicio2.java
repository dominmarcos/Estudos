package Lista3;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int y = 0; y < 4; y++) {
                mat[i][y] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int y = 0; y < 4; y++) {
                System.out.print(mat[i][y] + " ");
            }
            System.out.println("");
        }
        System.out.println("Diagonal: ");
        for (int i = 0, y = 0; i < 4; i++, y++) {
            System.out.print(mat[i][y] + " ");
        }
    }
}
