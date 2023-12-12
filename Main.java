package com.company;

// Реализовать класс в котором в качестве NamesHandler. В нем должно быть одно поле String[] names -
// которое содержит массив имен. Реализовать два конструктора
//
//конструктор, который принимает массив с именами
//конструктор, который принимает строку, разделенную ','
//Реализовать следующие методы:
//
//toString
//toStringByLength - все имена на заданной длинны
//toStringByStartWith - все имена начинающиеся на заданный символ
public class Main {

    public static void main(String[] args) {

        String[] names = new String[]{"Peter", "John", "Ivan", "Lena", "Paul"};

        NamesHandler handler1 = new NamesHandler(names) ;
        NamesHandler handler2 = new NamesHandler("Peter,John,Ivan");

        System.out.println(handler1);
        System.out.println(handler2);

        System.out.println(handler2.toStringByLength(3));

        System.out.println(handler2.toStringByStartWith('I'));
    }

}
