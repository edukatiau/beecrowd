package Java;

import java.util.Scanner;

public class exercicio1003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        double pi = 3.14159;

        double area = pi * Math.pow(raio, 2.0);
        System.out.printf("A=%.4f\n", area);
        sc.close();
    }
}
