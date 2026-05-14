package com.devtalles.estructurasdedatos.set.hashset;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Person {
    private String name;
    private String dni;

    public Person(String name, String dni) {
        this.name = name;
        this.dni = dni;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Person person = (Person) object;
        return Objects.equals(dni, person.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    public static void main() {
        Set<Person> persons = new HashSet<>();
        Person person1 = new Person("Maria", "123");
        Person person2 = new Person("Ana", "456");
        Person person3 = new Person("Ana2", "456");
        Person person4 = null;

        // Create
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);

        // Read or List
        System.out.println(persons);

        for (Person person : persons) {
            if (person != null) {
                System.out.println(person.name);
            } else {
                System.out.println(person);
            }
        }

        // Delete
        persons.remove(person2);

        System.out.println(persons);

        // Update
        persons.add(person3);

        System.out.println(persons);
    }
}
