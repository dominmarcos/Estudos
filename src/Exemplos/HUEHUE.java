package Exemplos;

import java.util.Scanner;

public class HUEHUE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SeFudeu sf = new SeFudeu();
        int a;
        System.out.println("Responda com 1 para 'Sim' e 2 para 'Não'");
        System.out.println("A bagaça funciona?");
        a = sc.nextInt();
        if (a == 1) {
            System.out.println("Nem rela.");
            System.out.println("SEM PROBLEMAS");
        } else {
            System.out.println("Vc que fudeu com o treco?");
            a = sc.nextInt();
            if (a == 1) {
                System.out.println("Seu imbecil.");
                System.out.println("Alguem sabe que foi você?");
                a = sc.nextInt();
                if (a == 1) {
                    sf.SeFudeu();
                } else {
                    System.out.println("Esconda");
                    System.out.println("SEM PROBLEMAS");
                }
            } else {
                System.out.println("Alguém pode te culpar?");
                a = sc.nextInt();
                if (a == 1) {
                    sf.SeFudeu();
                }else{
                    System.out.println("Entao foda-se");
                    System.out.println("SEM PROBLEMAS");
                }
            }
        }
    }
}
