package IFSUL.condicionais.lista7;

import java.util.Scanner;

public class QualConjugacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String verbo = sc.next();

        if (verbo.endsWith("ar")){
            System.out.println("1");
        } else if (verbo.endsWith("er")) {
            System.out.println("2");
        } else if (verbo.endsWith("ir")) {
            System.out.println("3");
        } else{
            System.out.println("NONE");
        }
    }
}
