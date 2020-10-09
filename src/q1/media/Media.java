package q1.media;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Classe para o método media
 * @author Carlos Bravo - cehaga@dcc.ufrj.br
 * <p>Essa classe contém a implementação do método média</p>
 */
public class Media {
  /**
   * Método que calcula a média de uma lista
   * <p>Esse método lê o tamanho de uma lista e seus n elementos. Após isso calcula a média e retorna seu valor</p>
   * @return A média dos elementos da lista lida 
   */
  public static double media(){
    Scanner sc = new Scanner(System.in);
    int tam = 0;
    System.out.println("Entre com o número de elementos da lista: ");
    while(true){
      try{
        tam = sc.nextInt();
        if(tam > 0) break;
        System.out.println("Número de elementos inválido");
      }catch(InputMismatchException e){
        System.out.println("Entre com um número inteiro");
        sc.next();
      }catch(NoSuchElementException e){
        System.out.println("Número de elementos faltando");
        sc.next();
      }
    }
    double media = 0.0;
    for(int i = 0; i < tam; i++){
      System.out.println("Entre com o elemento "+(i+1)+":");
      while(true){
        try{
          media += sc.nextDouble();
          break;
        }
        catch(InputMismatchException e){
          System.out.println("Elemento "+(i+1)+" inválido");
          sc.next();
        }catch(NoSuchElementException e){
          System.out.println("Elemento "+(i+1)+" faltando");
          sc.next();
        }
      }
    }
    media /= tam;
    sc.close();
    return media;
  }
}
