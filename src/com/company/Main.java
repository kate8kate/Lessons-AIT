package com.company;

public class Main {

    public static void main(String[] args) {

       Book[] arr= {new Book(1,"Чистый код","Роберт Мартин",2008),
                    new Book(2,"Совершенный код", "Стив Макконнелл", 1993),
                    new Book(3,"Программист-прагматик", "Дейв Томас и Энди Хант", 1999) };

        Library library = new Library(10);

        library.addBook(new Book(1,"Чистый код","Роберт Мартин",2008));


        System.out.println(library);


        }
    }

