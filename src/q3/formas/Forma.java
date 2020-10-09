package q3.formas;

/**
 * Classe abstrata para representar formas
 * @author Carlos Bravo - cehaga@dcc.ufrj.br
 */
public abstract class Forma {
  protected Ponto[] vertices;

  /**
   * Construtor das formas
   * @param vertices Um array de Ponto com as coordenadas de seus vértices
   */
  public Forma(Ponto[] vertices){
    this.vertices = vertices;
  }

  public Ponto[] getVertices(){
    return vertices;
  }

  /**
   * Calcula a área de um polígono com pelo menos 3 lados
   * @return A área do polígono
   */
  public double area(){
    double area = 0.0;
    for(int i = 0; i < vertices.length; i++){
      area += multCruz(vertices[i], vertices[(i+1)%vertices.length]);
    }
    area /= 2;
    return Math.abs(area);
  }

  /**
   * Calcula o perímetro de um polígono com pelo menos 3 lados
   * @return O perímetro do polígono  
   */
  public double perimetro(){
    double per = 0.0;
    for(int i = 0; i < vertices.length; i++){
      per += distancia(vertices[i], vertices[(i+1)%vertices.length]);
    }
    return per;
  }

  /**
   * Calcula a distância entre 2 pontos
   * @param a O primeiro ponto
   * @param b O segundo ponto
   * @return A distância dos pontos
   */
  public static double distancia(Ponto a, Ponto b){
    double ax = a.getX();
    double ay = a.getY();
    double bx = b.getX();
    double by = b.getY();
    return Math.pow(Math.pow(ax-bx,2) + Math.pow(ay-by,2),0.5);
  }

  /**
   * Calcula a determinante entre 2 pontos
   * @param a O primeiro ponto
   * @param b O segundo ponto
   * @return A determinante dos pontos
   */
  public static double multCruz(Ponto a, Ponto b){
    double ax = a.getX();
    double ay = a.getY();
    double bx = b.getX();
    double by = b.getY();
    return ax*by - ay*bx; 
  }
}
