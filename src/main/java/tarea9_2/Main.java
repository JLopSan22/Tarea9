package tarea9_2;

import tarea9_1.Circulo;
import tarea9_1.Forma;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Persona persona1=new Persona();
        PuestoTrabajo programador=new PuestoTrabajo("Programador JS", LocalDate.of(2022,05,15), LocalDate.of(2025,05,15), 2000, "Informática", persona1);
        PuestoTrabajo gestorSistemas =new PuestoTrabajo("Gestor de Sistemas", LocalDate.of(2017,05,15), LocalDate.of(2022,05,15), 1100, "Informática", persona1);
        ArrayList<PuestoTrabajo> listaTrabajos = new ArrayList<>();
        listaTrabajos.add(programador);
        listaTrabajos.add(gestorSistemas);
        Persona persona2=new Persona("Juan", "Lopera", "Sánchez", LocalDate.of(2004,01,21), 'M', 1, listaTrabajos);
    }
}