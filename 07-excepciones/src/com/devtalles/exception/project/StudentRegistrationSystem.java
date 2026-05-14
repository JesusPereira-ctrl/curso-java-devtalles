package com.devtalles.exception.project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentRegistrationSystem {

    private List<Student> students;

    public StudentRegistrationSystem() {
        this.students = new ArrayList<>();
    }

    public void registerStudent(String name, int age, String id) throws DuplicateStudentException {
        validateStudentData(name, age, id);

        if (isStudentRegistered(id)) {
            throw new DuplicateStudentException("El estudiante que intenta registrar ya existe");
        }

        this.students.add(new Student(name, age, id));

        System.out.println("Usuario registrado correctamente");
    }

    public void removeStudent(String id) throws StudentNotFoundException {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("El id no puede estar vacío");
        }

        Iterator<Student> iterator = this.students.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getId().equals(id)) {
                iterator.remove();
                System.out.println("El estudiante fue eliminado");
                return;
            }
        }

        throw new StudentNotFoundException("El estudiante no existe");
    }

    public boolean isStudentRegistered(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public void validateStudentData(String name, int age, String id) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }

        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("El id no puede estar vacío");
        }

        if (age < 17 || age > 100) {
            throw new IllegalArgumentException("La edad tiene que estar entre 17 y 100");
        }

        if (!id.matches("^[A-Z]\\d{5}$")) {
            throw new IllegalArgumentException("El id no cumple con un id de estudiante");
        }
    }

    public static void main() {
        StudentRegistrationSystem system = new StudentRegistrationSystem();

        try {
            system.registerStudent("Horacio, Perez", 25, "A12345");
        } catch (Exception e) {
            System.out.println("Error, " + e.getMessage());
        }

        try {
            system.registerStudent("Horacio, Garcia", 15, "A12345");
        } catch (Exception e) {
            System.out.println("Error, " + e.getMessage());
        }

        try {
            system.registerStudent("Gabriel, Garcia", 25, "12345");
        } catch (Exception e) {
            System.out.println("Error, " + e.getMessage());
        }

        try {
            system.registerStudent("Gabriel, Fernandez", 25, "A12345");
        } catch (Exception e) {
            System.out.println("Error, " + e.getMessage());
        }

        try {
            system.removeStudent("A99999");
        } catch (StudentNotFoundException e) {
            System.out.println("Redireccionar al usuario para corregir el error");
        } catch (Exception e) {
            System.out.println("Error, inesperado " + e.getMessage());
        }
    }
}
