package IFSUL.repeticao;

import java.util.Scanner;

public class DivisoresDenise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if (n == 0){
                break;
            } else {
                for(int i = 1; i <= n; i++){
                    if(n==i){
                        System.out.print(i + "\n");
                    } else if(n%i==0){
                        System.out.print(i + ", ");
                    }
                }
            }
        }
    }
}
