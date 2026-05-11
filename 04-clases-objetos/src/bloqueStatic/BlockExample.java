package bloqueStatic;

public class BlockExample {
    public static void main(String[] args) {
        System.out.println("Hola mundo...");
    }

    static {
        System.out.println("Bloque estático ejecutado...");
    }
}
