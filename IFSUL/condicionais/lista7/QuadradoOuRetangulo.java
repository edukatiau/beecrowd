package IFSUL.condicionais.lista7;

import java.util.Scanner;

public class QuadradoOuRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base = sc.nextDouble();
        double altura = sc.nextDouble();

        if( base == altura) {
            System.out.println("SQUARE");
        } else {
            System.out.println("RECTANGLE");
        }
    }
}