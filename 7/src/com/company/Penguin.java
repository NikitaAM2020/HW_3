package com.company;

public class Penguin extends NonFlyingBird{
    private String name;

    Penguin(boolean feathers, boolean layEggs, String name) {
        super(feathers, layEggs);
        this.name = name;
    }

    @Override
    public void output() {
        System.out.printf("The bird is %s \nHas it got feathers? %s \nDoes it lay eggs? %s \n", name, super.isFeathers(), super.isLayEggs());
    }
}

