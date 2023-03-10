package daw.programacion;

/**
 * Class Cuadrilatero
 */
public class Cuadrilatero extends Forma {

  //
  // Fields
  //

  private Double longitud;
  
  //
  // Constructors
  //
  public Cuadrilatero () { };

  public Cuadrilatero(Double longitud) {
    this.longitud = longitud;
  }
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of longitud
   * @param newVar the new value of longitud
   */
  public void setLongitud (Double newVar) {
    longitud = newVar;
  }

  /**
   * Get the value of longitud
   * @return the value of longitud
   */
  public Double getLongitud () {
    return longitud;
  }

  //
  // Other methods
  //

}
