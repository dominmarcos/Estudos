package Lista4;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[12];
        for(int i = 0; i<12 ; i++){
            System.out.println("Digite um numero: ");
            vet[i] = sc.nextInt();
        }
        System.out.println("Diga um numero:");
        int a = sc.nextInt();
        System.out.println("Diga um numero:");
        int b = sc.nextInt();
        int s = vet[a+1]+vet[b+1];
        System.out.println("Resultado "+s);
    }
    
    
}
