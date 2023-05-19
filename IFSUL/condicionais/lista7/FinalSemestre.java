package IFSUL.condicionais.lista7;

import java.util.Scanner;

public class FinalSemestre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double media = (n1+n2+n3)/3;

        if (media < 6){
            System.out.println("FAILED");
        } else if(media >= 6 && media <= 6.9){
            System.out.println("RETAKE");
        } else if(media >= 7 && media <= 8){
            System.out.println("APPROVED, BUT YOU CAN DO BETTER");
        } else if(media >= 8.1 && media <= 9.7){
            System.out.println("APPROVED");
        } else if(media >= 9.8 && media <= 10){
            System.out.println("APPROVED, CONGRATULATIONS");
        }
    }
}