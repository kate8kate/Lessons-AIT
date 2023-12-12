package com.company;


public class Library {

    private Book[] books;
    private int libraryCapacity;
    private int size = 0;

    public Library(int libraryCapacity) {

        this.books = new Book[libraryCapacity];
    }

    public void addBook(Book book) {
        if (size < books.length) {
            books[size] = book;
            size++;
        }
    }

    public String toString() {

        String result = " ";
        /*
        for (int i=0; i<size && i<books.lenfth; i++){
        Book book = books[i];
        }
         */
        for (Book book : books) {
            if (book == null) {
                break;
            }
            result += book + "\n";
        }
        return result;

    }

    public int getSize() {

        return size;
    }
}
