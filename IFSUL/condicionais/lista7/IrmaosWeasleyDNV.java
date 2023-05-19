package IFSUL.condicionais.lista7;

import java.util.Scanner;

public class IrmaosWeasleyDNV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ano1 = sc.nextInt();
        int ano2 = sc.nextInt();
        int ano3 = sc.nextInt();

        if(ano1 != ano2 && ano1 != ano3 && ano2 != ano3){
            System.out.println("SIBLINGS");
        } else {
            if(ano1 == ano2 && ano1 == ano3) {
                System.out.println("TRIPLETS");
            } else {
                System.out.println("TWINS");
            }
        }
    }
}