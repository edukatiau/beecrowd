package Java;
public class Main {
    public static void main(String[] args) {
        String[][] produtos = new String[5][3];
        limpaMatriz(produtos);

        cadastrarProduto(produtos, "1", "batata", "1.50");
        listarTabela(produtos);

        cadastrarProduto(produtos, "2", "lasanha", "4.00");
        listarTabela(produtos);

    }

    public static void limpaMatriz(String[][] matriz) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = "";
            }
        }
    }

    public static int cadastrarProduto(String[][] matriz, String id, String nome, String preco) {
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0].equals("")) {
                matriz[i][0] = id;
                matriz[i][1] = nome;
                matriz[i][2] = preco;
                System.out.println("Cadastrado com sucesso!");
                return 1;
            }
        }
        return 0;
    }

    public static void listarTabela(String[][] matriz) {
        System.out.println("------------------");
        System.out.println("| id   nome   preço |");
        for (int i = 0; i < 5; i++) {
            if(!matriz[i][0].equals("")){
                System.out.print("| ");
                System.out.printf("%s   %s   %s |\n", matriz[i][0], matriz[i][1], matriz[i][2]);
            }

        }
        System.out.println("------------------");
    }
}
