package q2.main;

import java.util.List;
import q2.texto.Palavra;

/**
 * Classe principal do programa
 * @author Carlos Bravo - cehaga@dcc.ufrj.br
 */
public class Principal {
  public static void main(String[] args){
    List<String> palavrasOrd = Palavra.ordena();
    for(String palavra : palavrasOrd){
      System.out.println(palavra);
    }
  }
}
