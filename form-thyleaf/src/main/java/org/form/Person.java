package org.form;

public class Person {
    private String name;
    private String surname;
    private String patronym;

    public Person(String name, String surname, String patronym) {
        this.name = name;
        this.surname = surname;
        this.patronym = patronym;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronym() {
        return patronym;
    }

    public void setPatronym(String patronym) {
        this.patronym = patronym;
    }
}