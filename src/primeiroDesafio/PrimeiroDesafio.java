package primeiroDesafio;

import java.util.*;

public class PrimeiroDesafio {
    public static void main(String[] args) {
        executarDesafio();
    }

    private static void executarDesafio() {
        Scanner scanner = new Scanner(System.in);
        int linhas = scanner.nextInt();
        List<Integer> listaPar = new ArrayList<Integer>();
        List<Integer> listaImpar = new ArrayList<Integer>();

        //popula listas par e impar usando os numeros de input
        for (int i = 0; i < linhas; i++) {
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                listaPar.add(numero);
            } else {
                listaImpar.add(numero);
            }
        }
        ordenarListas(listaPar,listaImpar);
        imprimirLista(listaPar);
        imprimirLista(listaImpar);
    }

    private static void ordenarListas(List<Integer> par, List<Integer> impar) {
        par.sort((a, b) -> a - b);
        impar.sort((a, b) -> a - b);
        Collections.reverse(impar);
    }

    private static void imprimirLista(List<Integer> lista) {
        for (int numero : lista) {
            System.out.println(numero);
        }
    }

}







