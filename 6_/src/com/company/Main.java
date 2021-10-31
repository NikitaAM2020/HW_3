package com.company;

public class Main {

    public static void main(String[] args) {
        Glasses glasses1 = new Glasses("MAX MARA", Color.black, -0.5);
        Glasses glasses2 = new Glasses("RODENSTOCK", Color.yellow, +1);
        Glasses glasses3 = new Glasses("MAX MARA", Color.green, 0);

        glasses1.toString();
        glasses2.toString();
        glasses3.toString();


        System.out.println("Glasses №1 for farsightedness or myopia?");
        glasses1.vision();
        System.out.println("Glasses №3 for farsightedness or myopia?");
        glasses3.vision();

        System.out.println("What color are the second glasses?");
        glasses2.color();

        System.out.println("Glasses 1 and 3 of the same color?");
        if (glasses1.equals(glasses3)){
            System.out.println("Yes");
        } else System.out.println("No");

    }
}
