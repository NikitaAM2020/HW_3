package com.company;

public class Dog {
    private String name;
    private String breed;
    private int age;
    public static int countOfCreatedDogs;

    public Dog(String name,String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
        Dog.countOfCreatedDogs = Dog.countOfCreatedDogs++;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
