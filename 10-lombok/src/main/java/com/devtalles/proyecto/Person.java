package com.devtalles.proyecto;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Person {

    String name;
    int age;
    String lastName;
}
