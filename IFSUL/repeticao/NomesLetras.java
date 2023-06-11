package IFSUL.repeticao;

import java.util.Scanner;

public class NomesLetras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        for (int x = 0; x < nome.replace(" ", "").length(); x++){
            System.out.println(nome);
        }
    }
}
