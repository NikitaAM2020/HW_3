package com.company;

public class Main {

    public static void main(String[] args) {
        Person[] person = new Person[5];
	    person[0]= new Person("Alex",2002);
        person[1] = new Person("Tim",2008);
        person[2] = new Person("Max",1999);
        person[3] = new Person("Nik",1995);
        person[4] = new Person("Bill",2002);
        for(int i = 0; i < person.length; i++){
            person[i].personInfo();
            System.out.println();
        }
    }
}
