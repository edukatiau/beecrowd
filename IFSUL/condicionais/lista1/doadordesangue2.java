package IFSUL.condicionais.lista1;

import java.util.Scanner;

public class doadordesangue2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        float peso = sc.nextFloat();

        if (peso >= 50.0){
            if (16 <= idade && idade <= 69){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        else {
            System.out.println("NO");
        }
    }
}
