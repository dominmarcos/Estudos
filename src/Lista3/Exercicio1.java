package Lista3;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet1 = new int[5];
        int[] vet2 = new int[5];
        int[][] mat1 = new int[5][2];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero do primeiro vetor: ");
            vet1[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero do segundo vetor: ");
            vet2[i] = sc.nextInt();
        }
        for (int y = 0; y < 2; y++) {
            for (int i = 0; i < 5; i++) {
                if (y == 0) {
                    mat1[i][y] = vet1[i];
                }
                if (y == 1) {
                    mat1[i][y] = vet2[i];
                }
            }
        }
        System.out.println("______________________");
        for (int y = 0; y < 2; y++) {
            for (int i = 0; i < 5; i++) {
                System.out.print(mat1[i][y]+" ");
            }
            System.out.println("");
        }
    }
}


