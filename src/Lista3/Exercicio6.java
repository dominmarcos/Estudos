package Lista3;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a dimenção da matriz quadrada:");
        int a = sc.nextInt();
        int[][] mat = new int[a][a];
        for(int i = 0 ; i<a ; i++){
            for(int j = 0 ; j < a ; j++){
                mat[i][j] = (int) (Math.random()*100);
                if(mat[i][j] < 10){
                    System.out.print("00"+ mat[i][j] +" ");
                }else{
                    
                
                    if(mat[i][j] < 100){
                        System.out.print("0"+ mat[i][j] +" ");
                    }else{
                        System.out.print(mat[i][j] +" ");
                    }
                }
            }
            System.out.println("");
        }
        double s = 0;
        for(int i = 0 ; i<a ; i++){
            for(int j = 0 ; j < a ; j++){
                if((i+j)>(a*2)-(a+1)){
                    s = s + mat[i][j];
                }
            }
        }
        System.out.println("Soma dos numeros abaixo da diagonal secundaria: "+s);
    }
}
