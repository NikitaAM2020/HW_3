package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть перше число з плаваючою комою: ");
        float f1 = in.nextFloat();
        if (f1 >=-5 && f1 <=5 ){
            System.out.println("Перше число входить у проміжок [-5;5]");
        } else System.out.println("Перше число не входить у проміжок [-5;5]");
        System.out.print("Введіть друге число з плаваючою комою: ");
        float f2 = in.nextFloat();
        if (f2 >=-5 && f2 <=5 ){
            System.out.println("друге число входить у проміжок [-5;5]");
        } else System.out.println("друге число не входить у проміжок [-5;5]");
        System.out.print("Введіть трете число з плаваючою комою: ");
        float f3 = in.nextFloat();
        if (f3 >=-5 && f3 <=5 ){
            System.out.println("трете число входить у проміжок [-5;5]");
        } else System.out.println("трете число не входить у проміжок [-5;5]");

        System.out.println("Перевірка трьох чисел на max i min\n");
        System.out.println("Введіть перше число: ");
        int z1 = in.nextInt();
        System.out.println("Введіть друге число: ");
        int z2 = in.nextInt();
        System.out.println("Введіть трете число: ");
        int z3 = in.nextInt();
        if (z1 >= z2 && z1 >= z3) {
            System.out.println(z1 + " - max число");
        }  else if (z2 >= z1 && z2 >= z3){
            System.out.println(z2 + " - max число");
        } else System.out.println(z3 + " - max число");
        if (z1 <= z2 && z1 <= z3) {
            System.out.println(z1 + " - min число");
        }  else if (z2 <= z1 && z2 <= z3){
            System.out.println(z2 + " - min число");
        } else System.out.println(z3 + " - min число");

        System.out.println("Введіть номер помилки у діапазоні від 400 до 417: ");
        int error = in.nextInt();
        switch (error){
            case 400:
                System.out.println("Error " + error + "- Bad Request");
                break;
            case 401:
                System.out.println("Error " + error + " - Unauthorized");
                break;
            case 402:
                System.out.println("Error " + error + " - Payment Required");
                break;
            case 403:
                System.out.println("Error "+ error +" - Forbidden");
                break;
            case 404:
                System.out.println("Error "+ error +" - Not Found");
                break;
            case 405:
                System.out.println("Error "+ error +" - Method Not Allowed");
                break;
            case 406:
                System.out.println("Error "+ error +" - Not Acceptable");
                break;
            case 407:
                System.out.println("Error "+ error +" - Proxy Authentication Required");
                break;
            case 408:
                System.out.println("Error "+ error +" - Request Timeout");
                break;
            case 409:
                System.out.println("Error "+ error +" - Conflict");
                break;
            case 410:
                System.out.println("Error "+ error +" - Gone");
                break;
            case 411:
                System.out.println("Error "+ error +" - Length Required");
                break;
            case 412:
                System.out.println("Error "+ error +" - Precondition Failed");
                break;
            case 413:
                System.out.println("Error "+ error +" - Request Entity Too Large");
                break;
            case 414:
                System.out.println("Error "+ error +" - Request-URI Too Long");
                break;
            case 415:
                System.out.println("Error "+ error +" - Unsupported Media Type");
                break;
            case 416:
                System.out.println("Error "+ error +" - Requested Range Not Satisfiable");
                break;
            case 417:
                System.out.println("Error "+ error +" - Expectation Failed");
                break;
        }

        Dog dogOne = new Dog("Alex","English Mastiff" ,8);
        Dog dogTwo = new Dog("Bob","Beagle",3);
        Dog dogThree = new Dog("Mig","Yorkie", 1);
        System.out.println(dogOne);
        System.out.println(dogTwo);
        System.out.println(dogThree);

    }
}
