package IFSUL.repeticao;

import java.util.Scanner;

public class MisterioEscola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pessoas = sc.nextInt();
        int primeiraIdade = sc.nextInt();
        int menor = primeiraIdade;
        int maior = primeiraIdade;

        for (int x = 1; x < pessoas; x++) {
            int idade = sc.nextInt();

            if (idade > maior) {
                maior = idade;
            }

            if (idade < menor) {
                menor = idade;
            }
        }
        System.out.println(menor + "\n" + maior);
    }
}
