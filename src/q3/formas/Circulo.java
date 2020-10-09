package q3.formas;

/**
 * Classe para representar um círculo
 * @author Carlos Bravo - cehaga@dcc.ufrj.br
 */
public class Circulo extends Forma{
  private double raio;

  /**
   * Construtor de um círculo
   * @param centro Um Ponto com as coordenadas do centro
   * @param raio A dimensão de seu raio
   */
  public Circulo(Ponto centro, double raio){
    super(new Ponto[]{centro});
    this.raio = raio;
  }

  public double getRaio(){
    return raio;
  }

  /**
   * Calcula a área do círculo
   * @return A área do círculo
   */
  @Override
  public double area(){
    return Math.PI * Math.pow(raio, 2);
  }

  /**
   * Calcula o perímetro do círculo
   * @return o perímetro do círculo
   */
  @Override
  public double perimetro(){
    return 2 * Math.PI * raio;
  }
}
