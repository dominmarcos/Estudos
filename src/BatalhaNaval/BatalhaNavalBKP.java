package BatalhaNaval;

import java.util.Scanner;

public class BatalhaNavalBKP {

    static int l = 30;
    static String[][] mat = new String[17][17], mat1 = new String[17][17], mat2 = new String[17][17];
    static int wlc, wlp;
    static String err = "\033[42m / \033[m";
    static String ace = "\033[41m X \033[m";
    static String mar = "\033[44m ~ \033[m";
    static String arm = "\033[45m W \033[m";

    public static void main(String[] args) throws InterruptedException {
        BatalhaNavalBKP.gerarTabuleiro(mat);
        BatalhaNavalBKP.gerarTabuleiro(mat1);
        BatalhaNavalBKP.gerarTabuleiro(mat2);
        BatalhaNavalBKP.distribuirArmas(mat);
        BatalhaNavalBKP.distribuirArmas(mat1);
        System.out.println("Regras: \nVocê tem 30 tiros, seu objetivo é afundar todas as embarcações do inimigo."
                + "\nVocês tem ambos: 5 submarinos, 4 cruzadores, 3 hidroaviões e 2 porta-aviões"
                + "\nO computador é bem burro, boa sorte."
                + "\nSeus acertos são marcados em vermelho e os erros em verde"
                + "\nSuas armas estão em rosa na matriz esquerda"
                + "\n\nExemplos de armas:"
                + "\nSubmarino:"
                + arm
                + "\n\n"
                + "Cruzador: "
                + arm + arm
                + "\n\n"
                + "              " + arm
                + "\nHidroavião:" + arm + "   " + arm
                + "\n\nPorta-avoões:"
                + arm + arm + arm + arm);
        for (l = 30; l >= 0;) {
            System.out.println("                                             Tiros Restantes: " + l);
            System.out.println("");
            System.out.println("===================================================================================================================");
            System.out.println("== Sua matriz:                                           ==    Matriz Alvo:                                      ==");
            System.out.println("==      1  2  3  4  5  6  7  8  9 10 11 12 13 14 15      ==         1  2  3  4  5  6  7  8  9 10 11 12 13 14 15  ==");
            System.out.println("==      |  |  |  |  |  |  |  |  |  |  |  |  |  |  |      ==         |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  ==");
            for (int i = 1; i < 16; i++) {
                if (i < 10) {
                    System.out.print("== " + i + "-  ");
                }
                if (i > 9) {
                    System.out.print("== " + i + "- ");
                }
                for (int j = 1; j < 16; j++) {
                    System.out.print(mat[i][j]);
                }
                if (i < 10) {
                    System.out.print("     ==    " + i + "-  ");
                }
                if (i > 9) {
                    System.out.print("     ==    " + i + "- ");
                }
                for (int j = 1; j < 16; j++) {
                    System.out.print(mat2[i][j]);
                }
                System.out.println(" ==");
            }
            System.out.println("===================================================================================================================");
            verificarTiro(mat1, 0);
            for (int i = 0; i < 17; i++) {
                for (int j = 0; j < 17; j++) {
                    if (mat1[i][j].equals(err)) {
                        mat2[i][j] = err;
                    }
                    if (mat1[i][j].equals(ace)) {
                        mat2[i][j] = ace;
                    }
                }
            }
            System.out.println("===================================================================================================================");
            System.out.println("                                             Vez do computador...");
            verificarTiro(mat, 1);
            verificarFimJogo(mat, 0);
            verificarFimJogo(mat1, 1);
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
        System.out.println(wlc + wlp);
    }

    public static void verificarFimJogo(String[][] mattrab, int x) {
        int wl = 0;
        for (int i = 1; i < 16; i++) {
            for (int j = 1; j < 16; j++) {
                if (mattrab[i][j].equals(arm)) {
                    wl++;
                }
            }
        }
        if (x == 1) {
            wlc = wl;
        }
        if (x == 0) {
            wlp = wl;
        }
        if (wl == 0 && x == 1) {
            System.out.println("Player venceu por afundar todas armasinimigas.");
        }
        if (wl == 0 && x == 0) {
            System.out.println("Computador venceu por afundar todas armasinimigas.");
        }
    }

    public static void gerarTabuleiro(String[][] mattrab) {
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 17; j++) {
                mattrab[i][j] = mar;
            }
        }
    }

    public static void distribuirArmas(String[][] mattrab) {
        int z = 20, a = 0, b = 0;
        for (int s = 0; s < 3; s++) {
            z++;
            while (z > 0) {
                z = 20;
                a = (int) (Math.random() * 14) + 2;
                b = (int) (Math.random() * 13) + 1;
                for (int i = -2; i < 2; i++) {
                    for (int j = -1; j < 4; j++) {
                        if (mattrab[a + i][b + j].equals(mar)) {
                            z--;
                        }
                    }
                }
            }

            mattrab[a][b] = arm;
            mattrab[a - 1][b + 1] = arm;
            mattrab[a][b + 2] = arm;
        }
        for (int i = 0; i < 2; i++) {
            z = 18;
            a = 0;
            b = 0;
            while (z > 0) {
                z = 18;
                a = (int) (Math.random() * 15) + 1;
                b = (int) (Math.random() * 12) + 1;
                for (int k = -1; k < 2; k++) {
                    for (int j = -1; j < 5; j++) {
                        if (mattrab[a + k][b + j].equals(mar)) {
                            z--;
                        }
                    }
                }
            }
            mattrab[a][b] = arm;
            mattrab[a][b + 1] = arm;
            mattrab[a][b + 2] = arm;
            mattrab[a][b + 3] = arm;
        }
        for (int i = 0; i < 5; i++) {
            z = 9;
            a = 0;
            b = 0;
            while (z > 0) {
                z = 9;
                a = (int) (Math.random() * 15) + 1;
                b = (int) (Math.random() * 15) + 1;
                if (a > 0 && a < 16 && b > 0 && b < 16) {
                    for (int k = -1; k < 2; k++) {
                        for (int j = -1; j < 2; j++) {
                            if (mattrab[a + k][b + j].equals(mar)) {
                                z--;
                            }
                        }
                    }
                }
            }
            mattrab[a][b] = arm;
        }
        for (int i = 0; i < 4; i++) {
            z = 12;
            a = 0;
            b = 0;
            while (z > 0) {
                z = 12;
                a = (int) (Math.random() * 15) + 1;
                b = (int) (Math.random() * 14) + 1;
                for (int k = -1; k < 2; k++) {
                    for (int j = -1; j < 3; j++) {
                        if (mattrab[a + k][b + j].equals(mar)) {
                            z--;
                        }
                    }
                }
            }
            mattrab[a][b] = arm;
            mattrab[a][b + 1] = arm;
        }

    }

    public static void verificarTiro(String[][] mattrab, int x) throws InterruptedException {
        int a, b;
        if (x == 0) {
//            Scanner sc = new Scanner(System.in);
            System.out.println("                                             Coordenadas do tiro:");
            System.out.print("                                                ->");
//            a = sc.nextInt();
            Thread.sleep(1000);
            a = (int) (Math.random() * 15) + 1;
            b = (int) (Math.random() * 15) + 1;
            System.out.print("                                                ->");
//            b = sc.nextInt();
        } else {
            a = (int) (Math.random() * 15) + 1;
            b = (int) (Math.random() * 15) + 1;
        }
        if (a >= 1 && a <= 16 && b > 0 && b < 16) {
            if (mattrab[a][b].equals(arm)) {
                System.out.println("                                             Tiro Certeiro");
                mattrab[a][b] = ace;
            } else {
                if (mattrab[a][b].equals(mar)) {
                    System.out.println("                                             Tiro Errado");
                    mattrab[a][b] = err;
                } else {
                    System.out.println("                                             Atirou no mesmo lugar.");
                    l++;
                }
            }
        } else {
            System.out.println("                                             Coordenada fora de alcance.");
            l++;
        }
    }
}
