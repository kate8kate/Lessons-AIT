package com.company;

public class Programmer {

    private Person person;
    private String[] listOfTechnologies;


    public Programmer(Person person, String[] listOfTechnologies) {
        this.person = person;
        this.listOfTechnologies = listOfTechnologies;
    }

    public Programmer(Person person, String listOfTechnologies) {
        this.person = person;
        this.listOfTechnologies = listOfTechnologies.split(",");
    }

    public Programmer(String firstName, String lastName, String[] listOfTechnologies) {
        this.person = new Person(firstName, lastName);
        this.listOfTechnologies = listOfTechnologies;

    }

    public Programmer(String personName, String[] listOfTechnologies) {
        this.person = new Person(personName);
        this.listOfTechnologies = listOfTechnologies;

    }

    public String listOfTechnologiesToString() {
        return String.join(",", listOfTechnologies); //метод для объединения массива в строку

    }

    public String toString() {

        return person + " (" + listOfTechnologiesToString() + ")";
    }

    public Person getPerson() {
        return person;
    }

    public boolean isSkilled(String tech) {
        for (String findTech : listOfTechnologies) {
            if (tech.equals(findTech)) {
                return true;
            }
        }
        return false;
    }
}

