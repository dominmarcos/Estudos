package BatalhaNaval;

import java.util.Scanner;

public class BatalhaNaval {

    public static void main(String[] args) {
        String[][] mat = BatalhaNaval.gerarTabuleiro();
        String[][] mat1 = BatalhaNaval.gerarTabuleiro();
        String[][] mat2 = BatalhaNaval.gerarTabuleiro();
        mat = BatalhaNaval.distribuirArmas(mat);
        mat1 = BatalhaNaval.distribuirArmas(mat1);
        System.out.println("Regras: \nVocê tem 30 tiros, seu objetivo é afundar todas as embarcações do inimigo."
                + "\nVocês dois tem 3 submarinos dois cruzadores e um hidroavião cada, o computador é bem buro... "
                + "\nBoa sorte!");
        int wlc = 0, wlp = 0;
        for (int l = 30; l >= 0;) {
            wlc = 0;
            wlp = 0;
            System.out.println("Matriz Alvo: ");
            System.out.println("    0  1  2  3  4  5  6  7  8  9");
            System.out.println("    |  |  |  |  |  |  |  |  |  |");
            for (int i = 0; i < 10; i++) {
                System.out.print(i + "- ");
                for (int j = 0; j < 10; j++) {
                    System.out.print(mat2[i][j]);
                }
                System.out.println("");
            }
            System.out.println("");
            //========================================================================

            System.out.println("Sua matriz: ");
            System.out.println("    0  1  2  3  4  5  6  7  8  9");
            System.out.println("    |  |  |  |  |  |  |  |  |  |");
            for (int i = 0; i < 10; i++) {
                System.out.print(i + "- ");
                for (int j = 0; j < 10; j++) {
                    System.out.print(mat[i][j]);
                }
                System.out.println("");
            }
            System.out.println("");
            //========================================================================

            mat1 = BatalhaNaval.verificarTiro(mat1, 0);
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (mat1[i][j].equals("|E|")) {
                        mat2[i][j] = "|E|";
                    }
                    if (mat1[i][j].equals("|X|")) {
                        mat2[i][j] = "|X|";
                    }
                }
            }
            //========================================================================
            System.out.println("Vez do computador...");
            mat = BatalhaNaval.verificarTiro(mat, 1);
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (mat[i][j].equals("|W|")) {
                        wlp++;
                    }
                }
            }
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (mat1[i][j].equals("|W|")) {
                        wlc++;
                    }
                }
            }
            if (wlc == 0) {
                System.out.println("Player venceu por afundar todas armasinimigas.");
            }
            if (wlp == 0) {
                System.out.println("Computador venceu por afundar todas armasinimigas.");
            }
            l--;
        }
        if (wlc > wlp) {
            System.out.println("Computador venceu por ter mais armas em jogo.");
        }
        if (wlc < wlp) {
            System.out.println("Player venceu por ter mais armas em jogo.");
        }
        if (wlc == wlp) {
            System.out.println("Empate");
        }
    }

    public static String[][] gerarTabuleiro() {
        String[][] matc = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matc[i][j] = "|_|";
            }
        }
        return matc;
    }

    public static String[][] distribuirArmas(String[][] mat) {
        mat = submarino(mat);
        mat = submarino(mat);
        mat = submarino(mat);
        mat = cruzador(mat);
        mat = cruzador(mat);
        mat = hidroaviao(mat);
        return mat;
    }

    public static String[][] submarino(String[][] mat) {
        int z = 9;
        int a = 0, b = 0;
        while (z > 0) {
            z = 9;
            a = (int) (Math.random() * 10);
            b = (int) (Math.random() * 10);
            if (a > 0 && a < 9 && b > 0 && b < 9) {
                for (int i = -1; i < 2; i++) {
                    for (int j = -1; j < 2; j++) {
                        if (mat[a + i][b + j].equals("|_|")) {
                            z--;
                        }
                    }
                }
            }
        }
        mat[a][b] = "|W|";
        return mat;
    }

    public static String[][] cruzador(String[][] mat) {
        int z = 12, a = 0, b = 0;
        while (z > 0) {
            z = 12;
            a = (int) (Math.random() * 10);
            b = (int) (Math.random() * 10);
            if (a > 0 && a < 9 && b > 0 && b < 8) {
                for (int i = -1; i < 2; i++) {
                    for (int j = -1; j < 3; j++) {
                        if (mat[a + i][b + j].equals("|_|")) {
                            z--;
                        }
                    }
                }
            }
        }
        mat[a][b] = "|W|";
        mat[a][b + 1] = "|W|";
        return mat;
    }

    public static String[][] hidroaviao(String[][] mat) {
        int z = 20, a = 0, b = 0;
        while (z > 0) {
            z = 20;
            a = (int) (Math.random() * 10);
            b = (int) (Math.random() * 10);
            if (a > 1 && a < 9 && b > 0 && b < 7) {
                for (int i = -2; i < 2; i++) {
                    for (int j = -1; j < 4; j++) {
                        if (mat[a + i][b + j].equals("|_|")) {
                            z--;
                        }
                    }
                }
            }
        }
        mat[a][b] = "|W|";
        mat[a - 1][b + 1] = "|W|";
        mat[a][b + 2] = "|W|";
        return mat;

    }

    public static String[][] verificarTiro(String[][] mat, int x) {
        int a, b;
        if (x == 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Coordenadas do tiro:");
            a = sc.nextInt();
            b = sc.nextInt();
        } else {
            a = (int) (Math.random() * 10);
            b = (int) (Math.random() * 10);
        }
        if (a >= 0 && a <= 9 && b > -1 && b < 10) {
            if (mat[a][b].equals("|W|")) {
                System.out.println("Tiro Certeiro");
                mat[a][b] = "|X|";
            }
            if (mat[a][b].equals("|_|")) {
                System.out.println("Tiro Errado");
                mat[a][b] = "|E|";
            }
            if (mat[a][b].equals("|X|") || mat[a][b].equals("|E|")) {
                System.out.println("Ta atirando no mesmo lugar animal!");
            }

        }
        return mat;
    }
}
