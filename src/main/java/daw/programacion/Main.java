package daw.programacion;

public class Main {
    public static void main(String[] args) {
        Forma circulo = new Circulo(12.2);
        circulo.setColor("azul");
        System.out.println(circulo.getColor());
    }
}