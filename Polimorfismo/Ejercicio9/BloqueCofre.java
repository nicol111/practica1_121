package Polimorfismo.Ejercicio9;


public class BloqueCofre extends Bloque {
    int capacidad;
    int resistencia;

    public BloqueCofre(int capacidad, int resistencia) {
        super("Cofre");
        this.capacidad = capacidad;
        this.resistencia = resistencia;
    }

    @Override
    public void accion() {
        System.out.println("Se abrió el cofre. Capacidad: " + capacidad + ".");
    }

    @Override
    public void romper() {
        System.out.println("El cofre se rompió y dejó caer algunos objetos.");
    }
}
