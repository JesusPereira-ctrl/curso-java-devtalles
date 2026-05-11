package ProyectoFInal;

import java.util.Scanner;

public class BankApp {
    private BankAccount account;
    private Scanner scanner;

    public BankApp(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }
}
