package IFSUL.condicionais.lista2;

import java.util.Scanner;

public class CapitalBrasil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String C1 = sc.nextLine();

        if (C1.equals("Brasília")) {
            System.out.println("CORRECT!");
        } else {
            System.out.println("2 CHANCES.");
            String C2 = sc.nextLine();
            if (C2.equals("Brasília")) {
                System.out.println("CORRECT!");
            } else {
                System.out.println("1 CHANCE.");
                String C3 = sc.nextLine();
                if (C3.equals("Brasília")) {
                    System.out.println("CORRECT!");
                } else {
                    System.out.println("END OF PROGRAM.");
                }
            }
        }
    }
}
