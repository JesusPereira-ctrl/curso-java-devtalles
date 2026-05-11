package Strings;

public class ExampleString {
    public static void main(String[] args) {
        String name = "Gabriel";
        String name2 = "Gabriel";

        System.out.println(name == name2);

        String name3 = new String("Gabriel");

        System.out.println(name3 == name);

        System.out.println(name.toUpperCase());

        System.out.println(name);

        Person person = new Person("Gabriel", "Chaldu");
        System.out.println(person.toString());
    }
}
