package com.company;

//Давайте создадим класс Programmer. Он будет состоять из следующих полей { Person person, String[] listOfTechnologies }
//Класс Person содержит всего два поля { String firstName, String lastName }. Необходимо реализовать конструкторы таким образом, что бы Programmer можно было создать:
//
//используя объект person и массив технологий: new Programmer(person, new String[]{"Java","Spring Boot","SQL"})
//используя объект person и строке со списком технологий через запятую: new Programmer(person, "Java,Spring Boot,SQL")
//используя строку firstName, строку lastName и массив технологий: new Programmer("Jack" "Johnson", new String[]{"Java","Spring Boot","SQL"})
//используя строку ФИО (firstName и lastName разделены пробелом) массив технологий: new Programmer("Jack Johnson", new String[]{"Java","Spring Boot","SQL"})
//Необходимо создать массив Programmer и вывести его на экран.

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Jack", "Jones");

        String[] listOfTechnologies = new String[]{"Java", "Spring Boot", "SQL"};


        Person person2 = new Person("Ivan", "Ivanov");
        Programmer programmer = new Programmer(person1, listOfTechnologies);
        System.out.println(programmer);

        Programmer programmer2 = new Programmer(person2, "Java, Spring Boot, SQL");
        System.out.println(programmer2);

        Programmer programmer3 = new Programmer("Lena", "Jones", new String[]{"Java", "Spring Boot", "SQL"});
        System.out.println(programmer3);

        Programmer programmer4 = new Programmer("Peter Jones", new String[]{"Java", "Spring Boot", "SQL"});

        System.out.println(programmer4);

        Programmer[] programmers = new Programmer[]{programmer, programmer2, programmer3, programmer4};

        for (Programmer p : programmers) {
            System.out.println(p);
        }
        printByName(programmers, "Ivan");
        printByTech(programmers, "Java");

        /* Реализовать метод который в массиве программистов находить программистов со знанием заданной
        технологии (например, всех кто знает Java) и выводит на экран */

    }

    public static void printByName(Programmer[] programmers, String name) {
        for (Programmer p : programmers) {
            if (p.getPerson().getFirstName().equals("Ivan")) {
                System.out.println(p);

            }
        }
    }

    public static void printByTech(Programmer[] programmers, String tech) {
        for (Programmer p : programmers) {
            if (p.getPerson().getFirstName().equals("Ivan")) {
                System.out.println(p);

            }
        }
    }
}