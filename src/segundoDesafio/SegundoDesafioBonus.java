package segundoDesafio;

import java.util.Scanner;

public class SegundoDesafioBonus {
    public static void main(String[] args) {
        executarDesafio();
    }


    //Método para chamar a resolução do desafio lendo input do valor
    private static void executarDesafio() {
        Scanner scanner = new Scanner(System.in);
        float valor = scanner.nextFloat();
        int centavos = Math.round(valor * 100);                                             //Multiplica o valor por 100 para tratar o valor como sendo unicamente em centavos
        quantidadeNotas(centavos, saberNotaDaVez(centavos));
    }


    //Método criado para o funcionamento da recursividade, determina qual a moeda vai ser usada para próxima iteração
    ////fazendo o calculo pra saber qual a menor moeda que o valor ainda é divisível
    private static int saberNotaDaVez(int centavos) {
        if (centavos / 10000 > 0) {
            return 10000;
        } else if (centavos / 5000 > 0) {
            return 5000;
        } else if (centavos / 2000 > 0) {
            return 2000;
        } else if (centavos / 1000 > 0) {
            return 1000;
        } else if (centavos / 500 > 0) {
            return 500;
        } else if (centavos / 200 > 0) {
            return 200;
        } else if (centavos / 100 > 0) {
            return 100;
        } else if (centavos / 50 > 0) {
            return 50;
        } else if (centavos / 25 > 0) {
            return 25;
        } else if (centavos / 10 > 0) {
            return 10;
        } else if (centavos / 5 > 0) {
            return 5;
        } else if(centavos > 0){
            return 1;
        } else if(centavos == 0){
            return 0;
        }
        return 0;
    }

    private static void quantidadeNotas(int centavos, int notaDaVez) {                      //Método recursivo que usa o método saberNotaDaVez para determinar qual o funcionamento correto
        if(centavos == 0){
            return;                                                                         //Breakpoint da recursão
        }
        int qntNota = (centavos / (notaDaVez));                                             //Calcula a quantidade de notas que são necessarias.
        centavos -= qntNota * notaDaVez;                                                    //Atualiza o restante em centavos subtraindo o que já foi contado, preparando para a próxima iteração

        if (notaDaVez == 100) {                                                             //Funcionamento caso a moeda da vez seja de 1 real
            System.out.println(qntNota + "  moeda(s) de R$ " + notaDaVez / 100 + ".00");    //Exibe a quantidade de moeda(s) e o valor de cada divide o valor por 100 revertendo para real a conversão anterior para centavos
            quantidadeNotas(centavos, saberNotaDaVez(centavos));                            //Chama a próxima iteração
        } else if (notaDaVez < 100 && notaDaVez > 5) {                                      //Funcionamento caso a moeda da vez seja de 50 25 ou 10 centavos
            System.out.println(qntNota + "  moeda(s) de R$ 00." + notaDaVez);               //Não é necessário converter para centavos já que são as menores casas
            quantidadeNotas(centavos, saberNotaDaVez(centavos));
        } else if (notaDaVez == 5) {                                                        //Funcionamento caso a moeda da vez seja de 5 centavos
            System.out.println(qntNota + "  moeda(s) de R$ 00.0" + notaDaVez);
            quantidadeNotas(centavos, saberNotaDaVez(centavos));
        } else if (notaDaVez == 1) {                                                        //Funcionamento caso a moeda da vez seja a de 1 centavo, como é o menor valor possivel, não é necessário chamar o método novamente,
            System.out.println(qntNota + "  moeda(s) de R$ 00.0" + notaDaVez);
            quantidadeNotas(centavos,saberNotaDaVez(centavos));
        } else {
            System.out.println(qntNota + "  nota(s) de R$ " + notaDaVez / 100 + ".00");     //Funcionamento caso a moeda da vez seja nota
            quantidadeNotas(centavos, saberNotaDaVez(centavos));
        }
    }
}
