package lab2;

import com.google.gson.Gson;

public class Lab2 {
    public static void main(String[] args) {
        Person person1 = new Person("Vadim", 21);
        Person person2 = new Person("Vadim", 21);
        Person person3 = new Person("Vlada", 19);

        Gson gson = new Gson();

        String jsonPerson1 = gson.toJson(person1);
        String jsonPerson2 = gson.toJson(person2);
        String jsonPerson3 = gson.toJson(person3);

        System.out.println("\nPersons in converted to JSON: \n");
        System.out.println(jsonPerson1);
        System.out.println(jsonPerson2);
        System.out.println(jsonPerson3);
        System.out.println("\n*************\n");

        Person fromJsonPerson1 = gson.fromJson(jsonPerson1, Person.class);
        Person fromJsonPerson2 = gson.fromJson(jsonPerson2, Person.class);
        Person fromJsonPerson3 = gson.fromJson(jsonPerson3, Person.class);

        System.out.println("Persons from JSON: \n");
        System.out.println(fromJsonPerson1.toString());
        System.out.println(fromJsonPerson2.toString());
        System.out.println(fromJsonPerson3.toString());
        System.out.println("\n*************\n");

        System.out.println(person1.equals(fromJsonPerson1));
        System.out.println(person2.equals(fromJsonPerson2));
        System.out.println(person2.equals(fromJsonPerson3));
    }
}
