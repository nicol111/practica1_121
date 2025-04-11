package Polimorfismo.Ejercicio9;

public class Bloque {
    String tipo;

    public Bloque(String tipo) {
        this.tipo = tipo;
    }

    public void accion() {
        System.out.println("Acción genérica del bloque.");
    }

    public void colocar() {
        System.out.println("Bloque colocado en el suelo.");
    }

    public void colocar(String orientacion) {
        System.out.println("Bloque colocado en orientación: " + orientacion);
    }

    public void romper() {
        System.out.println("Bloque roto.");
    }
}
