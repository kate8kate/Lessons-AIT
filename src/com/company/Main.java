package com.company;

public class Main {

    public static void main(String[] args) {



        String str1 ="Java world is very interest!";
        String res1 = str1.substring(5,18);
        System.out.println( res1 );


        res1= str1.substring(0, str1.length()-3);
        System.out.println(str1);
        System.out.println(res1);
        res1= str1.substring(3, str1.length()-3);
        System.out.println("   " + res1);
        res1 = str1.substring(str1.length()-3);
        System.out.println(res1);
        res1= str1.substring(0,3) + str1.substring(str1.length()-3);
        System.out.println(res1);

    //    System.out.println("A".repeat(10));
        String str3="";
        for(int j=0; j<10; j++){
            str3 = str3 +"A";
        }
        System.out.println(str3);
        System.out.println("---------------------------------------------");
        str1="ja";
        //res1= str1.substring(0, (str1.length()>3 ? str1.length()-3 : str1.length()) );
        res1= str1.length()>3 ?  str1.substring(0, str1.length()-3) : str1;
        System.out.println(res1);
        System.out.println("--------------------------------------------");




    }

    }

