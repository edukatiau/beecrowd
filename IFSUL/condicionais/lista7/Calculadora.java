package IFSUL.condicionais.lista7;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String operador = sc.next();
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double resultado;

        if(operador.equals("+")){
            resultado = A+B;
            System.out.printf("%.2f\n", resultado);
        } else if(operador.equals("-")){
            resultado = A-B;
            System.out.printf("%.2f\n", resultado);
        } else if(operador.equals("*")){
            resultado = A*B;
            System.out.printf("%.2f\n", resultado);
        } else if(operador.equals("/")){
            resultado = A/B;
            System.out.printf("%.2f\n", resultado);
        } else{
            System.out.println("ERROR");
        }
    }
}