package com.company;

import java.io.PrintStream;

public class Chicken extends NonFlyingBird{
    private String name;
    Chicken(boolean feathers, boolean layEggs, String name) {
        super(feathers, layEggs);
        this.name = name;
    }
    @Override
    public void output() {
        PrintStream printf = System.out.printf("The bird is %s \nHas it got feathers? %s \nDoes it lay eggs? %s \n", name, super.isFeathers(), super.isLayEggs());
    }
}
