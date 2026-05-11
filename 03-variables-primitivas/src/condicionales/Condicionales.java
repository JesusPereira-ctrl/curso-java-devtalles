package condicionales;

public class Condicionales {
    public static void main(String[] args) {
        int age = 19;
        double average = 7.5;

        boolean isAdult = age > 16;
        boolean hasPassingGrade = average >= 7;

        if (isAdult && hasPassingGrade) {
            System.out.println("El estudiante cumple con todos los requisitos");
        }

        if (isAdult == false) {
            System.out.println("Es menor");
        }

        // Comentarios
        /*
        int day = 30;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("El dato ingresado no es valido");
        }*/
    }
}
