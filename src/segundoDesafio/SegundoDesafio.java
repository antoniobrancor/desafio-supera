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
        int centavos = Math.round(valor * 100);                                             //Multiplica o valor por 100 para tratar o valor como sendo unicamente em centavos
        centavos = metodo(centavos, 10000);
        centavos = metodo(centavos, 5000);
        centavos = metodo(centavos, 2000);
        centavos = metodo(centavos, 1000);
        centavos = metodo(centavos, 500);
        centavos = metodo(centavos, 200);
        centavos = metodo(centavos, 100);
        centavos = metodo(centavos, 50);
        centavos = metodo(centavos, 25);
        centavos = metodo(centavos, 10);
        centavos = metodo(centavos, 5);
        centavos = metodo(centavos, 1);
    }

    private static int metodo(int centavos, int nota) {                                     //metodo para calcular e imprimir quantidade de notas
        int qntNotas = centavos / nota;
        centavos -= nota * qntNotas;
        if (nota > 100) {
            System.out.println(qntNotas + "  nota(s) de R$ " + nota / 100 + ".00");
        } else if (nota == 100) {
            System.out.println(qntNotas + " moeda(s) de R$ " + nota / 100 + ".00");
        } else if (nota > 5) {
            System.out.println(qntNotas + " moeda(s) de R$00." + nota);
        } else {
            System.out.println(qntNotas + " moeda(s) de R$00.0" + nota);
        }
        return centavos;
    }
}

