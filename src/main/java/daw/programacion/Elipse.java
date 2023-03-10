package daw.programacion;

/**
 * Class Elipse
 */
public class Elipse {

  //
  // Fields
  //

  private String color;
  private double ejeX;
  private double ejeY;
  private double foco;
  
  //
  // Constructors
  //
  public Elipse () { };

  public Elipse(String color, double ejeX, double ejeY, double foco) {
    this.color = color;
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
   * Set the value of color
   * @param newVar the new value of color
   */
  public void setColor (String newVar) {
    color = newVar;
  }

  /**
   * Get the value of color
   * @return the value of color
   */
  public String getColor () {
    return color;
  }

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
