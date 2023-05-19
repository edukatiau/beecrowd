package IFSUL.condicionais.lista7;

import java.util.Scanner;

public class PromocaoLivraria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int livros = sc.nextInt();

        double criterioA = (livros * 0.25) + 7.50;
        double criterioB = (livros * 0.50) + 2.50;

        if (criterioA < criterioB) {
            System.out.println("A");
        } else if (criterioA > criterioB) {
            System.out.println("B");
        } else {
            System.out.println("BOTH");
        }
    }
}
