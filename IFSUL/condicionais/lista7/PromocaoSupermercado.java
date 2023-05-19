package IFSUL.condicionais.lista7;

import java.util.Scanner;

public class PromocaoSupermercado {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int macas = sc.nextInt();
        double preco;

        if(macas < 12){
            preco = macas * 0.8;
        } else {
            preco = macas * 0.5;
        }
        System.out.printf("%.2f\n",preco);

    }
}