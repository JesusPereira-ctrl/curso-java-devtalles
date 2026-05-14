package com.devtalles.exception.errorsimulation;

public class ErrorSimulation {
    public static void main() {

        try {
            simulatorError();
        } catch (Exception e) {
            System.out.println("Error detectado: " + e.getMessage());
            System.out.println("Detalles del error:");
            e.printStackTrace();
        }

    }

    public static void simulatorError() {
        causeError();
    }

    public static void causeError() {
        throw new RuntimeException("Error critico en la aplicación");
    }
}
