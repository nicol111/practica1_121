package Polimorfismo.Ejercicio9;

public class BloqueHorno extends Bloque {
    String color;
    int capacidadComida;

    public BloqueHorno(String color, int capacidadComida) {
        super("Horno");
        this.color = color;
        this.capacidadComida = capacidadComida;
    }

    @Override
    public void accion() {
        System.out.println("Se interactuó con el horno de color " + color + ". Capacidad de comida: " + capacidadComida + ".");
    }

    @Override
    public void romper() {
        System.out.println("El horno se rompió y dejó caer algunos ladrillos.");
    }
}