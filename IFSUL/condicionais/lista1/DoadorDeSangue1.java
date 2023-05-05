package IFSUL.condicionais.lista1;

import java.util.Scanner;

public class DoadorDeSangue1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();

        if (16 <= idade && idade <= 69){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
