package ListaMarcelo;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Digite a palavra:");
            Scanner sc = new Scanner(System.in);
            var palavra = sc.next();

            if (palavra.equals("exit"))
                break;

            System.out.println("Numero de caracteres - " + palavra.length());
            System.out.println("Maiusculo - " + palavra.toUpperCase());
            System.out.println("Quantidade de vogais - " + getTotalVogais(palavra));
            System.out.println("Começa com INS? - " + (palavra.toLowerCase().startsWith("ins") ? "Começa com ins" : "Não começa com ins"));
            System.out.println("Termina com TO? - " + (palavra.toLowerCase().endsWith("to") ? "Termina com TO" : "Não termina com TO"));
            System.out.println("Numeros na string - " + numerosNaString(palavra));
            System.out.println("Palindromo? - " + (palindromo(palavra) ? "Sim" : "Não"));
        }
    }

    private static boolean palindromo(String palavra) {
        return palavra.equals(new StringBuilder(palavra).reverse().toString());
    }

    private static long numerosNaString(String palavra) {
        var vogais = Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9');
        List<Character> palavraList = palavra.toLowerCase().chars().mapToObj(e -> (char) e).toList();
        return palavraList.stream().filter(vogais::contains).count();
    }

    private static long getTotalVogais(String palavra){
        var vogais = Arrays.asList('a', 'e', 'i', 'o', 'u');
        List<Character> palavraList = palavra.toLowerCase().chars().mapToObj(e -> (char) e).toList();
        return palavraList.stream().filter(vogais::contains).count();
    }
}
