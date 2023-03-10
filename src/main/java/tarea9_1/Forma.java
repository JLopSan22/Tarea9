package tarea9_1;

/**
 * Class Forma
 */
public class Forma extends Punto {

  //
  // Fields
  //

  private String color;
  
  //
  // Constructors
  //
  public Forma () { };

  public Forma(String color) {
    this.color = color;
  }

  public Forma(double origen, String color) {
    super(origen);
    this.color = color;
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

  //
  // Other methods
  //

}
