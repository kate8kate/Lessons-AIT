package com.company;

public class Person {

   private  String firstName;
   private  String lastName;

    public Person(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public Person(String name){
        String[] splitName= name.split(" ");
        this.firstName=splitName[0];
        this.lastName=splitName[1];
    }
    public String toString(){
        return "Name: " + firstName +" "+lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
