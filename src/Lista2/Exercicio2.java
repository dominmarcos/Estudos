package Lista2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) throws IOException {
        String[] nome = new String[10];
        int[] num = new int[10];
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0 ; i<10 ; i++){
            System.out.println("Digite seu nome: ");
            nome[i] = bf.readLine();
            System.out.println("Digite sua idade: ");
            num[i] = sc.nextInt();
        }
        int a = 0, b = 0;
        for(int i = 0 ; i<10 ; i++){
            a = Math.max(a, num[i]);
            if(num[i] == a)
                b = i;
        }
        System.out.println("Pessoa mais velha: "+nome[b]+" Idade: "+a);
    }
}
