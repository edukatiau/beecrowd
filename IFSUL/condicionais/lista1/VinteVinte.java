package IFSUL.condicionais.lista1;

import java.util.Scanner;

public class VinteVinte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();

        //idade
        if (idade > 20) {
            System.out.println("ABEND");
        } else if (idade < 20) {
            System.out.println("TAG");
        } else {
            System.out.println("VIP");
        }
    }
}
