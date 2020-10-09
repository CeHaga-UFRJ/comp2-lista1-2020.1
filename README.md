1. O exercício mais difícil foi a questão 3. Minha principal dificuldade foi na hora da leitura, pois houve alguns problemas com o Scanner por usar várias funções. A solução encontrada foi criar uma instância estática do Scanner na classe Principal, assim todas as funções conseguiram chamar sem nenhum problema.

2. Foi utilizado o método nextDouble() do Scanner. As exceções são:
 InputMismatchException - A entrada não é um número inteiro
 NoSuchElementException - Não há nada para leitura
 IllegalStateException - O Scanner já foi finalizado

3. As 2 primeiras exceções são por problema de entrada de dados. Nesse caso o usuário é notificado qual o erro ocorrido e a leitura é efetuada novamente até que a entrada certa ocorra.
A última exceção é problema do código, mas como o Scanner não é fechado antes da leitura é seguro não realizar nenhum tratamento.

4. O programa lê os dados até que apareça o End Of File (Ctrl+D no terminal), pois dessa forma a entrada pode ser dinâmica. Para verificar o EOF foi utilizada a função hasNext() do Scanner.

5. Já que foi utilizado um ArrayList é possível utilizar a função sort da classe Collections. Além disso, foi adicionado o modificador "CASE_INSENSITIVE_ORDER", assim letras maiúsculas e minúsculas são tratadas igualmente na ordem alfabética.

6. Foi criada uma classe chamada Ponto, que contém um campo chamado X e um campo chamado Y. Cada vértice é representado por uma instância desse ponto com suas coordenadas X e Y.

7. Tratando como um único objeto ao invés de um array de 2 valores, fica mais fácil sua visualização e uso nas classes. Por exemplo, para usar uma função com 2 pontos foi necessário apenas 2 parâmetros ao invés de 4 (Um para cada coordenada de cada ponto).

8. Não. Para o cálculo do perímetro bastava calcular as distâncias dos pontos n & n+1 e no final somar tudo. Para o cálculo da área há uma fórmula para calcular a área de qualquer polígono (Que não cruze nenhum lado) dada suas coordenadas, e como nos polígonos possíveis nenhum se cruza, foi possível usar. A única exceção foi no cálculo de área e perímetro do círculo, pois o mesmo possui fórmulas próprias.
No entanto, se os vértices na entrada estivessem fora de ordem haveria uma certa dificuldade para descobrir a ordem, pois para aplicar essa fórmula a ordem dos vértices importa.
Referências da fórmula de cálculo de área: 
  [1] https://www.mathopenref.com/coordpolygonarea.html
  [2] https://en.wikipedia.org/wiki/Shoelace_formula