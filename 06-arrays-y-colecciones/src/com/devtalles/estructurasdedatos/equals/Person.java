package com.devtalles.estructurasdedatos.equals;

import java.util.Objects;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return Objects.equals(name, person.name);
    }

    public static void main() {
        Person person1 = new Person("Juan");
        Person person2 = new Person("Maria");

        System.out.println(person2.equals(person1));
    }
}
