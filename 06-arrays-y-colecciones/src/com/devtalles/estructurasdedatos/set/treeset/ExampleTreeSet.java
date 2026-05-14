package com.devtalles.estructurasdedatos.set.treeset;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExampleTreeSet {
    public static void main() {
        Set<Integer> numbers = new TreeSet<>();

        List<String> nombres = new ArrayList<>();
        nombres.add("Jesus");
        nombres.add("Pedro");
        nombres = nombres.stream().filter((nombre) -> nombre.equals("Jesus")).toList();
        System.out.println(nombres);

        numbers.add(10);
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);

        System.out.println(numbers);

        numbers.remove(3);

        System.out.println("numbers = " + numbers);

        numbers.remove(1);
        numbers.add(90);

        System.out.println(numbers);

        System.out.println(numbers.contains(50));
    }
}
