package IFSUL.condicionais.lista7;

import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double altura = sc.nextDouble();
        String sexo = sc.next();
        double pesoIdeal;

        if (sexo.equals("man")){
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            pesoIdeal = (62.1 * altura) - 44.7;
        }
        System.out.printf("%.2f", pesoIdeal);
    }
}