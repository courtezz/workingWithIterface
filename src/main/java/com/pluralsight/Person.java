package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;



    // Constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    // Override toString() method to print object details
    @Override
    public String toString() {
        return firstName + " " + lastName + " (Age: " + age + ")";
    }
    public static void main(String[] args) {
        // Create an ArrayList of Person objects
        List<Person> myFamily = new ArrayList<>();
        myFamily.add(new Person("Dana", "Wyatt", 63));
        myFamily.add(new Person("Zachary", "Westly", 31));
        myFamily.add(new Person("Elisha", "Aslan", 14));
        myFamily.add(new Person("Ian", "Auston", 16));
        myFamily.add(new Person("Zephaniah", "Hughes", 9));
        myFamily.add(new Person("Ezra", "Aiden", 17));
        // Sort the list by last name using compareTo method
Collections.sort(myFamily);
        // Display the sorted list
        System.out.println("Sorted list by last name:");
        for (Person person : myFamily) {
            System.out.println(person);

        }

    }

    @Override
    public int compareTo(Person other) {
        return this.lastName.compareTo(other.lastName)
;    }
}
