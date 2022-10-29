package Lista2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[10];
        int[] ve = new int[10];
        int b = 0;
        for(int i = 0; i<10 ; i++){
            boolean a = true;
            System.out.println("Digite um numero: ");
            int z = sc.nextInt();
            for(int y = 0; y<10 ; y++){
                if(z == ve[y]){
                    a = false;
                    vet[y]++;
                }
            }
            if(a){
                ve[b] = z;
                b++;
            }
        }
        for(int i = 0; i<10 ; i++){
            if(ve[i]!= 0){
                System.out.println("Numero "+ve[i]+" se repete "+(vet[i]+1)+" vezes.");
            }
        }
    }
}
