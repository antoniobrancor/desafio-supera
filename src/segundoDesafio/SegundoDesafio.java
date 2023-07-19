package segundoDesafio;

import java.util.Scanner;

public class SegundoDesafio {
    public static void main(String[] args) {
        executarDesafio();

    }

    //Método para chamar a resolução do desafio lendo input do valor
    private static void executarDesafio() {
        Scanner scanner = new Scanner(System.in);
        float valor = scanner.nextFloat();
        int centavos = Math.round(valor * 100);
        contarNotas((centavos));
    }

    private static void contarNotas(int centavos) {

        //Inicialização das quantidades de notas
        int nota100, nota50, nota20, nota10, nota5,nota2, moeda1, moeda50, moeda25, moeda10, moeda5, moeda01;


        System.out.println("NOTAS:");
        //Vai de valor em valor vendo se as notas serão utilizadas, a impressão acontece de qualquer forma
        if (centavos % 10000 >= 0) {
            nota100 = centavos / 10000;
            centavos -= nota100 * 10000;
            System.out.println(nota100 + " nota(s) de R$ 100.00");
        }
        if (centavos % 5000 >= 0) {
            nota50 = centavos / 5000;
            centavos -= nota50 * 5000;
            System.out.println(nota50 + " nota(s) de R$ 50.00");
        }
        if (centavos % 2000 >= 0) {
            nota20 = centavos / 2000;
            centavos -= nota20 * 2000;
            System.out.println(nota20 + " nota(s) de R$ 20.00");
        }
        if (centavos % 1000 >= 0) {
            nota10 = centavos / 1000;
            centavos -= nota10 * 1000;
            System.out.println(nota10 + " nota(s) de R$ 10.00");
        }
        if (centavos % 500 >= 0) {
            nota5 = centavos / 500;
            centavos -= nota5 * 500;
            System.out.println(nota5 + " nota(s) de R$ 5.00");
        }
        if (centavos % 200 >= 0) {
            nota2 = centavos / 200;
            centavos -= nota2 * 200;
            System.out.println(nota2 + " nota(s) de R$ 2.00");
        }
        System.out.println("MOEDAS:");
        
        if (centavos % 100 >= 0) {
            moeda1 = centavos / 100;
            centavos -= moeda1 * 100;
            System.out.println(moeda1 + " moeda(s) de R$ 1.00");
        }
        if (centavos % 50 >= 0) {
            moeda50 = centavos / 50;
            centavos -= moeda50 * 50;
            System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        }
        if (centavos % 25 >= 0) {
            moeda25 = centavos / 25;
            centavos -= moeda25 * 25;
            System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        }
        if (centavos % 10 >= 0) {
            moeda10 = centavos / 10;
            centavos -= moeda10 * 10;
            System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        }
        if (centavos % 5 >= 0) {
            moeda5 = centavos / 5;
            centavos -= moeda5 * 5;
            System.out.println(moeda5 + " moeda(s) de R$ 0.05");
        }
        if (centavos % 1 >= 0) {
            moeda01 = centavos;
            System.out.println(moeda01 + " moeda(s) de R$ 0.01");
        }
    }
}

