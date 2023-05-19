package IFSUL.condicionais.lista7;

import java.util.Scanner;

public class ShowHarryStyles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ano = sc.nextInt();
        int idade = 2022 - ano;
        if(1900 < ano && ano < 2022){
            if(idade >= 16){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            System.out.println(idade);
        } else {
            System.out.println("ERROR");
        }
    }
}