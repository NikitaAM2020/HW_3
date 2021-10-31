package com.company;

public class FlyingBird extends Bird {
    FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("The bird can fly");
    }

    @Override
    public void output() {

    }
}
