package Lista2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        int[] nu = new int[5];
        int[] n = new int[5];
        for(int i = 0 ; i<5 ; i++){
            System.out.println("Digite um numero para o primeiro vetor: ");
            num[i] = sc.nextInt();
        }
        for(int i = 0 ; i<5 ; i++){
            System.out.println("Digite um numero para o segundo vetor: ");
            nu[i] = sc.nextInt();
        }
        for(int i = 0 ; i<5 ; i++){
            n[i] = nu[4-i] - num[i];
        }
        System.out.println("Vetor resultado: ");
        for(int i = 0 ; i<5 ; i++){
            System.out.println(" "+n[i]);
        }
    }
    
}
