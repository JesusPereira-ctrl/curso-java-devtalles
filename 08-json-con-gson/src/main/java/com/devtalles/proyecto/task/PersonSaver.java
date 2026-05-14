package com.devtalles.proyecto.task;

import com.devtalles.proyecto.Person;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class PersonSaver {
    public static void main() {
        Person person1 = new Person(
                "Fernando",
                30,
                true,
                Arrays.asList("Correr", "Crear contenido", "Estudiar")
        );

        Person person2 = new Person(
                "Teddy",
                30,
                true,
                Arrays.asList("Correr", "Caminar", "Tenis")
        );

        List<Person> peoples = Arrays.asList(person1, person2);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter("person.json")) {
            gson.toJson(peoples, writer);
            System.out.println("Lista de personas guardadas correctamente");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
