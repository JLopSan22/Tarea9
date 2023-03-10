package daw.programacion;

/**
 * Class Cuadrado
 */
public class Cuadrado extends Cuadrilatero {

  //
  // Fields
  //

  private double lado;
  
  //
  // Constructors
  //
  public Cuadrado () { };

  public Cuadrado(double lado) {
    this.lado = lado;
  }
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of lado
   * @param newVar the new value of lado
   */
  public void setLado (double newVar) {
    lado = newVar;
  }

  /**
   * Get the value of lado
   * @return the value of lado
   */
  public double getLado () {
    return lado;
  }

  //
  // Other methods
  //

}
