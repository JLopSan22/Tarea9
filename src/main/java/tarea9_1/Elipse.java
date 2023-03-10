package tarea9_1;

/**
 * Class Elipse
 */
public class Elipse extends Conica {

  //
  // Fields
  //

  private double ejeX;
  private double ejeY;
  private double foco;
  
  //
  // Constructors
  //
  public Elipse () { };

  public Elipse(double ejeX, double ejeY, double foco) {
    this.ejeX = ejeX;
    this.ejeY = ejeY;
    this.foco = foco;
  }
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of ejeX
   * @param newVar the new value of ejeX
   */
  public void setEjeX (double newVar) {
    ejeX = newVar;
  }

  /**
   * Get the value of ejeX
   * @return the value of ejeX
   */
  public double getEjeX () {
    return ejeX;
  }

  /**
   * Set the value of ejeY
   * @param newVar the new value of ejeY
   */
  public void setEjeY (double newVar) {
    ejeY = newVar;
  }

  /**
   * Get the value of ejeY
   * @return the value of ejeY
   */
  public double getEjeY () {
    return ejeY;
  }

  /**
   * Set the value of foco
   * @param newVar the new value of foco
   */
  public void setFoco (double newVar) {
    foco = newVar;
  }

  /**
   * Get the value of foco
   * @return the value of foco
   */
  public double getFoco () {
    return foco;
  }

  //
  // Other methods
  //

}
