package Polimorfismo.Ejercicio9;
import java.util.Random;

public class BloqueTnt extends Bloque {
    String tipoTnt;
    int daño;

    public BloqueTnt(String tipoTnt, int daño) {
        super("TNT");
        this.tipoTnt = tipoTnt;
        this.daño = daño;
    }

    @Override
    public void accion() {
        System.out.println("¡BOOM! La TNT de tipo " + tipoTnt + " explotó, causando " + daño + " de daño.");
    }

    @Override
    public void romper() {
        System.out.println("Se intentó romper la TNT. ¡Cuidado, podría explotar!");
        Random random = new Random();
        if (random.nextBoolean()) {
            System.out.println("¡La TNT explotó al romperse!");
            accion();
        } else {
            System.out.println("La TNT se rompió sin explotar.");
        }
    }
}