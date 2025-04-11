package Polimorfismo.Ejercicio9;


public class Minecraft {
    public static void main(String[] args) {
       
        BloqueCofre cofre1 = new BloqueCofre(27, 5);
        BloqueCofre cofre2 = new BloqueCofre(9, 3);

        BloqueTnt tnt1 = new BloqueTnt("Normal", 80);
        BloqueTnt tnt2 = new BloqueTnt("Mega", 150);

        BloqueHorno horno1 = new BloqueHorno("Gris", 3);
        BloqueHorno horno2 = new BloqueHorno("Blanco", 5);

        System.out.println("--- Acciones de los bloques ---");
        
        cofre1.accion();
        cofre2.accion();
        tnt1.accion();
        tnt2.accion();
        horno1.accion();
        horno2.accion();

        System.out.println("\n--- Colocación de los bloques ---");
        
        cofre1.colocar();
        tnt1.colocar("Pared");
        horno1.colocar("Suelo");
        cofre2.colocar("Techo");

        System.out.println("\n--- Rompiendo los bloques ---");
        
        cofre1.romper();
        cofre2.romper();
        tnt1.romper();
        tnt2.romper();
        horno1.romper();
        horno2.romper();
    }
}