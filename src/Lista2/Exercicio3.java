package Lista2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int[] nu = new int[10];
        int[] n = new int[10];
        int a = 0, b = 0;
        for(int i = 0 ; i<10 ; i++){
            System.out.println("Digite um numero: ");
            num[i] = sc.nextInt();
        }
        for(int i = 0 ; i<10 ; i++){
            if(num[i]%2==0){
                nu[a] = num[i];
                a++;
            }else{
                n[b] = num[i];
                b++;
            }
        }
        System.out.println("Numeros pares: ");
        for(int i = 0 ; i<a ; i++){
            System.out.print(" "+nu[i]);
        }
        System.out.println("\nNumeros impares: ");
        for(int i = 0 ; i<b ; i++){
            System.out.print(" "+ n[i]);
        }
    }
    
}
