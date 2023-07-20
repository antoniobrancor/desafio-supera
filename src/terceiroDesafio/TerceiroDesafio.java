package terceiroDesafio;

import java.util.Scanner;

public class TerceiroDesafio {
    public static void main(String[] args) {
        executarDesafio();
    }

    private static void executarDesafio() {
        //declaração das variáveis
        Scanner scanner = new Scanner(System.in);
        int tamanho = scanner.nextInt();
        int valorAlvo = scanner.nextInt();
        int cont = 0;
        Integer[] arrayNumeros = new Integer[tamanho];

        //inserindo os valores no array
        for (int i = 0; i < tamanho; i++) {
            arrayNumeros[i] = scanner.nextInt();
            //comparando os valores dentro do array para achar o valor alvo, j é o índice de valores anteriores ao que foi inserido por último
            for (int j = i; j > 0; j--) {
                    if(arrayNumeros[j-1]>arrayNumeros[i]){ //faz a conta usando o índice atual contra todos os índices anteriores, se o índice anterior seja maior que o atual, evitando resultados negativos
                        cont = (arrayNumeros[j - 1] - arrayNumeros[i]) == valorAlvo ? cont + 1 : cont; //se o resultado for o valor alvo, o contador soma + 1
                    }
                   else { //faz a conta usando o índice atual contra todos os índices anteriores, se o índice anterior seja menor que o atual, evitando resultados negativos

                        cont = (arrayNumeros[i] - arrayNumeros[j - 1]) == valorAlvo ? cont + 1 : cont; //se o resultado for o valor alvo, o contador soma + 1
                    }
            }
        }
        System.out.println(cont);
    }
}