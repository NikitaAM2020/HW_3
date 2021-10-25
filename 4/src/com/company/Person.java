package com.company;

import java.util.Calendar;

public class Person {
    private String name;
    private int birthYear;
    public static int countOfCreatedPersons;

    public Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
        Person.countOfCreatedPersons = Person.countOfCreatedPersons ++;
    }

    public Person(){}

    public int getBirthYear() {
        return birthYear;
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", birthYear=" + birthYear +
//                '}';
//    }

    public void setBirthYear(int birthYear) { this.birthYear = birthYear; }
    public void сhangeName(String name) { this.name = name; }
    public int age(){
        Calendar cal = Calendar.getInstance();
        int age = cal.get(Calendar.YEAR) - birthYear;
        return age;
    }
    //output метод, виводить інформацію про обєкт
    public void personInfo(){
        System.out.println("Hi, I'm "+ name + " and my age "+ age());
    }
}
