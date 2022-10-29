package Lista1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        int[] num = new int[5];
        int[] nu = new int[5];
        int[] n = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<5;i++){
            System.out.println("Digite um numero para o primeiro vetor: ");
            num[i] = sc.nextInt();
        }
        for(int i = 0;i<5;i++){
            System.out.println("Digite um numero para o segundo vetor: ");
            nu[i] = sc.nextInt();
        }
        System.out.println("Vetor resultado:");
        for(int i = 0;i<5;i++){
            n[i] = num[i]*nu[i];
            System.out.print(n[i]+" - ");
        }
    }
    
}
