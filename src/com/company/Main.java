package com.company;

public class Main {

    public static void main(String[] args) {

        MyDate date1 = new MyDate(1,5,2005);

        MyDate date2 = new MyDate(5,10,2015);

        MyDate date3 = new MyDate(1,11,2017);

        MyDate [] dates = {date1, date2, date3};

       for (MyDate date : dates){
           System.out.println(date.toString());
           
       }

       Person person1 = new Person("Jack", "Smith", date1);
       Person person2 = new Person("Egor", "Ivanov", date2);
       Person person3 = new Person ("Lena", "Smith", date3);

       Person [] people = {person1, person2, person3};

        for (Person person : people){

            System.out.println(person.toString());

        }

    }

    }


