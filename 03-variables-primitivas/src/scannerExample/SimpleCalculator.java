package scannerExample;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = getNumbers(scanner, "Ingrese el primer numero");

        int second = getNumbers(scanner, "Ingrese el segundo numero");

        printArithmeticOperations(first, second);

        compareNumber(first, second);

        System.out.println("Fin de la aplicación");

        scanner.close();
    }

    public static int getNumbers(Scanner scanner, String message) {
        System.out.println(message);
        int number = scanner.nextInt();
        return number;
    }

    public static void printArithmeticOperations(int firstNumber, int secondNumber) {
        System.out.println("La suma de a + b = " + (firstNumber + secondNumber));
        System.out.println("La diferencia de a - b = " + (firstNumber - secondNumber));
    }

    public static void compareNumber(int first, int second) {
        if (first > second) {
            System.out.println("El primer numero es mayor");
        } else {
            System.out.println("El segundo numero es mayor o igual");
        }
    }
}
