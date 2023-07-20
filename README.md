# desafio-supera
Desafios para seleção Supera
## Primeiro Desafio
Na pasta src/primeiroDesafio está a resolução do primeiro desafio que pede a ordenação de uma série de números, os números pares são ordenados de forma crescente enquanto os ímpares são ordenados de forma decrescente.
Armazenei os números em listas de números pares e ímpares, em seguida usei os métodos de lista para organizar os números conforme foi pedido. 
Por fim imprime na tela o resultado da ordenação, um número por linha.
## Segundo Desafio
Na pasta src/segundoDesafio está a resolução do segundo desafio que pede para listar o mínimo de notas e moedas possível para formar o valor que é inserido, transformo o valor em centavos para ficar mais fácil manipular, em seguida tenho um método que testa o valor para cada nota, da maior nota até a menor moeda, assim os valores vão se eliminando e contabilizada a quantidade de notas necessárias. 
Implementei outra solução no segundoDesafioBonus, o output é apenas das notas e moedas que foram utilizadas ao invés de todas possíveis e suas quantidades mesmo que seja zero, por isso não apresentei apenas essa solução. Nesse caso uso recursividade para determinar quais notas vão ser necessárias, enquanto implementam a forma mais simples vi essa possibilidade e quis testar, para dar suporte a recursividade tem outro método para saber qual o valor restante após cada iteração.
## Terceiro Desafio
Na pasta src/terceiroDesafio está a resolução do segundo desafio que pede para determinar o número de pares dentro do array em que sua diferença seja igual ao valor alvo. Assim, o programa recebe a quantidade de números que serão armazenadas no array, em seguida qual o valor alvo e por fim os valores a serem testados no array. Enquanto são inseridos no array os números já são testados contra todos os que já estão no array, assim, a partir da segunda inserção já começam os testes. O output é o número de pares que atendem ao requisito.
## Quarto Desafio
Na pasta src/quartoDesafio está a resolução do segundo desafio que pede para desembaralhar uma string que está de dentro pra fora, elas seguem o mesmo padrão e devem ser reescritas. O primeiro input é a quantidade de Strings que vão entrar que serão separadas pela quebra de linha, em seguida as linhas são inseridas no programa e vão para um array de string. As strings são então quebradas em arrays de caracteres e divididas em duas, o desembaralhamento é feito em um array de caracteres auxiliar que recebe os caracteres na ordem certa em que deveriam estar. O output são os textos desembaralhados.
## Quinto Desafio
Infelizmente não consegui fazer por não ter experiência com esse tipo de problema.


