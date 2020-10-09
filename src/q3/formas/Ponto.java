package q3.formas;

/**
 * Classe para representar um ponto de coordenadas
 * @author Carlos Bravo - cehaga@dcc.ufrj.br
 */
public class Ponto {
  private double x;
  private double y;

  /**
   * Construtor do ponto
   * @param x A coordenada X do ponto
   * @param y A coordenada Y do ponto
   */
  public Ponto(double x, double y){
    this.x = x;
    this.y = y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }
}
