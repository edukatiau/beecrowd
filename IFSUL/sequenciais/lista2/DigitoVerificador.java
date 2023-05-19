package IFSUL.sequenciais.lista2;

import java.util.Scanner;

//código dá errado com números que a soma com o inverso de maior que 999
public class DigitoVerificador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt(); //numero

        int num1 = numero/100; //index1
        int num2 = (numero%100)/10; //index2
        int num3 = ((numero%100)%10); //index3

        int numeroInvertido = (num3 * 100) + (num2 * 10) + num1;
        System.out.println(numeroInvertido);
        int passo1 = numero + numeroInvertido;
        System.out.println(passo1);
        int numInv1 = passo1/100; //index1
        int numInv2 = (passo1%100)/10; //index2
        int numInv3 = ((passo1%100)%10); //index3
        System.out.println(numInv1 + " " + numInv2 + " " + numInv3);
        int passo2 = (numInv1) + (numInv2 * 2) + (numInv3 * 3);
        System.out.println(passo2);
        int codigoVerificador = passo2%10;
        System.out.println(codigoVerificador);
    }
}
