package tarea9_1;

/**
 * Class Rectangulo
 */
public class Rectangulo extends Cuadrilatero {

  //
  // Fields
  //

  private double base;
  private double altura;
  
  //
  // Constructors
  //
  public Rectangulo () { };

  public Rectangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
  }
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of base
   * @param newVar the new value of base
   */
  public void setBase (double newVar) {
    base = newVar;
  }

  /**
   * Get the value of base
   * @return the value of base
   */
  public double getBase () {
    return base;
  }

  /**
   * Set the value of altura
   * @param newVar the new value of altura
   */
  public void setAltura (double newVar) {
    altura = newVar;
  }

  /**
   * Get the value of altura
   * @return the value of altura
   */
  public double getAltura () {
    return altura;
  }

  //
  // Other methods
  //

}
