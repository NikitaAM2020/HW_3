package com.company;

public abstract class Bird {
    private boolean feathers;
    private boolean layEggs;

    public boolean isFeathers() {
        return feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }
    public abstract void fly();
    public abstract void output();
}
