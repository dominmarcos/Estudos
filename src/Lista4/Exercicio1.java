package Lista4;

public class Exercicio1 {

    public static void main(String[] args) {
        int[][] vet1 = new int[3][6];
        int[][] vet2 = new int[6][3];
        int[][] vet3 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int y = 0; y < 6; y++) {
                vet1[i][y] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Matriz 1:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(vet1[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < 6; i++) {
            for (int y = 0; y < 3; y++) {
                vet2[i][y] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Matriz 2:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(vet2[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 6; k++) {
                    vet3[i][j] += vet1[i][k] * vet2[k][j];
                }
            }
        }
        System.out.println("");
        System.out.println("Matriz resultado: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(vet3[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
