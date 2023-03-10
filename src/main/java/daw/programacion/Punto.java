package daw.programacion;

/**
 * Class Punto
 */
public class Punto {

  //
  // Fields
  //

  private double origen;
  
  //
  // Constructors
  //
  public Punto () { };

  public Punto(double origen) {
    this.origen = origen;
  }
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of origen
   * @param newVar the new value of origen
   */
  public void setOrigen (double newVar) {
    origen = newVar;
  }

  /**
   * Get the value of origen
   * @return the value of origen
   */
  public double getOrigen () {
    return origen;
  }

  //
  // Other methods
  //

}
