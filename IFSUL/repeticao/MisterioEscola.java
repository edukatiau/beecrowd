package IFSUL.repeticao;

import java.util.Scanner;

public class MisterioEscola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pessoas = sc.nextInt();
        int menor = pessoas, maior = 0;
        for (int x = 0; x < pessoas; x++){
            int idade = sc.nextInt();
            if (idade>maior){
                maior = idade;
            } else if (idade<menor) {
                menor = idade;
            }
        }
        System.out.println(menor + "\n" + maior);
    }
}
