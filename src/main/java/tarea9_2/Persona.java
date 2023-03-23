package tarea9_2;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Class Persona
 */
public class Persona {

  //
  // Fields
  //

  private String nombre;
  private String apellido1;
  private String apellido2;
  private LocalDate fechaNacimiento;
  private char sexo;
  private int id;
  private ArrayList<PuestoTrabajo> puesto;
  
  //
  // Constructors
  //
  public Persona () { };

  public Persona(String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento, char sexo, int id, ArrayList<PuestoTrabajo> puesto) {
    this.nombre = nombre;
    this.apellido1 = apellido1;
    this.apellido2 = apellido2;
    this.fechaNacimiento = fechaNacimiento;
    this.sexo = sexo;
    this.id = id;
    this.puesto = puesto;
  }
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre = newVar;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of apellido1
   * @param newVar the new value of apellido1
   */
  public void setApellido1 (String newVar) {
    apellido1 = newVar;
  }

  /**
   * Get the value of apellido1
   * @return the value of apellido1
   */
  public String getApellido1 () {
    return apellido1;
  }

  /**
   * Set the value of apellido2
   * @param newVar the new value of apellido2
   */
  public void setApellido2 (String newVar) {
    apellido2 = newVar;
  }

  /**
   * Get the value of apellido2
   * @return the value of apellido2
   */
  public String getApellido2 () {
    return apellido2;
  }

  /**
   * Set the value of fechaNacimiento
   * @param newVar the new value of fechaNacimiento
   */
  public void setFechaNacimiento (LocalDate newVar) {
    fechaNacimiento = newVar;
  }

  /**
   * Get the value of fechaNacimiento
   * @return the value of fechaNacimiento
   */
  public LocalDate getFechaNacimiento () {
    return fechaNacimiento;
  }

  /**
   * Set the value of sexo
   * @param newVar the new value of sexo
   */
  public void setSexo (char newVar) {
    sexo = newVar;
  }

  /**
   * Get the value of sexo
   * @return the value of sexo
   */
  public char getSexo () {
    return sexo;
  }

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
  public void setId (int newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  public int getId () {
    return id;
  }

  /**
   * Set the value of puesto
   * @param newVar the new value of puesto
   */
  public void setPuesto(ArrayList<PuestoTrabajo> puesto) {
    this.puesto = puesto;
  }

  /**
   * Get the value of puesto
   * @return the value of puesto
   */
  public ArrayList<PuestoTrabajo> getPuesto() {
    return puesto;
  }
  //
  // Other methods
  //

  @Override
  public String toString() {
    return "Persona{" +
            "nombre='" + nombre + '\'' +
            ", apellido1='" + apellido1 + '\'' +
            ", apellido2='" + apellido2 + '\'' +
            ", fechaNacimiento=" + fechaNacimiento +
            ", sexo=" + sexo +
            ", id=" + id +
            ", puesto=" + puesto +
            '}';
  }
}
