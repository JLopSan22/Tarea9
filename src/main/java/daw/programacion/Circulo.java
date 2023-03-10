package daw.programacion;

/**
 * Class Circulo
 */
public class Circulo extends Conica {

  //
  // Fields
  //

  private double diametro;
  
  //
  // Constructors
  //
  public Circulo () { };

  public Circulo(double diametro) {
    this.diametro = diametro;
  }

  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of diametro
   * @param newVar the new value of diametro
   */
  public void setDiametro (double newVar) {
    diametro = newVar;
  }

  /**
   * Get the value of diametro
   * @return the value of diametro
   */
  public double getDiametro () {
    return diametro;
  }

  //
  // Other methods
  //

}
