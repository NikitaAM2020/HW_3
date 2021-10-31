package com.company;

public class NonFlyingBird extends Bird {
    NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("The bird cannot fly");
    }

    @Override
    public void output() {

    }
}
