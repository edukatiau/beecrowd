package IFSUL.repeticao;

import java.util.Scanner;

public class GastosAna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double gasto = 0, ganho = 0;

        for(int x = 0; x < 20; x++){
            double valor = sc.nextDouble();
            if(valor > 0){
                ganho += valor;
            } else {
                gasto += valor;
            }
        }

        System.out.printf("%.2f\n%.2f\n", ganho, gasto);
    }
}