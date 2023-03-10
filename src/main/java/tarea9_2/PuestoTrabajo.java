package tarea9_2;

import java.time.LocalDate;

/**
 * Class PuestoTrabajo
 */
public class PuestoTrabajo {

  //
  // Fields
  //

  private String nombre;
  private LocalDate fechaInicio;
  private LocalDate fechaFin;
  private int salario;
  private String departamento;
  private Persona jefe;
  
  //
  // Constructors
  //
  public PuestoTrabajo () { };

  public PuestoTrabajo(String nombre, LocalDate fechaInicio, LocalDate fechaFin, int salario, String departamento, Persona jefe) {
    this.nombre = nombre;
    this.fechaInicio = fechaInicio;
    this.fechaFin = fechaFin;
    this.salario = salario;
    this.departamento = departamento;
    this.jefe = jefe;
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
   * Set the value of fechaInicio
   * @param newVar the new value of fechaInicio
   */
  public void setFechaInicio (LocalDate newVar) {
    fechaInicio = newVar;
  }

  /**
   * Get the value of fechaInicio
   * @return the value of fechaInicio
   */
  public LocalDate getFechaInicio () {
    return fechaInicio;
  }

  /**
   * Set the value of fechaFin
   * @param newVar the new value of fechaFin
   */
  public void setFechaFin (LocalDate newVar) {
    fechaFin = newVar;
  }

  /**
   * Get the value of fechaFin
   * @return the value of fechaFin
   */
  public LocalDate getFechaFin () {
    return fechaFin;
  }

  /**
   * Set the value of salario
   * @param newVar the new value of salario
   */
  public void setSalario (int newVar) {
    salario = newVar;
  }

  /**
   * Get the value of salario
   * @return the value of salario
   */
  public int getSalario () {
    return salario;
  }

  /**
   * Set the value of departamento
   * @param newVar the new value of departamento
   */
  public void setDepartamento (String newVar) {
    departamento = newVar;
  }

  /**
   * Get the value of departamento
   * @return the value of departamento
   */
  public String getDepartamento () {
    return departamento;
  }

  /**
   * Set the value of jefe
   * @param newVar the new value of jefe
   */
  public void setJefe (Persona newVar) {
    jefe = newVar;
  }

  /**
   * Get the value of jefe
   * @return the value of jefe
   */
  public Persona getJefe () {
    return jefe;
  }

  //
  // Other methods
  //


  @Override
  public String toString() {
    return "PuestoTrabajo{" +
            "nombre='" + nombre + '\'' +
            ", fechaInicio=" + fechaInicio +
            ", fechaFin=" + fechaFin +
            ", salario=" + salario +
            ", departamento='" + departamento + '\'' +
            ", jefe=" + jefe +
            '}';
  }
}
