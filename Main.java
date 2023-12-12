package com.company;

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
