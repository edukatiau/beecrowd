package IFSUL.repeticao;

import java.util.Scanner;

public class Nickname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int x = 0; x < 10; x++){
            String nick = sc.next();
            System.out.println(nick.length());
        }
    }
}
