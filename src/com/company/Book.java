package com.company;

public class Book {

    int number;
    String title;
    String author;
    int year;

    public Book (int number, String title, String author, int year){
        this.number=number;
        this.title=title;
        this.author=author;
        this.year=year;
    }
    public String toString() {
        return "Книга " + number+ " [Название:'"+ title + '\''+ ", автор:" +author+", дата публикации:'"+year+'\''+']';
    }
public boolean temp (String str){
    return title.length() > str.length();
}
}
