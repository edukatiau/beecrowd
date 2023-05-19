package IFSUL.condicionais.lista7;

import java.util.Scanner;

public class AprovadoOuReprovado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();
        double n5 = sc.nextDouble();

        double media = (n1+n2+n3+n4+n5)/5;

        if (media >= 6){
            System.out.println("APPROVED");
        } else {
            System.out.println("RETAKE");
        }
        System.out.printf("%.2f\n", media);
    }
}