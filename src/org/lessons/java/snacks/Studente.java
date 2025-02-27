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
        if (this.name != null && this.name.length() > 0 && this.surname != null && this.surname.length() > 0 && this.age > 0) {
            return this.name + " " + this.surname + ", " + this.age + " anni";
        } else {
            return "I dati dello studente sono incompleti";
        }
    }

}
