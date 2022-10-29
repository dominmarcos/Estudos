package Exemplos;

import java.util.Scanner;

public class SeFudeu {

    public void SeFudeu() {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("SE FUDEU");
        System.out.println("Da pra jogar a culpa em alguém?");
        a = sc.nextInt();
        if (a == 1) {
            System.out.println("SEM PROBLEMAS");
        } else {
            System.out.println("SE FUDEU");
        }
    }
}
