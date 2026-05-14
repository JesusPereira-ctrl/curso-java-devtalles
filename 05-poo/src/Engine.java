public class Engine {
    public void start() {
        System.out.println("motor encendido");
    }

    public void start(boolean silentMode) {
        if (silentMode) {
            System.out.println("Esta encendido en modo silencioso");
        } else {
            System.out.println("Encendido el vehiculo");
        }
    }
}
