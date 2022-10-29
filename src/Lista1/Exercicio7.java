package Lista1;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        int[] num = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<10 ; i++){
            System.out.println("Insira um numero: ");
            num[i] = sc.nextInt();
        }
        for(int i = 0; i<10 ; i++){
            System.out.print(num[i]+ " - ");
        }
        System.out.println("\n");
        for(int i = 0; i<5 ; i++){
            int c = num[9-i];
            num[9-i] = num[i];
            num[i] = c;
        }
        for(int i = 0; i<10 ; i++){
            System.out.print(num[i]+ " - ");
        }
    }    
}
