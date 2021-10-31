package com.company;

import java.util.Objects;

enum  Color {
    green,
    black,
    blue,
    yellow
}

public class Glasses {
    private String brand;
    private Color color;
    private double dioptres;

    Glasses(){}

    Glasses(String brand) {
        this.brand = brand;
    }

    Glasses(String brand, Color color, double dioptres) {
        this.brand = brand;
        this.color = color;
        this.dioptres = dioptres;
    }

    public String getBrand() {
        return brand;
    }

    public Color getColor() {
        return color;
    }

    public double getDioptres() {
        return dioptres;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setDioptres(double dioptres) {
        this.dioptres = dioptres;
    }

    @Override
    public String toString() {
        return "Glasses{" +
                "brand='" + brand + '\'' +
                ", color=" + color +
                ", dioptres=" + dioptres +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Glasses glasses = (Glasses) o;
        return Double.compare(glasses.dioptres, dioptres) == 0 && Objects.equals(brand, glasses.brand) && color == glasses.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, color, dioptres);
    }

    public void  color(){
        switch (color){
            case blue:
                System.out.println("These glasses are blue\n");
                break;
            case green:
                System.out.println("These glasses are green\n");
                break;
            case black:
                System.out.println("These glasses are black\n");
                break;
            case yellow:
                System.out.println("These glasses are yellow\n");
                break;
        }
    }

    public void vision(){
        if (dioptres < 0){
            System.out.println("Glasses for a person with myopia");
        } else if (dioptres > 0){
            System.out.println("Glasses for a person with farsightedness");
        } else
            System.out.println("Glasses without increase or decrease");
    }
}
