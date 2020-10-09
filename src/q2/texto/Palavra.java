package q2.texto;

import java.util.*;

/**
 * Classe para o método ordena
 * @author Carlos Bravo - cehaga@dcc.ufrj.br
 */
public class Palavra {
  /**
   * Ordena uma lista de palavras
   * <p>Esse método lê uma lista de palavras da entrada padrão e retorna uma lista com as palavras ordenadas</p>
   * @return A lista ordenada das palavras
   */
  public static List<String> ordena(){
    List<String> palavras = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
      palavras.add(sc.next());
    }
    Collections.sort(palavras, String.CASE_INSENSITIVE_ORDER);
    sc.close();
    return palavras;
  }
}
