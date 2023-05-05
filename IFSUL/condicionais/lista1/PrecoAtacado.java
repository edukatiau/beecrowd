package IFSUL.condicionais.lista1;

import java.util.Scanner;

public class PrecoAtacado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        if (numero >= 20){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
