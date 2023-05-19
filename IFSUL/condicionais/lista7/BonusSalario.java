package IFSUL.condicionais.lista7;

import java.util.Scanner;

public class BonusSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tempoEmpregado = sc.nextInt();
        double salario = sc.nextDouble();
        double novoSalario;
        double bonus;

        if(tempoEmpregado >= 5){
            bonus = (salario*20)/100;
        } else {
            bonus = (salario*10)/100;
        }
        novoSalario = salario + bonus;
        System.out.printf("%.2f\n", novoSalario);
    }
}