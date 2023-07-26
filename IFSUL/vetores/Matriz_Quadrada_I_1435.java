package IFSUL.vetores;
import java.util.Scanner;
public class Matriz_Quadrada_I_1435 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidade = 0;
        int[] num = new int[105];

        while(true) {
            num[quantidade] = sc.nextInt();
            if(num[quantidade] == 0) {
                break;
            }
            else {
                quantidade += 1;
            }
        }
        for(int x = 0; x <= quantidade; x++) {
            for(int i = 0; i < num[x]; i++) {
                for(int j = 0; j < num[x]; j++) {
                    int tmp;
                    if (i < num[x]/2) {

                        tmp = i+1;
                    } else {
                        tmp = num[x]-i;
                    }
                    if (j<num[x]/2) {
                        if (j+1<tmp) {
                            tmp = j+1;
                        }
                    } else {
                        if (num[x]-j<tmp) {
                            tmp = num[x]-j;
                        }
                    }
                    if(j != num[x]-1) {
                        System.out.print("  " + tmp + " ");
                    } else {
                        System.out.println("  " + tmp);
                    }
                }
            }
            if (x < quantidade) {
                System.out.println();
            }
        }
    }
}
