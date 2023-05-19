package IFSUL.condicionais.lista7;

import java.util.Scanner;

public class TemMadeiraSuficiente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int madeiras = sc.nextInt();

        if (madeiras > 30){
            System.out.println(">30");
        } else if(madeiras < 30){
            System.out.println("<30");
        } else {
            System.out.println("=30");
        }
    }
}
