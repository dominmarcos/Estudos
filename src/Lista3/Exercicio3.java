package Lista3;

public class Exercicio3 {
    public static void main(String[] args) {
        int[][] mat = new int[6][6];
        int[] lin = new int[6];
        int[] col = new int[6];
        for (int i = 0; i < 6; i++) {
            for (int y = 0; y < 6; y++) {
                mat[i][y] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int y = 0; y < 6; y++) {
                System.out.print(mat[i][y] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < 6; i++) {
            int z = 0;
            for (int y = 0; y < 6; y++) {
                z = z + mat[i][y];
            }
            lin[i] = z;
        }
        for (int i = 0; i < 6; i++) {
            int z = 0;
            for (int y = 0; y < 6; y++) {
                z = z + mat[y][i];
            }
            col[i] = z;
        }
        System.out.println("\n_____________________\nSoma das linhas: ");
        for(int i = 0; i < 6; i++){
            System.out.print(lin[i]+" ");
        }
        System.out.println("\n_____________________\nSoma das Colunas");
        for(int i = 0; i < 6; i++){
            System.out.print(col[i]+" ");
        }
    }
}
