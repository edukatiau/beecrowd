package IFSUL.condicionais.lista1;

import java.util.Scanner;

public class AlunosDePatricia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        if (numero % 2 == 0){
            System.out.println("EVEN");
        }
        else {
            System.out.println("ODD");
        }
    }
}
