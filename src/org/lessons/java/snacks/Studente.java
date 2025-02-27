package org.lessons.java.snacks;

public class Studente {
    private String name;
    private String surname;
    private int age;

    public Studente(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String details() {
        return this.name + " " + this.surname + ", " + this.age + " anni";
    }

}
