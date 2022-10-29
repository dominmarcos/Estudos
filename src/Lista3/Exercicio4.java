package Lista3;

public class Exercicio4 {
    public static void main(String[] args) {
        int[][] mat = new int[6][6];
        int[][] lin = new int[6][6];
        int[][] col = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int y = 0; y < 6; y++) {
                mat[i][y] = (int) (Math.random() * 10);
                lin[i][y] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int y = 0; y < 6; y++) {
                System.out.print(mat[i][y] + " ");
            }
            System.out.println("");
        }
        System.out.println("\n___________________________");
        for (int i = 0; i < 6; i++) {
            for (int y = 0; y < 6; y++) {
                System.out.print(lin[i][y] + " ");
            }
            System.out.println("");
        }
        System.out.println("\n___________________________");
        for (int i = 0; i < 6; i++) {
            for (int y = 0; y < 6; y++) {
                col[i][y] = lin[i][y]+mat[i][y];
            }
        }
        System.out.println("\nVetor resultado: ");
        for (int i = 0; i < 6; i++) {
            for (int y = 0; y < 6; y++) {
                if(col[i][y]<10){
                    System.out.print(" "+col[i][y] + " ");
                }else{
                    System.out.print(col[i][y] + " ");
                }
            }
            System.out.println("");
        }
    }
    
}
