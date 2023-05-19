package IFSUL.condicionais.lista7;

import java.util.Scanner;

public class QuantoFaltaPros50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anoNascimento = sc.nextInt();
        int anoCompeticao = sc.nextInt();

        int idadeAnoCompeticao = anoCompeticao - anoNascimento;

        if(idadeAnoCompeticao >= 50){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
            System.out.println(50 - idadeAnoCompeticao);
        }
    }
}