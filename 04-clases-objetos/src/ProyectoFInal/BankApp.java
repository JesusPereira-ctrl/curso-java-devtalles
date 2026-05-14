package ProyectoFInal;

import java.util.Scanner;

public class BankApp {
    private BankAccount account;
    private Scanner scanner;

    public BankApp(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        int option;
        do {
            displayMenu();
            option = getUserOption();
            processOption(option);
        } while (option != 4);
    }

    private void displayMenu() {
        System.out.println("\nSeleccionar opciones");
        System.out.println("1 - Depositar dinero");
        System.out.println("2 - Retirar dinero");
        System.out.println("3 - Mostrar saldo");
        System.out.println("4 - Salir");
    }

    private int getUserOption() {
        return scanner.nextInt();
    }

    private void handleDeposit() {
        System.out.println("Ingrese el monto a depositar");
        double deposito = scanner.nextDouble();
        account.deposit(deposito);
    }

    private void handleWithdraw() {
        System.out.println("Ingrese el monto a retirar");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
    }

    private void processOption(int option) {
        switch (option) {
            case 1: {
                handleDeposit();
                break;
            }
            case 2: {
                handleWithdraw();
                break;
            }
            case 3: {
                account.displayBalance();
                break;
            }
            case 4: {
                System.out.println("gracias por utilizar la aplicación");
                break;
            }
            default: {
                System.out.println("Opción incorrecta");
                break;
            }
        }
    }
}
