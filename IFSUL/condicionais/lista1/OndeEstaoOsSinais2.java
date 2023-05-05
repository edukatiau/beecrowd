package IFSUL.condicionais.lista1;

import java.util.Scanner;

public class OndeEstaoOsSinais2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        if (numero > 0){
            System.out.println("POS");
        }
        else if (numero < 0){
            System.out.println("NEG");
        }
        else {
            System.out.println("ZERO");
        }
    }
}
