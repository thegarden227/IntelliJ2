package com.joy.model;

import java.util.StringJoiner;

public class Person {

    private String firstName;
    private String lastName;
    private int age;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .add("age=" + age)
                .toString();
    }
}
