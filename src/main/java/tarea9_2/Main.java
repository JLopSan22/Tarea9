package tarea9_2;

import tarea9_1.Circulo;
import tarea9_1.Forma;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona persona1=new Persona();
        PuestoTrabajo programador=new PuestoTrabajo("Programador JS", LocalDate.of(2022,05,15), LocalDate.of(2025,05,15), 2000, "Informática", persona1);
        PuestoTrabajo gestorSistemas =new PuestoTrabajo("Gestor de Sistemas", LocalDate.of(2017,05,15), LocalDate.of(2022,05,15), 1100, "Informática", persona1);
        Persona persona2=new Persona("Juan", "Lopera", "Sánchez", LocalDate.of(2004,01,21), 'M', 1, gestorSistemas);
        System.out.println("Puesto antiguo: "+persona2.getPuesto());
        persona2.setPuesto(programador);
        System.out.println("Puesto nuevo: "+persona2.getPuesto());
    }
}