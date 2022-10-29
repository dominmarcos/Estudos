package Lista1;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int a = 0;
        for(int i = 0; i<10; i++){
            System.out.println("Digite um numero:");
            num[i] = sc.nextInt();
        }
        for(int i = 0; i<10; i++){
            System.out.print(num[i]+" ");
            if(num[i]%2==0){
                a++;
            }
        }
        System.out.println("\nExistem "+a+" numeros pares no vetor.");
    }
}
