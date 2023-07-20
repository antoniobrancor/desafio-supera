package quartoDesafio;

import java.util.Scanner;

public class QuartoDesafio {
    public static void main(String[] args) {
        executarDesafio();
    }

    private static void executarDesafio() {
        Scanner scanner = new Scanner(System.in);
        int qntdLinhas = Integer.valueOf(scanner.nextLine());                               //usando apenas nextInt() o array pegava esse valor e armazenava, castar a linha para int evita o problema

        String[] strArr = new String[qntdLinhas];
        for (int i = 0; i < qntdLinhas; i++) {
            strArr[i] = scanner.nextLine();
        }
        repeticoes(strArr, qntdLinhas);

        for (String string : strArr) {
            System.out.println(string);
        }

    }

    //executa o desembaralhar quantas vezes forem necessárias segundo a quantidade de linhas indicadas pelo usuario
    private static void repeticoes(String[] strArr, int qntdLinhas) {
        for (int i = 0; i < qntdLinhas; i++) {
            strArr[i] = desembaralhar(strArr[i]);                                           //reescreve o valor da string na array para o resultado do método que está desembaralhado
        }
    }


    //método para desembaralhar a string, dividida em metades, em seguida armazena tudo já em ordem no array auxiliar
    private static String desembaralhar(String strLinha) {
        int metadeFrase = (strLinha.length() / 2);

        char[] primeiraMetade = strLinha.substring(0, metadeFrase).toCharArray();           //cria arrays para cada metade da string original
        char[] segundaMetade = strLinha.substring(0, metadeFrase).toCharArray();
        char[] auxiliar = new char[strLinha.length()];                                      //array para armazenar a frase completa já ordenada


        for (int i = 0; i < metadeFrase; i++) {                                             //desembaralha a primeira metade, colocando a última casa embaralhada na primeira desembaralhada
            auxiliar[i] = primeiraMetade[(metadeFrase - 1) - i];
        }
        for (int i = 0; i < metadeFrase; i++) {                                             //desembaralha a segunda metade, colocando a última casa embaralhada na primeira casa da segunda metade

            auxiliar[metadeFrase + i] = segundaMetade[(metadeFrase - 1) - i];
        }
        return new String(auxiliar);
    }
}

