package Lista1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int[] num = new int[10];
        Scanner sc = new Scanner(System.in);
        int a, b;
        for(int i = 0; i<10; i++){
            System.out.println("Digite um numero:");
            num[i] = sc.nextInt();
        }
        a = b = num[0];
        for(int i = 1; i<10;i++){
            a = Math.max(a, num[i]);
            b = Math.min(num[i], b);
        }
        System.out.println("Maior: "+a+"\nMenor: "+b);
    }
}
