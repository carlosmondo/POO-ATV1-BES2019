# POO-ATV1-BES2019

## Atividade 01 - Programação Orientada a Objetos - BES2019

#### Objetivo: Desenvolver um projeto com a linguagem Java que resolva um determinado problema

O problema escolhido para a resolução desta atividade trata da organização de arquivos, classificados pelo 
ano de publicação deles e o semestre. No problema em questão, foi restringido o uso de dois anos.

Esse programa pode ser utilizado para por exemplo contabilizar quantos artigos foram publicados no
primeiro semestre de um ano em comparação a outros.

Para a atividade foi seguido os seguintes critérios: 
#### Requisitos
- Descrição do Problema escolhido e complexidade
- Uso de Entrada de Dados
- Uso de Estruturas Condicionais
- Uso de Laços de Repetições
- Uso de Classe String ou Math
- Uso de Arranjos/Matrizes
- Uso de Métodos Estáticos
- Explicação do código com comentários
- Solução do problema com o programa desenvolvido
- Repositório no Github
- Descrição do problema com Markdown **( ponto extra )**	

---------------------------------------------------------------
```java
/*
 * O Problema escolhido trata da organização de arquivos, classificados pelo ano de publicação deles e 
 * o semestre. No problema em questão, foi restringido o uso de dois anos (2018 e 2019) e o primeiro 
 * semestre e o segundo semestre. Esse programa pode ser utilizado para por exemplo contabilizar quantos
 * artigos foram publicados no primeiro semestre de um ano em comparação a outros. */

// Importa a classe Scanner, que permite a leitura de dados a partir do teclado
import java.util.Scanner;

// Cria a classe publica Arquivadora
public class Arquivadora {

    /* Cria um método publico, estático e sem retorno defineAno
     * Que executa dois for encadeados para armazenar numa matriz [][]
     * os anos. Passa um texto para ser exibido na hora de determinar o ano */
    public static void defineAno(String texto, String matriz [][]){
        // Cria uma referência na memória para o objeto Scanner
        Scanner keyboard = new Scanner(System.in);
        // Inicia um for para percorrer pelas linhas da matriz
        for (int i = 0; i < matriz.length - 1; i++) {
            // Imprime na tela o texto passado por parâmetro
            System.out.print(texto);
            // Input na matriz na posição [i] do texto informado pelo usuario
            matriz[0][i] = keyboard.next();
        }
        for (int i = 0; i < matriz.length - 1; i++) {
            // Input na matriz na posição [i] do texto informado pelo usuário
            matriz[1][i] = "1SEM";
        }
        for (int i = 0; i < matriz.length - 1; i++) {
            // Input na matriz na posição [i] do texto informado pelo usuário
            matriz[2][i] = "2SEM";
        }
    }

    /* Metodo main da classe Arquivadora, primeiro método a ser executado */
    public static void main(String[] args) {

        // Cria uma referencia na memoria para o objeto Scanner.
        Scanner keyboard = new Scanner(System.in);
        /* Inicializa as variáveis primitivas int. Para escolher a opção do menu, 
         * pegar a posição da matriz e a quantidade de arquivos */
        int opcao = 0, linha = 0, coluna = 0, quantidadeArquivos = 0;
        // E outra matriz 2x2 de valores inteiros para representar a quantidade de arquivos.
        int arquivos [][] = new int [3][2];
        // Cria uma matriz 2x2 de valores String para representar o ano/semestre.
        String ano [][] = new String [3][2];
        // Inicializa as variaveis String usadas para pegar a posição na matriz Ano
        String valorAno = "", valorSemestre = "";

        // Inicializa valores booleanos utilizados para manter os laços abaixo
        boolean mantem = true, achou = false;

        /* Faz uma chamada do método criaGenero, passando uma String que será impressa dentro do laço
         * e passando a matriz definida nas linhas acima que recebera os valores dos generos dados pelo 
         * usuario */
        defineAno("Informe os anos que serão computados os arquivos: ", ano);

        // Inicializa o loop do meuno
        do{
            // Imprime na tela os opções do menu
            System.out.print("\n- Opções -\n" +
                    "1 - Visualizar Arquivadora\n" +
                    "2 - Armazenar Arquivos\n" +
                    "3 - EXIT\n" +
                    "- Opção: ");
            // Solicita uma entrada de dado do usuario para informar a opcao de menu escolhida
            opcao = keyboard.nextInt();

            /* Estrutura de deecisão Switch, recebe o parametro opcao, informado na linha acima
             * e executa os cases dependendo do valor informado, o que será executado corresponde com
             * os valores informados no print de menu. */
            switch(opcao){
                /* Caso o valor de opcao = 1 executa o primeiro caso
                   onde ele imprime em tela o estado atual da matriz, */
                case 1:
                    /* Passa para o método as duas matrizes, gaveteiro (contem os valores de quantos 
                     * arquivos tem em casa posição) e genero (os generos literarios existens). E 
                     * relaciona as duas matrizes de acordo com as posições delas */
                    for(int i = 0; i < ano.length; i++){
                        // Percorre pela linha da matriz
                        for(int j = 0; j < ano[i].length; j++){
                            //Percorre pela coluna da matriz
                            // Imprime na tela os valores das matrizes.
                            System.out.print(" | " + ano[i][j] + " - " + arquivos[i][j]);
                        }
                        // Pula linha
                        System.out.println();
                    }
                    break; // Finaliza o case 1 e volta para o menu.
                /* Caso o valor de opcao = 2 executa o segundo caso,
                 * Onde o usuario da o input dos valores na matriz arquivos de acordo com o ano/semestre
                 * informado */
                case 2:
                    // Soicita o valor correspondente a quantidade de arquivos a serem armazenados
                    System.out.print("Informe a quantidade de arquivos que deseja arquivar: ");
                    quantidadeArquivos = keyboard.nextInt();
                    /* Caso o usuario informe um valor invalido (Menor ou Igual a 0), devolve mensagem 
                     * informado valor invalido e retorna ao menu. */
                    if (quantidadeArquivos <= 0){
                        System.out.println("Valor invalido");
                        break;
                    }
                    // Solicita o valor correspondente ao Ano
                    System.out.print("Informe o ano: ");
                    valorAno = keyboard.next();
                    // Solicita o valor correspondente ao Semestre
                    System.out.print("Informe o ano (1SEM ou 2SEM): ");
                    valorSemestre = keyboard.next();

                    // Inicia for encadeado, percorrendo pelas linhas da matriz ano
                    for (int i = 0; i < ano.length; i++) {
                        /* Usando o valor de i para determinar a linha que se posiciona, percorre pelas 
                         * colunas. Utilizando o valor de j até que ele seja menor que o tamanho da coluna*/
                        for (int j = 0; j < ano[i].length; j++) {
                            // Armazena temporariamente o valor da String Ano naquela posição da matriz
                            String anoTemporario =  ano[0][j];
                            // Armazena temporariamente o valor da String Semestre naquela posição da matriz
                            String semestreTemporario = ano[i][j];
                            /* Cria duas variaveis boolenas que recebem o retorno do metodo equalsIgnoreCase, 
                             * para checar se foi encontrado o Ano e Semestre informado */
                            boolean achouAno = valorAno.equalsIgnoreCase(anoTemporario);
                            boolean achouSemestre = valorSemestre.equalsIgnoreCase(semestreTemporario);
                            /* Testa condição, se o Ano e Semestre informado pelo usuario no input de ano e 
                             * sememetres é uma String igual, porem ignorando o case-sensitive */
                            if (achouAno && achouSemestre){
                                // Se for encontrado um valor que corresponda, armazena a linha e a coluna da matriz
                                linha = i;
                                coluna = j;
                                // Altera o valor do booleano usado para entrar na estrutura que armazena na matriz
                                achou = true;
                            }
                        }
                    }
                    if (achou){
                        // Caso tenha achado um valor correspondente
                        System.out.println("\nAno e Semestre encontrado... inserindo informação");

                        // Armazena o total de arquivos do primeiro ano
                        int totalArquivos = 0;
                        for (int i = 1; i < arquivos.length; i++) {
                            totalArquivos += arquivos[i][0];
                        }

                        // Armazena o total de arquivos do segundo ano
                        int totalArquivosOutroAno = 0;
                        for (int i = 1; i < ano.length; i++) {
                            totalArquivosOutroAno += arquivos[i][1];
                        }
                        /* Armazena na matriz arquivos, na correspondete possição da matriz genero, 
                         * a quantidade de arquivos informados
                         * para armazenamento */
                        arquivos[linha][coluna] = quantidadeArquivos;
                        arquivos[0][0] = totalArquivos;
                        arquivos[0][1] = totalArquivosOutroAno;
                        // Volta para o menu
                        break;
                    }else{
                        // Caso nao tenha achado um valor correspondente, informa o usuario e volta para o menu
                        System.out.println("Ano e Semestre nao encontrado, voltando ao menu");
                        // Volta para o menu
                        break;
                    }
                case 3:
                    // Caso o valor de opcao for 3, encerra o a aplicaçao
                    System.out.println("Finalizando o arquivo");
                    // Altera o valor para false da variavel que mantem o menu
                    mantem = false;
                    // Sai da estrutura do Switch
                    break;
                default:
                    // Caso seja inserio qualquer valor maior que 4 ou menor que 1, retorna ao menu e informa
                    // "Opcaoo invalida" para o usuario
                    System.out.println("Opção inexistente...");
                    break;
            }
            // Testa condição que mantem o menu
        }while(mantem);
    }
}

````
![Figure 1-1](http://python.joinville.br/img/logo-univille.png "1") 
