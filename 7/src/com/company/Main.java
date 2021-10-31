package com.company;

public class Main {

    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Swallow(true, true, "swallow");
        birds[1] = new Eagle(true, true, "eagle");
        birds[2] = new Penguin(true, true, "penguin");
        birds[3] = new Chicken(true, true, "chicken");
        for (Bird bird : birds) {
            bird.output();
            bird.fly();
            System.out.println();
        }
    }
}
