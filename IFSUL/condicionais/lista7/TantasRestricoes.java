package IFSUL.condicionais.lista7;

import java.util.Scanner;

public class TantasRestricoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if(numero == 5){
            System.out.println("=5");
        } else if (numero == 200) {
            System.out.println("=200");
        } else if (numero == 400) {
            System.out.println("=400");
        } else if (numero >= 500 && numero <=1000) {
            System.out.println("[500,1000]");
        } else {
            System.out.println("NONE");
        }
    }
}