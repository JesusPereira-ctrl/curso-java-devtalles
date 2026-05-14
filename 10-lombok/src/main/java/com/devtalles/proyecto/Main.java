package com.devtalles.proyecto;

public class Main {
    public static void main(String[] args) {

        Person person = Person.builder().name("Gabriel").age(22).lastName("Chaldu").build();
        System.out.println(person);
    }
}
