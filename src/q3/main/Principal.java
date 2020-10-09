package q3.main;

import q3.formas.*;
import java.util.*;

/**
 * Classe principal do código
 * @author Carlos Bravo - cehaga@dcc.ufrj.br
 */
public class Principal{

  public static Scanner sc = new Scanner(System.in);
  public static void main(String[] args){
    Forma forma = seleciona();
    System.out.println("Área: " + forma.area());
    System.out.println("Perímetro: " + forma.perimetro());
  }

  /**
   * Lê da entrada padrão a forma escolhida e retorna sua instância
   * @return Uma instância da forma escolhida
   */
  public static Forma seleciona(){
    System.out.println("Entre com a forma que deseja calcular:");
    System.out.println("(1) Triângulo");
    System.out.println("(2) Retângulo");
    System.out.println("(3) Trapézio");
    System.out.println("(4) Círculo");

    Forma forma = null;
    int tipo = 0;
    
    while(true){
      try{
        tipo = sc.nextInt();
        if(tipo > 0 && tipo < 5) break;
        System.out.println("Forma inválida");
      }catch(InputMismatchException e){
        System.out.println("Entre apenas com números");
        sc.next();
      }catch(NoSuchElementException e){
        System.out.println("Forma faltando");
        sc.next();
      }
    }
    
    forma = tipo < 4 ? leForma(tipo) : leCirculo();

    return forma;
  }

  /**
   * Cria um polígono com suas coordenadas
   * <p>Lê as coordenadas de um polígono com mais de 3 lados da entrada padrão e retorna sua instância</p>
   * @param tipo O tipo do polígono a ser instanciado
   * @return A instância do polígono com suas coordenadas
   */
  public static Forma leForma(int tipo){
    int pontos = tipo == 1 ? 3 : 4; 
    Ponto[] vertices = new Ponto[pontos];
    for(int i = 0; i < pontos; i++){
      System.out.println("Entre com a coordenada X do vértice "+(i+1)+" do polígono:");
      double x = 0.0;
      while(true){
        try{
          x = sc.nextDouble();
          break;
        }catch(InputMismatchException e){
          System.out.println("Coordenada X do vértice "+(i+1)+" inválido");
          sc.next();
        }catch(NoSuchElementException e){
          System.out.println("Coordenada X do vértice "+(i+1)+" faltando");
          sc.next();
        }
      }

      System.out.println("Entre com a coordenada Y do vértice "+(i+1)+" do polígono:");
      double y = 0.0;
      while(true){
        try{
          y = sc.nextDouble();
          break;
        }catch(InputMismatchException e){
          System.out.println("Coordenada Y do vértice "+(i+1)+" inválido");
          sc.next();
        }catch(NoSuchElementException e){
          System.out.println("Coordenada Y do vértice "+(i+1)+" faltando");
          sc.next();
        }
      }

      vertices[i] = new Ponto(x,y);
    }

    if(tipo == 1){
      return new Triangulo(vertices);
    }else if(tipo == 2){
      return new Retangulo(vertices);
    }else{
      return new Trapezio(vertices);
    }
  }

  /**
   * Cria um círculo com suas coordenadas
   * <p>Lê o centro e o raio de um círculo da entrada padrão e retorna sua instância</p>
   * @return A instância de um círculo com suas propriedades
   */
  public static Forma leCirculo(){
    double raio = 0.0;

    System.out.println("Entre com a coordenada X do centro do círculo");
    double x = 0.0;
    while(true){
      try{
        x = sc.nextDouble();
        break;
      }catch(InputMismatchException e){
        System.out.println("Coordenada X do centro inválido");
        sc.next();
      }catch(NoSuchElementException e){
        System.out.println("Coordenada X do centro faltando");
        sc.next();
      }
    }

    System.out.println("Entre com a coordenada Y do centro do círculo");
    double y = 0.0;
    while(true){
      try{
        y = sc.nextDouble();
        break;
      }catch(InputMismatchException e){
        System.out.println("Coordenada Y do centro inválido");
        sc.next();
      }catch(NoSuchElementException e){
        System.out.println("Coordenada Y do centro faltando");
        sc.next();
      }
    }

    System.out.println("Entre com o raio do círculo:");
    while(true){
      try{
        raio = sc.nextDouble();
        if(raio >= 0) break;
        System.out.println("Entre com um raio positivo");
      }catch(InputMismatchException e){
        System.out.println("Raio inválido");
      }catch(NoSuchElementException e){
        System.out.println("Raio faltando");
      }
    }

    return new Circulo(new Ponto(x,y), raio);
  }
}
