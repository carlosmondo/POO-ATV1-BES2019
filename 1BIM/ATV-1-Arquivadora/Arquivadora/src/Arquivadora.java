import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Arquivadora {

    public static void criaGenero(String texto1, String matrizGenero [][]){
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < matrizGenero.length; i++) {
            for (int j = 0; j < matrizGenero[i].length; j++) {
                System.out.printf(texto1);
                matrizGenero[i][j] = keyboard.next();
            }
        }
    }
    public static void forEncadeado(@NotNull int matrizGaveteiro [][], String matrizGenero [][]){
        for(int i = 0; i < matrizGaveteiro.length; i++){
            for(int j = 0; j < matrizGaveteiro[i].length; j++){
                System.out.print("" + matrizGenero[i][j]  + " = " + matrizGaveteiro[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int opcao = 0, linha = 0, coluna = 0, quantidadeArquivos = 0;
        int gaveteiro [][] = new int [2][2];
        String genero [][] = new String [2][2];
        String nomeGenero;

        boolean mantem = true, achou = false;

        criaGenero("Infome o gênero literarito: ", genero);

        do{
            System.out.print("\n- Opções -\n" +
                    "1 - Visualizar Arquivadora\n" +
                    "2 - Armazenar Arquivos\n" +
                    "3 - EXIT\n" +
                    "- Opção: ");
            opcao = keyboard.nextInt();

            switch(opcao){
                case 1:
                    forEncadeado(gaveteiro, genero);
                    break;

                case 2:
                    System.out.print("Informe a quantidade de Livros que deseja arquivar: ");
                    quantidadeArquivos = keyboard.nextInt();
                    System.out.print("Informe o gênero literario respectivo dos livros: ");
                    nomeGenero = keyboard.next();

                    for (int i = 0; i < genero.length; i++) {
                        for (int j = 0; j < genero[i].length; j++) {
                            String generoTemporario =  genero[i][j];
                            if (nomeGenero.equalsIgnoreCase(generoTemporario)){
                                achou = true;
                                break;
                            }
                        }

                        if (achou){
                            System.out.println("Gênero encontrado... inserindo informação");
                            break;
                        }else{
                            System.out.println("Gênero não encontrado, voltando ao menu");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Finalizando o arquivo");
                    mantem = false;
                    break;
                default:
                    System.out.println("Opção inexistente...");
                    break;
            }

        }while(mantem);
    }

}