package BatalhaNaval;

import java.util.Scanner;

public class BatalhaNavalEnt {

    static String[][] mat1 = new String[10][10], mat2 = new String[10][10];
    static int wlc, wlp;
    static int wl = 0;

    public static void main(String[] args) {
        gerarTabuleiro();
        distribuirArmas();
        System.out.println("Regras: \nVocê tem 30 tiros, seu objetivo é afundar todas as embarcações do inimigo."
                + "\nEle tem 3 submarinos dois cruzadores e um hidroavião" + "\nBoa sorte!");
        for (int l = 30; l >= 0;) {
            System.out.println("========================================================================");
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
            System.out.println("========================================================================");
            System.out.println("Tiros restantes: " + l);
            BatalhaNavalEnt.verificarTiro();
            l--;
        }
        if (wl != 0) {
            System.out.println("Você perdeu!");
        }
    }

    public static void verificarFimJogo() {
        wl = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (mat1[i][j].equals("|W|")) {
                    wl++;
                }
            }
        }
        if (wl == 0) {
            System.out.println("Player venceu por afundar todas armasinimigas.");
        }
    }

    public static void gerarTabuleiro() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                mat1[i][j] = "|_|";
                mat2[i][j] = "|_|";
            }
        }
    }

    public static void distribuirArmas() {
        int z = 1, a = 0, b = 0;
        for (int i = 0; i < 3; i++) {
            z = 9;
            while (z > 0) {
                z = 9;
                a = (int) (Math.random() * 10);
                b = (int) (Math.random() * 10);
                if (a > 0 && a < 9 && b > 0 && b < 9) {
                    for (int k = -1; k < 2; k++) {
                        for (int j = -1; j < 2; j++) {
                            if (mat1[a + k][b + j].equals("|_|")) {
                                z--;
                            }
                        }
                    }
                }
            }
            mat1[a][b] = "|W|";
        }
        for (int i = 0; i < 2; i++) {
            z++;
            while (z > 0) {
                z = 12;
                a = (int) (Math.random() * 10);
                b = (int) (Math.random() * 10);
                if (a > 0 && a < 9 && b > 0 && b < 8) {
                    for (int k = -1; k < 2; k++) {
                        for (int j = -1; j < 3; j++) {
                            if (mat1[a + k][b + j].equals("|_|")) {
                                z--;
                            }
                        }
                    }
                }
            }
            mat1[a][b] = "|W|";
            mat1[a][b + 1] = "|W|";
        }
        z++;
        while (z > 0) {
            a = (int) (Math.random() * 10);
            b = (int) (Math.random() * 10);
            if (a > 1 && a < 9 && b > 0 && b < 7) {
                for (int i = -2; i < 2; i++) {
                    for (int j = -1; j < 4; j++) {
                        if (mat1[a + i][b + j].equals("|_|")) {
                            z--;
                        }
                    }
                }
            }
        }
        mat1[a][b] = "|W|";
        mat1[a - 1][b + 1] = "|W|";
        mat1[a][b + 2] = "|W|";
    }

    public static void verificarTiro() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Coordenadas do tiro:");
        a = sc.nextInt();
        b = sc.nextInt();
        if (a >= 0 && a <= 9 && b > -1 && b < 10) {
            if (mat1[a][b].equals("|W|")) {
                System.out.println("Tiro Certeiro");
                mat1[a][b] = "|X|";
                mat2[a][b] = "|X|";
            } else {
                if (mat1[a][b].equals("|_|")) {
                    System.out.println("Tiro Errado");
                    mat1[a][b] = "|E|";
                    mat2[a][b] = "|E|";
                } else {
                    System.out.println("Atirou no mesmo lugar.");
                }
            }
        }
    }
}
