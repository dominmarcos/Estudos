package Lista2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[15];
        for(int i = 0; i<15 ; i++){
            System.out.println("Digite um numero: ");
            num[i] = sc.nextInt();
        }
        int a = 0;
        for(int i = 0; i<15 ; i++){
            a = num[i] + a;
        }
        a = a/15;
        System.out.println("Media = "+a);
    }
    
}
