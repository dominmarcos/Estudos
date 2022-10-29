package Lista1;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        int[] nu = new int[5];
        int a = 0, b = 0;
        while(a<5&&b<5){
            System.out.println("Digite um numero: ");
            int c = sc.nextInt();
            if(c%2==0){
                for(int i = 0; i<5 ;i++){
                    num[i]=c;
                }
                a++;
            }else{
                for(int i = 0; i<5 ;i++){
                    nu[i]=c;
                }
                b++;
            }
        }
        if(b==5){
            System.out.println("Vetor impar cheio.");
        }
        if(a==5){
            System.out.println("Vetor par cheio.");
        }
    }
}
