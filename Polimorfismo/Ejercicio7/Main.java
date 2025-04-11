package Polimorfismo.Ejercicio7;

class Animal {
    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("Sonido genérico de animal");
    }

    public void moverse() {
        System.out.println("Movimiento genérico de animal");
    }
}

class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("¡Guau!");
    }

    @Override
    public void moverse() {
        System.out.println("Corre");
    }
}

class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("¡Miau!");
    }

    @Override
    public void moverse() {
        System.out.println("Camina y salta");
    }
}

class Pajaro extends Animal {
    public Pajaro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("¡Pío pío!");
    }

    @Override
    public void moverse() {
        System.out.println("Vuela");
    }
}

public class Main {
    public static void main(String[] args) {
    
        Perro miPerro = new Perro("Buddy");
        Gato miGato = new Gato("Whiskers");
        Pajaro miPajaro = new Pajaro("Tweety");

        System.out.println("Sonidos de los animales:");
        miPerro.hacerSonido();
        miGato.hacerSonido();
        miPajaro.hacerSonido();

        System.out.println("\nMovimientos de los animales:");
        miPerro.moverse();
        miGato.moverse();
        miPajaro.moverse();
    }
}
