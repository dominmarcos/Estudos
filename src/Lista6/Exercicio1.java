package Lista6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exercicio1 {
    public static void main(String[] args) throws FileNotFoundException {
        File arq1 = new File("D:/ADS/Prog1/Entrada1.txt");
        FileReader dl1 = new FileReader(arq1);
        BufferedReader bf1 = new BufferedReader(dl1);
    }
    
}
